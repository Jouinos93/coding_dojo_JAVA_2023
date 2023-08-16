package com.mariem.DojosNinjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mariem.DojosNinjas.Models.Dojo;


public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List <Dojo> findAll();
}