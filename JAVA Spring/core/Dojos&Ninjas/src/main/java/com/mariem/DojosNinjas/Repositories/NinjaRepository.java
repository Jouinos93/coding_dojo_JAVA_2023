package com.mariem.DojosNinjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mariem.DojosNinjas.Models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List <Ninja> findAll();
}
