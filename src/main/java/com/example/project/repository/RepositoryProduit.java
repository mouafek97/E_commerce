package com.example.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.produit;
@Repository

public interface RepositoryProduit extends JpaRepository<produit, Integer>{
	public produit findProductById(int id);
	public produit deleteProductById(int id);
	
}
