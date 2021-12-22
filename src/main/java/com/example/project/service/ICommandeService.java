package com.example.project.service;

import java.util.List;

import com.example.project.model.Commande;

public interface ICommandeService {
	public List<Commande> getAllCommande();
	public Commande getCommande(int id);
	public Commande save(Commande Commande);
	public void deleteCommande(int id);
	public Commande UpdateCommande(Commande Commande, int id);
}
