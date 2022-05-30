package com.shoptruongcr.controller;

import com.shoptruongcr.model.request.TypeRequestDTO;
import com.shoptruongcr.model.response.TypeResponseDTO;
import com.shoptruongcr.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @PostMapping("/add")
    public List<TypeResponseDTO> save(@RequestBody List<TypeRequestDTO> typeRequestDTO){
        return typeService.save(typeRequestDTO);
    }
    @PutMapping("update")
    public List<TypeResponseDTO> update(@RequestBody TypeRequestDTO typeRequestDTO){
        return typeService.update(typeRequestDTO);
    }
}
