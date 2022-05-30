package com.shoptruongcr.repository;

import com.shoptruongcr.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ColorRepository extends JpaRepository<Color,Long>{

    @Query("select c " +
            "from COLOR c " +
            "where c.colorName = :colorName ")
    Color findByColorName(String colorName);
}
