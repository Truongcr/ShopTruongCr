package com.shoptruongcr.repository;

import com.shoptruongcr.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TypeRepository extends JpaRepository<Type,Long> {

    @Query("select t " +
            "from Type t  " +
            "where t.typeName = :typeName")
    Type findByTypeName(String typeName);
}
