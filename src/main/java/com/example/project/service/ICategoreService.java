package com.example.project.service;

import java.util.List;

import com.example.project.model.Category;

public interface ICategoreService {
	public List<Category> getAllCategory();
	public Category getCategory(int id);
	public Category save(Category Category);
	public void deleteCategory(int id);
	public Category UpdateCategory(Category Category, int id);
}
