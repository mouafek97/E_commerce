package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Commande;
@Repository

public interface RepositoryCommande extends JpaRepository<Commande, Integer>{
	public Commande findCommandeById(int id);
	public Commande deleteCommandeById(int id);
}
