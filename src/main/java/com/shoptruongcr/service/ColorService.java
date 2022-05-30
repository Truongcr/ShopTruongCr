package com.shoptruongcr.service;

import com.shoptruongcr.model.request.ColorRequestDTO;
import com.shoptruongcr.model.response.ColorResponseDTO;

import java.util.List;

public interface ColorService {
  List<ColorResponseDTO> save(List<ColorRequestDTO> colorRequestDTO);

  List<ColorResponseDTO> update(ColorRequestDTO colorRequestDTO);
}
