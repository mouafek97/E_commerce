package com.example.project.controller;

import java.util.List;


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

import com.example.project.model.Commande;
import com.example.project.service.CommadeService;
import com.example.project.service.ICommandeService;





@RestController
@RequestMapping("/api/commande")
public class CommandeController {
	private final ICommandeService commandeservice;

	public CommandeController( 	CommadeService commandeservice) {
		
			this.commandeservice=commandeservice;
	}
	
	@GetMapping("all")
	 public ResponseEntity<List<Commande>> getAllOrders() {
		List<Commande>commande=commandeservice.getAllCommande();
        return new ResponseEntity<>(commande, HttpStatus.OK);
	    }
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Commande>getCOmmandeById(@PathVariable("id") int id){
		Commande com=commandeservice.getCommande(id);
		return new ResponseEntity<>(com,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Commande>  save(@RequestBody Commande Commande) {
		Commande ord=commandeservice.save(Commande);
		return new ResponseEntity<>(ord,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>  delete(@PathVariable("id")int id) {
		commandeservice.deleteCommande(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Commande>  update(@RequestBody Commande p, @PathVariable("id")int id) {
		
		Commande co=commandeservice.UpdateCommande(p,id);
		return new ResponseEntity<>(co,HttpStatus.OK);
	}
}
