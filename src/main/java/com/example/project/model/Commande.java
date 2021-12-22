package com.example.project.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Transactional
@Setter
@JsonIgnoreType

public class Commande implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    @Basic(optional = false)
    private String name;

    private String pictureUrl;
    
    
    private String description;
    
    
    private produit produit;
    
    
    private Category category;
	
	public Commande() {
		super();
	}

	public Commande(String name, String pictureUrl, String description, com.example.project.model.produit produit,
			Category category) {
		super();
		this.name = name;
		this.pictureUrl = pictureUrl;
		this.description = description;
		this.produit = produit;
		this.category = category;
	}

	
    
    
}
