package com.Kumar.blog.services.impl;

import com.Kumar.blog.domain.entities.Category;
import com.Kumar.blog.repositories.CategoryRepository;
import com.Kumar.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;


    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }
}
