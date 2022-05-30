package com.shoptruongcr.model.request.mapper;

import com.shoptruongcr.common.EntityMapper;

import com.shoptruongcr.entity.product.Product;
import com.shoptruongcr.model.request.ProductRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductRequestMapper extends  EntityMapper<ProductRequestDTO, Product> {
    @Override
    Product toEntity(ProductRequestDTO productRequestDTO);
}
