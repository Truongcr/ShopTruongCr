package com.shoptruongcr.service.impl;


import com.shoptruongcr.entity.Color;
import com.shoptruongcr.model.request.ColorRequestDTO;
import com.shoptruongcr.model.response.ColorResponseDTO;
import com.shoptruongcr.repository.ColorRepository;
import com.shoptruongcr.service.BaseService;
import com.shoptruongcr.service.ColorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class ColorServiceimpl extends BaseService implements ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Override
    public List<ColorResponseDTO> save(List<ColorRequestDTO> colorRequestDTO) {
            List<Color> colorEntity = colorRequestMapper.toEntity(colorRequestDTO);
            colorRepository.saveAll(colorEntity);
        return colorResponseMapper.toDto(colorRepository.findAll());
    }

    @Override
    public List<ColorResponseDTO> update(ColorRequestDTO colorRequestDTO) {
        Optional<Color> color = colorRepository.findById(colorRequestDTO.getColorNo());
        if(color.isPresent()){
            Color entity = color.get();
            entity.setColorNo(colorRequestDTO.getColorNo());
            entity.setColorCode(colorRequestDTO.getColorCode());
            entity.setColorName(colorRequestDTO.getColorName());
            colorRepository.save(color.get());
        }
        else{
            log.info("errror");
        }
        return colorResponseMapper.toDto(colorRepository.findAll());
    }
}
