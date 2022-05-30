package com.shoptruongcr.model.request.mapper;

import com.shoptruongcr.common.EntityMapper;
import com.shoptruongcr.entity.Category;
import com.shoptruongcr.model.request.CategoryRequestDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryRequestMapper  extends EntityMapper<CategoryRequestDTO, Category> {
    @Override
    Category toEntity(CategoryRequestDTO categoryRequestDTO);

    @Override
    List<Category> toEntity(List<CategoryRequestDTO> categoryRequestDTO);
}
