package com.souha.SaveTravel.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.souha.SaveTravel.Models.Travel;

@Repository

public interface SaveTravelRepo extends CrudRepository<Travel, Long> {
	 List<Travel> findAll();

}
