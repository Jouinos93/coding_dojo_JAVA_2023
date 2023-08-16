package com.souha.DojosNinjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.souha.DojosNinjas.Models.Ninja;
import com.souha.DojosNinjas.Repositories.NinjaRepository;
@Service
public class NinjaService {
	 private final NinjaRepository ninjaRepository;
	    
	    public NinjaService(NinjaRepository ninjaRepository) {
	        this.ninjaRepository = ninjaRepository;
	    }
	    
	    // Display all ninjas
	    
	    public List<Ninja> allNinjas() {
	    	return ninjaRepository.findAll();
	    }
	     // Create a ninja 
	    public Ninja createNinja(Ninja ninja) {
	    	return ninjaRepository.save(ninja);
	    }
	    
	    // Find one
	    public Ninja findNinja(Long id) {
	        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
	        if(optionalNinja.isPresent()) {
	            return optionalNinja.get();
	        } else {
	            return null;
	        }
	    }
}
