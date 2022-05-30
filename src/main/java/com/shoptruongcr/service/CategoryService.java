package com.shoptruongcr.service;

import com.shoptruongcr.model.request.CategoryRequestDTO;
import com.shoptruongcr.model.response.CategoryResponseDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryResponseDTO> save(List<CategoryRequestDTO> categoryRequestDTO);

    List<CategoryResponseDTO> update(CategoryRequestDTO categoryRequestDTO);

    List<CategoryResponseDTO> delete(Long categoryId);

    CategoryResponseDTO search(Long categoryId);

}
