package com.example.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.project.model.Commande;
import com.example.project.repository.RepositoryCommande;
@Service
public class CommadeService implements ICommandeService{

	private RepositoryCommande repo;
	
	public CommadeService(RepositoryCommande repositoryCommande) {
		super();
	this.repo=repositoryCommande;
	}
	@Override
	public List<Commande> getAllCommande() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public Commande getCommande(int id) {
		// TODO Auto-generated method stub
		return repo.findCommandeById(id);
	}

	@Override
	public Commande save(Commande Commande) {
		// TODO Auto-generated method stub
		
		return repo.save(Commande);
	}

	@Override
	public void deleteCommande(int id) {
		// TODO Auto-generated method stub
		repo.deleteCommandeById(id);
	
	}
	@Override
	public Commande UpdateCommande(Commande Commande, int id) {
		Commande comm=repo.findCommandeById(id);
		
		comm.setId(Commande.getId());
		comm.setName(Commande.getName());
		comm.setPictureUrl(Commande.getPictureUrl());
		
		
		return repo.save(Commande);
	}

	
}
