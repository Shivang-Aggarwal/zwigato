package com.fullstack.zwigato.category.repository;

import com.fullstack.zwigato.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepsitory extends JpaRepository<Category, Long> {
}
