package com.shoptruongcr.service;

import com.shoptruongcr.model.request.TypeRequestDTO;
import com.shoptruongcr.model.response.TypeResponseDTO;

import java.util.List;

public interface TypeService {
    List<TypeResponseDTO> save(List<TypeRequestDTO> typeRequestDTO);

    List<TypeResponseDTO> update(TypeRequestDTO typeRequestDTO);
}
