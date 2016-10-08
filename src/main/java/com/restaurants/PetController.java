package com.restaurants;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurants.service.PetService;



@RestController
@RequestMapping("/getPetDetails")
public class PetController {
	@Autowired
	PetService petService;
	
	@RequestMapping(method=RequestMethod.POST,path="/create")
	public boolean savePetDetails(@RequestBody PetRequest req) throws IOException{
		PetDetailsModel petdet = new PetDetailsModel();
		petdet.setRestaurantId(req.getRestId());
		petdet.setPetAllowed(req.getPetAllowed());
		petdet.setNosOfPetAllowed(req.getNosOfPetAllowed());
		petdet.setCost(req.getCost());
		petdet.setComments(req.getComments());
		// System.out.println("USerId: " + petdet.getRestaurantId() +"PetAllowed" + petdet.getPetAllowed() + "NOS : " + petdet.getNosOfPetAllowed()+ "Cost:" + petdet.getCost());
		petService.verifyPet(petdet);
		return true;
		
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/sendMessageByName/{name}")
	public void sendMessage(@PathVariable String name) throws IOException{
		 petService.sendMessageByName(name);
		
	}
}
