package com.fullstack.zwigato.review.repository;

import com.fullstack.zwigato.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByMenuIdOrderByIdDesc(Long menuId);

    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.menuId = :menuId")
    Double calculateAverageRatingByMenuId(@Param("menuId") Long menuId);

}
