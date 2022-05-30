package com.shoptruongcr.model.mapper;

import com.shoptruongcr.common.EntityMapper;
import com.shoptruongcr.entity.product.ProductType;
import com.shoptruongcr.model.ProductDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductTypeMapper extends EntityMapper<ProductDTO, ProductType> {
    @Override
    List<ProductType> toEntity(List<ProductDTO> productRequestDTO);
}
