package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CustomerException;
import com.masai.exception.OrderException;
import com.masai.exception.PlantException;
import com.masai.exception.PlanterException;
import com.masai.exception.SeedException;
import com.masai.model.Orders;
import com.masai.model.Plant;
import com.masai.model.Planter;
import com.masai.model.Seed;
import com.masai.model.SignUpData;
import com.masai.service.OrderService;
import com.masai.service.PlantServices;
import com.masai.service.PlanterService;
import com.masai.service.SeedServices;
import com.masai.service.SignUpService;



@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private SignUpService signupservice;
	@Autowired
	private SeedServices seedservice;
	@Autowired
	private OrderService orderservice;
	
	
	@Autowired
	private PlantServices plantServices;
	
	@Autowired
	private PlanterService planterService;
	
	
	
   @GetMapping("/allcustomers")
	public ResponseEntity<List<SignUpData>>  showallcustomers() throws CustomerException{
		
	   
	 
			List<SignUpData> customers = signupservice.showallcustomers();
			return new ResponseEntity<List<SignUpData>>(customers, HttpStatus.OK);
		}
	   
	
	@DeleteMapping("/delete/{id}")
public ResponseEntity<SignUpData>  deletecustomer(@PathVariable Integer id) throws CustomerException{

	SignUpData customers = signupservice.deletecustomer(id);
	return new ResponseEntity<SignUpData>(customers, HttpStatus.OK);
}
	
	
	
	@PostMapping("/add/seeds")
	public ResponseEntity<Seed> addSeedHandler(@RequestBody Seed seed) throws SeedException{
		
		 Seed s= seedservice.addSeed(seed);
		
		return new ResponseEntity<Seed>(s,HttpStatus.OK);
		
		
	}
	
	
	
	@PutMapping("/update/seeds")
	public ResponseEntity<Seed> updateSeedHandler(@RequestBody Seed seed) throws SeedException{
		
		Seed p= seedservice.updateSeed(seed);
		
		return new ResponseEntity<Seed>(p,HttpStatus.OK);
		
		
	}
	
	
	@DeleteMapping("/delete/seeds")
	public ResponseEntity<Seed> deleteSeedHandler(@RequestBody Seed seed) throws SeedException{
		
		Seed s= seedservice.deleteSeed(seed);
		
		return new ResponseEntity<Seed>(s,HttpStatus.OK);
		
		
	}
	
	
	


	@PostMapping("/add/plants")
	public ResponseEntity<Plant> addPlantHandler(@RequestBody Plant plant) throws PlantException{
		
		Plant p= plantServices.addPlant(plant);
		
		return new ResponseEntity<Plant>(p,HttpStatus.OK);
		
		
	}
	
	
	
	@PutMapping("/update/plants")
	public ResponseEntity<Plant> updatePlantHandler(@RequestBody Plant plant) throws PlantException{
		
		Plant p= plantServices.updatePlant(plant);
		
		return new ResponseEntity<Plant>(p,HttpStatus.OK);
		
		
	}
	
	
	@DeleteMapping("/delete/plants")
	public ResponseEntity<Plant> deletePlantHandler(@RequestBody Plant plant) throws PlantException{
		
		Plant p= plantServices.deletePlant(plant);
		
		return new ResponseEntity<Plant>(p,HttpStatus.OK);
		
		
	}
	

	
	
		@PostMapping("/add/planter")
		public ResponseEntity<Planter> addPlanter(@Valid @RequestBody Planter planter) {
			Planter plant = planterService.addPlanter(planter);
					
			return new ResponseEntity<Planter>(plant, HttpStatus.CREATED);
		}
		
		
		@PutMapping("/update/planter")
		public ResponseEntity<Planter> updatePlanter(@Valid @RequestBody Planter planter) throws PlanterException {
			
			Planter updatedPlant = planterService.updatePlanter(planter);
					
			return new ResponseEntity<Planter>(updatedPlant, HttpStatus.OK);
		}
		
		
		@DeleteMapping("/delete/planter")
		public ResponseEntity<Planter> deletePlanterHandler(@Valid @RequestBody Planter planter) throws PlanterException {
			
			Planter deletedPlanter = planterService.deletePlanter(planter);
					
			return new ResponseEntity<Planter>(deletedPlanter, HttpStatus.OK);
		}
		
		@GetMapping("/showorders")
		public List<Orders>viewAllOrders() throws OrderException{
			return orderservice.viewAllOrders();
			
		}
	
}

	

