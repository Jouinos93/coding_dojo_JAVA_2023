package com.souha.DojosNinjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.souha.DojosNinjas.Models.Dojo;


public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List <Dojo> findAll();
}