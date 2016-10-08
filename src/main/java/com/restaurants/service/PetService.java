package com.restaurants.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restaurants.PetDetailsModel;

@Service
public class PetService {

	public void verifyPet(PetDetailsModel petdet) {
		RestTemplate template = new RestTemplate();
		HttpHeaders headers =  new HttpHeaders();
		headers.add("Content-Type", "application/json");
		Map<String, Object> body = new HashMap<String, Object>();
		body.put("restaurantId",petdet.getRestaurantId());
		body.put("petAllowed",petdet.getPetAllowed());
		body.put("nosOfPetsAllowed",petdet.getNosOfPetAllowed());
		body.put("cost",petdet.getCost());
		body.put("comments",petdet.getComments());
		HttpEntity<Map> entity = new HttpEntity<>(body, headers);
		String url = "http://ec2-54-224-119-187.compute-1.amazonaws.com:8080/verifyPet";
		template.exchange(url, HttpMethod.POST, entity,Object.class);
	}
	
	public void sendMessageByName(String name) {
		RestTemplate template = new RestTemplate();
		String url = "http://ec2-54-224-119-187.compute-1.amazonaws.com:8080/sendMessageByName/"+name;
		template.getForObject(url, String.class);
	}

    /* @RequestMapping("/extract/{city}")
public List<YelpRestaurant> extractAndStore(@PathVariable String city){
RestTemplate template = new RestTemplate();
HttpHeaders headers =  new HttpHeaders();
headers.add("Authorization", "Bearer "+yelpBearer);
HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
String encodedCity = URLEncoder.encode(city);
String yelpUrl = "https://api.yelp.com/v3/businesses/search?term=restaurant&location="+encodedCity;
ResponseEntity<YelpBusiness> restaurantEntity=template.exchange(yelpUrl, HttpMethod.GET, entity, YelpBusiness.class);
store(restaurantEntity.getBody().getBusinesses());
System.out.println("Size is "+restaurantEntity.getBody().getBusinesses().size());
return restaurantEntity.getBody().getBusinesses();
}
private void store(List<YelpRestaurant> businesses) {

for (YelpRestaurant yelpRestaurant : businesses) {
Restaurant restaurant = new Restaurant();
restaurant.setName(yelpRestaurant.getName());
restaurant.setLocation(yelpRestaurant.getLocation());
restaurant.setCoordinates(yelpRestaurant.getCordinates());
restaurant.setContact(yelpRestaurant.getPhone());
repository.save(restaurant);
}

}*/
}
