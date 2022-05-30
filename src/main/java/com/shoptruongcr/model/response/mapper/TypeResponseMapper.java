package com.shoptruongcr.model.response.mapper;

import com.shoptruongcr.common.EntityMapper;
import com.shoptruongcr.entity.Type;
import com.shoptruongcr.model.response.TypeResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeResponseMapper extends EntityMapper<TypeResponseDTO, Type> {
    @Override
    TypeResponseDTO toDto(Type typeEntity);

    @Override
    List<TypeResponseDTO> toDto(List<Type> typeEntity);
}
