package com.shoptruongcr.model.response.mapper;

import com.shoptruongcr.common.EntityMapper;
import com.shoptruongcr.entity.Category;
import com.shoptruongcr.model.response.CategoryResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryResponseMapper extends EntityMapper<CategoryResponseDTO, Category> {

    @Override
    CategoryResponseDTO toDto(Category categoryEntity);


    @Override
    List<CategoryResponseDTO> toDto(List<Category> categoryEntity);
}
