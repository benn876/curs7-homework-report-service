package org.fasttrackit.reportservice.controller;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.reportservice.service.ReportService;
import org.fasttrackit.restaurant.api.model.PageInfo;
import org.fasttrackit.restaurant.api.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("reports")
public class ReportController {
    private final ReportService service;

    @GetMapping("restaurants")
    public PageInfo<Restaurant> getAllRestaurants() {
        return service.getAllRestaurants();
    }

    @GetMapping("restaurants/{restaurantId}")
    public Restaurant getRestaurant(@PathVariable Long restaurantId) {
        return service.getRestaurant(restaurantId);
    }
}
