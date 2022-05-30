package com.shoptruongcr.model.response.mapper;

import com.shoptruongcr.common.EntityMapper;
import com.shoptruongcr.entity.Color;
import com.shoptruongcr.model.response.ColorResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ColorResponseMapper extends EntityMapper<ColorResponseDTO, Color> {

    @Override
    ColorResponseDTO toDto(Color colorEntity);

    @Override
    List<ColorResponseDTO> toDto(List<Color> colorEntity);
}
