package com.shoptruongcr.service.impl;

import com.shoptruongcr.entity.Category;
import com.shoptruongcr.model.request.CategoryRequestDTO;
import com.shoptruongcr.model.request.mapper.CategoryRequestMapper;
import com.shoptruongcr.model.response.CategoryResponseDTO;
import com.shoptruongcr.model.response.mapper.CategoryResponseMapper;
import com.shoptruongcr.repository.CategoryRepository;
import com.shoptruongcr.service.CategoryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class CategoryServiceimpl implements CategoryService  {

    @Autowired
    private CategoryRequestMapper categoryRequestMapper;

    @Autowired
    private CategoryResponseMapper categoryResponseMapper;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponseDTO> save(List<CategoryRequestDTO> categoryRequestDTO) {
            List<Category> categoryEntity = categoryRequestMapper.toEntity(categoryRequestDTO);
        return categoryResponseMapper.toDto(categoryRepository.saveAll(categoryEntity));
    }

    @Override
    public List<CategoryResponseDTO> update(CategoryRequestDTO categoryRequestDTO) {
        Optional<Category> category =categoryRepository.findById(categoryRequestDTO.getCategoryNo());
        if(category.isPresent()){
            Category category1 = category.get();
            category1.setCategoryNo(categoryRequestDTO.getCategoryNo());
            category1.setCategoryCode(categoryRequestDTO.getCategoryCode());
            category1.setCategoryName(categoryRequestDTO.getCategoryName());
            categoryRepository.save(category.get());
        }
        return categoryResponseMapper.toDto(categoryRepository.findAll());
    }

    @Override
    public List<CategoryResponseDTO> delete(Long categoryId) {
        categoryRepository.deleteById(categoryId);
        return categoryResponseMapper.toDto(categoryRepository.findAll());
    }

    @Override
    public CategoryResponseDTO search(Long categoryId) {
        return categoryResponseMapper.toDto(categoryRepository.findByCategoryNo(categoryId));
    }

}
