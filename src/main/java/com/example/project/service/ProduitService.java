package com.example.project.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.project.model.produit;
import com.example.project.repository.RepositoryProduit;
@Service
public class ProduitService implements IProduitService{
	private RepositoryProduit ProductRepository;
	
	public ProduitService(RepositoryProduit RepositoryProduit) {
		this.ProductRepository=RepositoryProduit;
	}
	
	@Override
	public List<produit> getAllProducts() {
		// TODO Auto-generated method stub
		return ProductRepository.findAll();
	}

	@Override
	public produit getproduit(int id) {
		// TODO Auto-generated method stub
		return ProductRepository.findProductById(id);
	}

	@Override
	public produit save(produit product) {
		product.setProductCode(UUID.randomUUID().toString());
		return ProductRepository.save(product);
	}

	@Override
	public void deleteproduit(int id) {
		// TODO Auto-generated method stub
		ProductRepository.deleteById(id);;;

		
	}

	@Override
	public produit Updateproduit(produit product,int id) {
		// TODO Auto-generated method stub
		produit produit=ProductRepository.findProductById(id);
		
		produit.setPrice(product.getPrice());
		produit.setId(product.getId());
		produit.setName(product.getName());
		produit.setPictureUrl(product.getPictureUrl());


		return ProductRepository.save(produit);
	}

}
