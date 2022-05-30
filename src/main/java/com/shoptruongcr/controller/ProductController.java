package com.shoptruongcr.controller;

import com.google.common.collect.Iterables;
import com.shoptruongcr.model.request.EditProductRequestDTO;
import com.shoptruongcr.model.request.ProductRequestDTO;
import com.shoptruongcr.model.response.ProductResponseDTO;
import com.shoptruongcr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<List<ProductResponseDTO>> save(@RequestBody List<ProductRequestDTO> productRequestDTO){
        List<String> a = new ArrayList<>();
        a.add("t");
        a.add("r");
        a.add("u");
        a.add("o");
        Iterable<List<String>> x = Iterables.partition(a,1);
        x.forEach(xx -> System.out.println(xx));
        return ResponseEntity.ok(productService.save(productRequestDTO));
    }
    @PostMapping("/update")
    public ResponseEntity<ProductResponseDTO> update(@RequestBody EditProductRequestDTO productRequestDTO){
        return ResponseEntity.ok(productService.update(productRequestDTO));
    }



}
