package com.souha.DojosNinjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.souha.DojosNinjas.Models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List <Ninja> findAll();
}
