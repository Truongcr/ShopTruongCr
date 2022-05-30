package com.shoptruongcr.service;

import com.shoptruongcr.model.request.EditProductRequestDTO;
import com.shoptruongcr.model.request.ProductRequestDTO;
import com.shoptruongcr.model.response.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    List<ProductResponseDTO> save(List<ProductRequestDTO> productRequestDTO);

    ProductResponseDTO update(EditProductRequestDTO productRequestDTO);
}
