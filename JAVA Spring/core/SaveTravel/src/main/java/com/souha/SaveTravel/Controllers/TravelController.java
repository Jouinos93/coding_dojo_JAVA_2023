package com.souha.SaveTravel.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.souha.SaveTravel.Models.Travel;
import com.souha.SaveTravel.Services.TravelService;

import jakarta.validation.Valid;


@Controller
public class TravelController {

	@Autowired
	TravelService TravelService;
	
	@GetMapping("/")
	public String home(@ModelAttribute("travel") Travel travel, Model model) {
		List<Travel> travels = TravelService.allTravel();
		
		model.addAttribute("travels", travels);
		 System.out.println("Number of travels: " + travels.size());
		 System.out.println(travels);
		return "index.jsp";
	}
	
	@PostMapping("/addTravel")
	public String home(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Travel> travels = TravelService.allTravel();
			model.addAttribute("travels", travels);
	
			return "index.jsp";
		}
		TravelService.addTravel(travel);
		return "redirect:/";
	}
	
    // other methods removed for brevity
	@GetMapping("/travel/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {

        Travel travel = TravelService.findTravel(id);
        model.addAttribute("travel", travel);
        return "edit.jsp";
    }
    
    @PutMapping("/travel/{id}")
    public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
        	TravelService.updateTravel(travel);
            return "redirect:/";
        }
    }
    
	// DELETE
	
	@DeleteMapping("/travel/{id}")
	public String delete(@PathVariable("id") Long id) {
		TravelService.deleteTravel(id);
		return "redirect:/";
	}
	
	
	// DISPLAY ROUTE - Show One Travel
//	@GetMapping("/expenses/{id}")
//	public String showTravel(@PathVariable("id") Long id, Model model) {
//		
//		Travel oneTravel = TravelService.findTravel(id);
//		System.out.println(oneTravel);
//		model.addAttribute("Travel",oneTravel);
//		System.out.println(oneTravel);
//	
//		return "Show.jsp";
//		
//	}
	
	  @GetMapping("/expenses/{id}")
	    public String showTravel(@PathVariable("id") Long id, Model model) {

	        Travel oneTravel = TravelService.findTravel(id);
	        System.out.println(oneTravel);
	        model.addAttribute("oneTravel",oneTravel);
	        System.out.println(oneTravel);

	        return "Show.jsp";

	    }

 
}
	