package com.spring.food.dto;

import com.spring.food.model.Food;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@Getter
public class FoodRequestDto {
    private String name;
    private int price;
    private Long restaurantId;
}
