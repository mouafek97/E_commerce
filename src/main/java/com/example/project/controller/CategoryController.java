package com.example.project.controller;

import java.io.Serializable;
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

import com.example.project.model.Category;
import com.example.project.service.CategoryService;
import com.example.project.service.ICategoreService;


@RestController
@RequestMapping("/api/category")
public class  CategoryController  {
	private final ICategoreService Categoryservice;

	public  CategoryController (CategoryService Categoryservice) {
		
			this.Categoryservice=Categoryservice;
	}
	
	@GetMapping("all")
	 public ResponseEntity<List<Category>> getAllOrders() {
		List<Category>Category=Categoryservice.getAllCategory();
        return new ResponseEntity<>(Category, HttpStatus.OK);
	    }
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Category>getCategoryById(@PathVariable("id") int id){
		Category com=Categoryservice.getCategory(id);
		return new ResponseEntity<>(com,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Category>  save(@RequestBody Category Category) {
		Category ord=Categoryservice.save(Category);
		return new ResponseEntity<>(ord,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>  delete(@PathVariable("id")int id) {
		Categoryservice.deleteCategory(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Category>  update(@RequestBody Category p, @PathVariable("id")int id) {
		
		Category com=Categoryservice.UpdateCategory(p, id);
		return new ResponseEntity<>(com,HttpStatus.OK);
	}
}

