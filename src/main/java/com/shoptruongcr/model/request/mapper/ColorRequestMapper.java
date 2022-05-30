package com.shoptruongcr.model.request.mapper;

import com.shoptruongcr.common.EntityMapper;
import com.shoptruongcr.entity.Color;
import com.shoptruongcr.model.request.ColorRequestDTO;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ColorRequestMapper extends EntityMapper<ColorRequestDTO, Color> {
    @Override
    Color toEntity(ColorRequestDTO colorRequestDTO);

    @Override
    List<Color> toEntity(List<ColorRequestDTO> colorRequestDTO);
}
