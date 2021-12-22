package com.example.project.service;

import java.util.List;

import com.example.project.model.produit;

public interface IProduitService {
	public List<produit> getAllProducts();
	public produit getproduit(int id);
	public produit save(produit produit);
	public void deleteproduit(int id);
	public produit Updateproduit(produit produit, int id);
}
