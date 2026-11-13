package com.melodieliona.todolist.service;

import org.springframework.stereotype.Service;

import com.melodieliona.todolist.entity.Category;
import com.melodieliona.todolist.repository.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category create(Category category) {
        return categoryRepository.save(category);
    }
}
