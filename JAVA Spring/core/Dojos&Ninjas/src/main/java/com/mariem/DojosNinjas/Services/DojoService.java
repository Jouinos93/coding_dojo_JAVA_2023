package com.mariem.DojosNinjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mariem.DojosNinjas.Models.Dojo;
import com.mariem.DojosNinjas.Repositories.DojoRepository;
@Service
public class DojoService {
	private final DojoRepository DojoRepo;
	
	public DojoService(DojoRepository DojoRepo) {
		this.DojoRepo = DojoRepo;
	}
	
	public List<Dojo> allDojos() {
		return DojoRepo.findAll();
	}
	
	public Dojo addDojo(Dojo dojo) {
		return DojoRepo.save(dojo);
	}

    public Dojo findDojo(Long id) {
         
		Optional<Dojo> maybeDojo = DojoRepo.findById(id);
		if(maybeDojo.isPresent()) {
			return maybeDojo.get();
		}else {
			return null;
		} 
    }
}
