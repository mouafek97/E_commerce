package com.example.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

@Getter
@Setter
@Entity
@Transactional
@JsonIgnoreType
public class Category implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Basic(optional = false) 
	private String name;
    private String description;
    @OneToMany(mappedBy="categorie" , fetch =FetchType.LAZY)
    private Collection<produit> produits ;


public Category() {
	super();
}


public Category(String name, String description) {
	super();
	this.name = name;
	this.description = description;
	
}






}


