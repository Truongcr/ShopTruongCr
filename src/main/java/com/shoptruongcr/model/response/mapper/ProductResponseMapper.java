package com.shoptruongcr.model.response.mapper;

import com.shoptruongcr.common.EntityMapper;
import com.shoptruongcr.entity.product.Product;
import com.shoptruongcr.model.response.ProductResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductResponseMapper extends EntityMapper<ProductResponseDTO, Product> {

    @Override
    ProductResponseDTO toDto(Product productEntity);

    @Override
    List<ProductResponseDTO> toDto(List<Product> productList);
}
