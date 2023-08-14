package com.souha.SaveTravel.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.souha.SaveTravel.Models.Travel;
import com.souha.SaveTravel.Repositories.SaveTravelRepo;

@Service
public class TravelService {
		private final SaveTravelRepo TravelRepo;
		
		public TravelService(SaveTravelRepo TravelRepo) {
			this.TravelRepo = TravelRepo;
		}
		
		public List<Travel> allTravel() {
			return TravelRepo.findAll();
		}
		
		public Travel addTravel(Travel travel) {
			return TravelRepo.save(travel);
		}

	    public Travel findTravel(Long id) {
	         
			Optional<Travel> maybeTravel = TravelRepo.findById(id);
			if(maybeTravel.isPresent()) {
				return maybeTravel.get();
			}else {
				return null;
			} 
	    }
	    public Travel updateTravel(Travel travel) {

	        return TravelRepo.save(travel);
	    }
		
		// DELETE
		public void deleteTravel(Long id) {
			TravelRepo.deleteById(id);
		}
}
