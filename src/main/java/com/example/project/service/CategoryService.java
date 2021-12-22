package com.example.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.project.model.Category;
import com.example.project.repository.ReposiroryCategory;

@Service
public class CategoryService implements ICategoreService{
private ReposiroryCategory repo;
	
	

	public CategoryService(ReposiroryCategory reo) {
	super();
	this.repo = reo;
}
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		return repo.findCategoryById(id);
	}

	@Override
	public Category save(Category Category) {
		// TODO Auto-generated method stub
		
		return repo.save(Category);
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		repo.deleteCategoryById(id);
	
	}

	@Override
	public Category UpdateCategory(Category Category, int id) {
		Category comm=repo.findCategoryById(id);
		
		comm.setId(Category.getId());
		comm.setName(Category.getName());
		comm.setDescription(Category.getDescription());
		
		
		return repo.save(Category);
	}
}
