package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Category;

@Repository
public interface ReposiroryCategory extends JpaRepository<Category, Integer>{
	public Category findCategoryById(int id);
	public Category deleteCategoryById(int id);
}
