package com.shoptruongcr.controller;


import com.shoptruongcr.model.request.CategoryRequestDTO;
import com.shoptruongcr.model.response.CategoryResponseDTO;
import com.shoptruongcr.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/shop/category")
@Slf4j
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    //ADMIN----------------------------------------------------------------------------------
    @ApiOperation(value = "Add category" )
    @PostMapping("/add")
    public ResponseEntity<List<CategoryResponseDTO>> save(@RequestBody List<CategoryRequestDTO> categoryRequestDTO){
        log.info("delete category by categoryNo");
        return ResponseEntity.ok(categoryService.save(categoryRequestDTO));
    }
    @PutMapping("/update")
    public ResponseEntity<List<CategoryResponseDTO>> update(@RequestBody CategoryRequestDTO categoryRequestDTO){
        log.info("delete category by categoryNo");
        return ResponseEntity.ok(categoryService.update(categoryRequestDTO));
    }
    @DeleteMapping("/delete/{categoryNo}")
    public ResponseEntity<List<CategoryResponseDTO>> delete(@PathVariable Long categoryNo){
        log.info("delete category by categoryNo",categoryNo);
        return ResponseEntity.ok(categoryService.delete(categoryNo));
    }


    //USER-------------------------------------------------------------------------------------------------------
    @GetMapping("/search/{categoryNo}")
    public ResponseEntity<CategoryResponseDTO> search(@PathVariable Long categoryNo){
        return ResponseEntity.ok(categoryService.search(categoryNo));
    }
}
