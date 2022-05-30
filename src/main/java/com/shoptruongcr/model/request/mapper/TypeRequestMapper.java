package com.shoptruongcr.model.request.mapper;


import com.shoptruongcr.common.EntityMapper;
import com.shoptruongcr.entity.Type;
import com.shoptruongcr.model.request.TypeRequestDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeRequestMapper extends EntityMapper<TypeRequestDTO, Type> {

    @Override
    Type toEntity(TypeRequestDTO typeRequestDTO);

    @Override
    List<Type> toEntity(List<TypeRequestDTO> typeRequestDTO);
}
