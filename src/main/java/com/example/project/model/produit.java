package com.example.project.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Transactional
@Entity
@JsonIgnoreType

public class produit implements Serializable{


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false ,updatable = false)
    private int id;

   
    @Basic(optional = false)
    private String name;

    private Double price;
    private String pictureUrl;
    private String ProductCode;
    private String Description;
    
    @ManyToOne
    private Category categorie;
    private String catname ; 
    
    
    
	
	public produit() {
	}


	public produit(String name, Double price, String pictureUrl, String productCode, String description,
			Category categorie) {
		super();
		this.name = name;
		this.price = price;
		this.pictureUrl = pictureUrl;
		ProductCode = productCode;
		Description = description;
		this.categorie = categorie;
		setCatname(categorie.getName());
		
	}


}

