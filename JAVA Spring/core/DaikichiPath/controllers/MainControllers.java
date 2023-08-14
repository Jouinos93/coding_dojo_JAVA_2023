package com.mariem.DaikichiRoutes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllers {
	
	@RequestMapping ("/daikichi")
	public  String Welcome() {
		
		return "Welcome !";
	}
	@RequestMapping ("/daikichi/today")
	public  String today() {
		
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping ("/daikichi/tommorrow")
	public  String tommorrow() {
		
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/daikichi/travel/{City}")
    public String Travel (@PathVariable String City){
      return "Congratulations! You will travel to "+ City +" !";
    }
	
	@RequestMapping("/daikichi/lotto/{Number}")
    public String Lotto (@PathVariable int Number){
        if (Number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
	
}
