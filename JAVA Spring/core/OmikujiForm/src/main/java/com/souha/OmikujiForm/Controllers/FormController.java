package com.souha.OmikujiForm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class FormController {
   @RequestMapping("/Omikuji")
   public String Form() {
	   
	   return "Form.jsp";
   }
   
   @RequestMapping(value="/formprocess", method=RequestMethod.POST)
	   public String processForm(@RequestParam("number") int number,
	                             @RequestParam("city") String city,
	                             @RequestParam("person") String person,
	                             @RequestParam("hobby") String hobby,
	                             @RequestParam("living") String living,
	                             @RequestParam("Textarea") String message,
	                             HttpSession session) {
	       // Store the form data in session
	       session.setAttribute("number", number);
	       session.setAttribute("city", city);
	       session.setAttribute("person", person);
	       session.setAttribute("hobby", hobby);
	       session.setAttribute("living", living);
	       session.setAttribute("message", message);

	       // Redirect to a success page or any other desired page

       return "redirect:/omikuji/show";
   }
   	
   @RequestMapping("/omikuji/show")
   public String show () {
	   
	   return "Show.jsp";   
	   }
   
}
