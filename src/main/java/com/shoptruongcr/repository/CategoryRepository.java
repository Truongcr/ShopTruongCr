package com.shoptruongcr.repository;

import com.shoptruongcr.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query("Select c " +
            "from Category c " +
            "where c.categoryName in (:categoryName)")
    List<Category> findAllByCategoryName(Set<String> categoryName);

    @Query("Select c " +
            "from Category c " +
            "where c.categoryName = :categoryName")
    Category findByCategoryName(String categoryName);

    Category findByCategoryNo(Long categoryId);
}
