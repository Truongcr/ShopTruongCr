package com.shoptruongcr.service.impl;


import com.shoptruongcr.entity.Category;
import com.shoptruongcr.entity.Color;
import com.shoptruongcr.entity.Type;
import com.shoptruongcr.entity.product.Product;
import com.shoptruongcr.entity.product.ProductColor;
import com.shoptruongcr.entity.product.ProductType;
import com.shoptruongcr.model.ProductCategoryDTO;
import com.shoptruongcr.model.ProductColorDTO;
import com.shoptruongcr.model.ProductTypeDTO;
import com.shoptruongcr.model.request.EditProductRequestDTO;
import com.shoptruongcr.model.request.ProductRequestDTO;
import com.shoptruongcr.model.response.ProductResponseDTO;
import com.shoptruongcr.repository.ProductColorRepository;
import com.shoptruongcr.service.BaseService;
import com.shoptruongcr.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceimpl extends BaseService implements ProductService {
    @Override
    public List<ProductResponseDTO> save(List<ProductRequestDTO> productRequestDTO) {
        for(ProductRequestDTO requestDTO : productRequestDTO) {
            Product productLoad = productRepository.findByProductCode(requestDTO.getProductCode());
            Category category = categoryRequestMapper.toEntity(requestDTO.getCategory());
            if(productLoad==null) {
                Product product = productRequestMapper.toEntity(requestDTO);
                product.setCategory(category);
                productRepository.save(product);
                Product productsave = productRepository.findByProductCode(requestDTO.getProductCode());
                saveProductColor(productsave, requestDTO);
                saveProductType(productsave, requestDTO);
            }else {
                log.info("Nhap lai CODE");
            }
        }
        List<ProductResponseDTO> productResponseDTOList = new ArrayList<>();
            List<Product> products = productRepository.findAll();
//            List<Product> productEntity = new ArrayList<>();
//            productResponseDTOList = productResponseMapper.toDto(products);
            for(Product product: products) {
                List<ProductType> productTypes = productTypeRepository.findAllByProductNo(product.getProductNo());
                for(ProductType productType : productTypes){
                    ProductResponseDTO productResponseDTO = new ProductResponseDTO();
                    productResponseDTO.setProductNo(product.getProductNo());
                    productResponseDTO.setProductCode(product.getProductCode());
                    productResponseDTO.setProductName(product.getProductName());
                    productResponseDTO.setProductContent(product.getProductContent());

                    productResponseDTO.setTypeName(productType.getTypeName());
                    productResponseDTO.setPrice(productType.getPrice());
                    productResponseDTOList.add(productResponseDTO);
                }
                List<ProductColor> productColors = productColorRepository.findAllByProductNo(product.getProductNo());
                productResponseDTOList.stream().map(productResponseDTO -> {
                    for(ProductColor productColor : productColors){
                        productResponseDTO.setColorName(productColor.getColorName());
                        productResponseDTOList.add(productResponseDTO);
                    }
                    return 0;
                });
        }
        return productResponseDTOList;
    }
    public void saveProductColor(Product product, ProductRequestDTO requestDTO){
        if(!CollectionUtils.isEmpty(requestDTO.getProductColorDTOList())){
            List<ProductColor> productColorList = new ArrayList<>();
            requestDTO.getProductColorDTOList().stream().forEach(item ->{
                ProductColor productColor = new ProductColor();
                productColor.setProduct(product);
                productColor.setColorNo(item.getColorNo());
                productColor.setColorName(item.getColorName());
                productColorList.add(productColor);
            });
            productColorRepository.saveAll(productColorList);
        }
    }
    public void saveProductType(Product product, ProductRequestDTO requestDTO){
        if(!CollectionUtils.isEmpty(requestDTO.getProductTypeDTOList())){
            List<ProductType> productTypeList = new ArrayList<>();
            requestDTO.getProductTypeDTOList().stream().forEach(item -> {
                ProductType productType = new ProductType();
                productType.setProduct(product);
                productType.setTypeNo(item.getTypeNo());
                productType.setTypeName(item.getTypeName());
                productType.setPrice(item.getPrice());

                productTypeList.add(productType);
            });
            productTypeRepository.saveAll(productTypeList);
        }
    }
    public void updateProductColor(Product product, EditProductRequestDTO requestDTO){
        Long colorNo = requestDTO.getColorNo();
        String colorName = requestDTO.getColorName();
        Optional<ProductColor> productColor = productColorRepository.findAllByProductNoAndColorNo(product.getProductNo(),colorNo);
        if(productColor.isPresent()){
            Color color = colorRepository.findByColorName(colorName);
            ProductColor entity = productColor.get();
            entity.setColorNo(color.getColorNo());
            entity.setColorName(color.getColorName());
            entity.setProduct(product);
            productColorRepository.save(productColor.get());
            }
        }
    public void updateProductType(Product product, EditProductRequestDTO requestDTO){
        Long typeNo = requestDTO.getTypeNo();
        String typeName = requestDTO.getTypeName();
        BigDecimal price = requestDTO.getPrice();
        Optional<ProductType> productType= productTypeRepository.findAllByProductNoAndTypeNo(product.getProductNo(),typeNo);
        if(productType.isPresent()){
            Type type = typeRepository.findByTypeName(typeName);
            ProductType entity = productType.get();
            entity.setTypeNo(type.getTypeNo());
            entity.setTypeName(type.getTypeName());
            entity.setProduct(product);
            entity.setPrice(price);
            productTypeRepository.save(productType.get());
        }
    }
    @Override
    public ProductResponseDTO update(EditProductRequestDTO productRequestDTO) {
        Optional<Product> product = productRepository.findById(productRequestDTO.getProductNo());
        Category category = categoryRepository.findByCategoryName(productRequestDTO.getCategoryName());
        if(product.isPresent()){
            Product entity = product.get();
            entity.setProductNo(productRequestDTO.getProductNo());
            entity.setProductCode(productRequestDTO.getProductCode());
            entity.setProductName(productRequestDTO.getProductName());
            entity.setProductContent(productRequestDTO.getProductContent());
            entity.setCategory(category);
            entity.setCreatedBy(productRequestDTO.getCreatedBy());
            productRepository.save(product.get());
            updateProductColor(entity,productRequestDTO);
            updateProductType(entity,productRequestDTO);
        }
        else log.info("error");


        return null;
    }

//    public List<ProductResponseDTO> findProductColor(Product product,ProductResponseDTO productResponseDTOList) {
//        List<ProductColor> productColorList = productColorRepository.findAllByProductNo(product.getProductNo());
//        List<ProductColorDTO> productColorDTOList = productColorMapper.toDto(productColorList);
//        for(ProductColorDTO productColorDTO : productColorDTOList){
//            productResponseDTOList.setProductNo(product.getProductNo());
//
//        }
//    }
//    public void findProductType(Product product){
//        List<ProductType> productTypeList = productTypeRepository.findAllByProductNo(product.getProductNo());
//        productTypeList
//    }
}
