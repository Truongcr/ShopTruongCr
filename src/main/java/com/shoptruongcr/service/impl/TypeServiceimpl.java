package com.shoptruongcr.service.impl;

import com.shoptruongcr.entity.Type;
import com.shoptruongcr.model.request.TypeRequestDTO;
import com.shoptruongcr.model.request.mapper.TypeRequestMapper;
import com.shoptruongcr.model.response.TypeResponseDTO;
import com.shoptruongcr.model.response.mapper.TypeResponseMapper;
import com.shoptruongcr.repository.TypeRepository;
import com.shoptruongcr.service.TypeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class TypeServiceimpl implements TypeService {

    @Autowired
    private TypeRequestMapper typeRequestMapper;

    @Autowired
    private TypeResponseMapper typeResponseMapper;

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public List<TypeResponseDTO> save(List<TypeRequestDTO> typeRequestDTO) {
            List<Type> typeEntity = typeRequestMapper.toEntity(typeRequestDTO);
            typeRepository.saveAll(typeEntity);
        return typeResponseMapper.toDto(typeRepository.findAll());
    }

    @Override
    public List<TypeResponseDTO> update(TypeRequestDTO typeRequestDTO) {
        Optional<Type> type = typeRepository.findById(typeRequestDTO.getTypeNo());
        if(type.isPresent()){
            Type entity = type.get();
            entity.setTypeNo(typeRequestDTO.getTypeNo());
            entity.setTypeCode(typeRequestDTO.getTypeCode());
            entity.setTypeName(typeRequestDTO.getTypeName());
            typeRepository.save(type.get());
        }else{
            log.info("update error");
        }
        return typeResponseMapper.toDto(typeRepository.findAll());
    }

}
