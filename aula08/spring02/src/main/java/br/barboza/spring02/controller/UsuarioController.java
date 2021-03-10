package br.barboza.spring02.controller;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.barboza.spring02.dto.UsuarioDTO;
import br.barboza.spring02.model.Compra;
import br.barboza.spring02.model.Usuario;
import br.barboza.spring02.repository.UsuarioRepo;

@RestController
@CrossOrigin("*") // requisições de qq origem
@RequestMapping("/user")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepo repo;

    @GetMapping("/id/{id}") // {id} é o nome da variavel
    public ResponseEntity<UsuarioDTO> obterUsuarioPorId(@PathVariable int id) {
        Usuario usuarioEncontrado = repo.findById(id).orElse(null); //findByid busaca pela chave primaria

        if(usuarioEncontrado != null) {
            UsuarioDTO userDTO = new UsuarioDTO(usuarioEncontrado);
            return ResponseEntity.ok(userDTO); // ok = 200
        }

        return ResponseEntity.notFound().build(); //notFound = 404

    }

    @GetMapping("/compras/{id}") // {id} variavel
    public ResponseEntity<List<Compra>> obterComprasDoUsuario(@PathVariable int id) {
        Usuario usuarioEncontrado = repo.findById(id).orElse(null); //findByid busaca pela chave primaria

        if(usuarioEncontrado != null) {
            List<Compra> compras = usuarioEncontrado.getCompra();
            for (Compra compra : compras) {
                compra.setUsuario(null);
            }
              return ResponseEntity.ok(compras); // ok = 200
        }

        return ResponseEntity.notFound().build(); //notFound = 404

    }


    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> lista = (List<Usuario>) repo.findAll();

        return ResponseEntity.ok(lista);
    }

        @PostMapping("/login")
        public ResponseEntity<UsuarioDTO> login(@RequestBody Usuario user) {
            Usuario userFound = repo.findByEmailOrCpf(user.getEmail(), user.getCpf());

            if(userFound != null) {
                if (user.getSenha().equals(userFound.getSenha())) {
                UsuarioDTO userDto = new UsuarioDTO(userFound);
                return ResponseEntity.ok(userDto);
            }
        }
            return ResponseEntity.status(404).build(); //notFound
    }

    /*    @PostMapping("/loginemail")
        public ResponseEntity<Usuario> loginByEmail(@RequestBody Usuario user) {
            Usuario userFound = repo.findByEmailAndSenha(user.getEmail(), user.getSenha());

            if(userFound != null) {
                userFound.setSenha("*******");
                return ResponseEntity.ok(userFound);
            }
            return ResponseEntity.status(404).build(); //notFound
    } */
}
