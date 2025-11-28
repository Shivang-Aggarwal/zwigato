package com.fullstack.zwigato.menu.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fullstack.zwigato.category.entity.Category;
import com.fullstack.zwigato.review.dto.ReviewDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuDTO {

    private Long id;

    private String description;

    @NotNull(message = "price is required")
    @Positive(message = "price must be positive")
    private BigDecimal price;

    private String imageUrl;

    @NotNull(message = "category id is required")
    private Long categoryId; // needed when adding a menu

    private MultipartFile imageFile; // for uploading the image

    private List<ReviewDTO> reviews;

}
