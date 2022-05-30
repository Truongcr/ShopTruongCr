package com.shoptruongcr.controller;

import com.shoptruongcr.model.request.ColorRequestDTO;
import com.shoptruongcr.model.response.ColorResponseDTO;
import com.shoptruongcr.service.ColorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "api/shop/color")
public class ColorController {
    @Autowired
    private ColorService colorService;

    //ADMIN===============================ADMIN===========================================
    @Scheduled(fixedDelay = 1000, initialDelay = 3000)
    @PostMapping("/add")
    public ResponseEntity<List<ColorResponseDTO>> save(@RequestBody @Valid List<ColorRequestDTO> colorRequestDTO){
        log.info("add color");
        return ResponseEntity.ok(colorService.save(colorRequestDTO));
    }

    @PutMapping("/update")
    public ResponseEntity<List<ColorResponseDTO>> update(@RequestBody ColorRequestDTO colorRequestDTO){
        return ResponseEntity.ok(colorService.update(colorRequestDTO));
    }

//    @PatchMapping("/delete")
    //======================================USER=====================================================
}
