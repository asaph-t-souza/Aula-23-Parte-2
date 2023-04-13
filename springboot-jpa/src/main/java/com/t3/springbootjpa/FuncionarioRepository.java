package com.t3.springbootjpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long>{
    
    Funcionario findById(long id);

    Long deleteById(long id);

    Long deleteByFirstName(String firstName);

    List<Funcionario> findByFirstName(String firstName);
}
