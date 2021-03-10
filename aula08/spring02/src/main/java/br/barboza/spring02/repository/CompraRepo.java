package br.barboza.spring02.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.barboza.spring02.model.Compra;

public interface CompraRepo extends CrudRepository<Compra, Integer> {
    public List<Compra> findByValorGreaterThan(double valor);


}
