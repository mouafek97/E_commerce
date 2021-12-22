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
import com.example.project.model.produit;
import com.example.project.service.IProduitService;
import com.example.project.service.ProduitService;




@RestController
@RequestMapping("/api/produit")
public class ControllerProduit {
	
private final IProduitService Productsrvice;
	
public ControllerProduit(ProduitService Productsrvic) {
	
     this.Productsrvice = Productsrvic;
}
	@GetMapping("/all")
    public ResponseEntity<List<produit>>  getProducts() {
        List<produit>Product=Productsrvice.getAllProducts();
        return new ResponseEntity<>(Product, HttpStatus.OK);
}
	 @GetMapping("/find/{id}")
	    public ResponseEntity<produit> getProduitById (@PathVariable("id") int id) {
	    	produit produit = Productsrvice.getproduit(id);
	        return new ResponseEntity<>(produit, HttpStatus.OK);
	    }

	    @PostMapping("/add")
	    public ResponseEntity<produit> addProduit(@RequestBody produit produit) {
	    	produit newproduit = Productsrvice.save(produit);
	        return new ResponseEntity<>(newproduit, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<produit> updateProduit(@RequestBody produit produit,@PathVariable("id")int id) {
	    	produit updateproduit = Productsrvice.Updateproduit(produit, id);
	        return new ResponseEntity<>(updateproduit, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteProduit(@PathVariable("id") int id) {
	    	
	    	Productsrvice.deleteproduit(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    	
	    }
}
