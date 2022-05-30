package com.shoptruongcr.service;


//import com.shoptruongcr.model.mapper.ProductColorMapper;
import com.shoptruongcr.model.mapper.ProductTypeMapper;
import com.shoptruongcr.model.request.mapper.CategoryRequestMapper;
import com.shoptruongcr.model.request.mapper.ColorRequestMapper;
import com.shoptruongcr.model.request.mapper.ProductRequestMapper;
import com.shoptruongcr.model.response.mapper.ColorResponseMapper;
import com.shoptruongcr.model.response.mapper.ProductResponseMapper;
import com.shoptruongcr.repository.*;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class BaseService {
    @Autowired
    protected ProductRequestMapper productRequestMapper;

    @Autowired
    protected ProductResponseMapper productResponseMapper;

    @Autowired
    protected ProductRepository productRepository;

    @Autowired
    protected CategoryRepository categoryRepository;

    @Autowired
    protected CategoryRequestMapper categoryRequestMapper;

    @Autowired
    protected ColorRequestMapper colorRequestMapper;

    @Autowired
    protected ColorResponseMapper colorResponseMapper;

    @Autowired
    protected ProductTypeMapper productTypeMapper;

//    @Autowired
//    protected ProductColorMapper productColorMapper;

    @Autowired
    protected ColorRepository colorRepository;

    @Autowired
    protected TypeRepository typeRepository;

    @Autowired
    protected ProductTypeRepository productTypeRepository;

//    @Autowired
//    protected ProductCategoryRepository productCategoryRepository;

    @Autowired
    protected ProductColorRepository productColorRepository;
}
