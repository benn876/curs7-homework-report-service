package org.fasttrackit.reportservice.service;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.restaurant.api.model.PageInfo;
import org.fasttrackit.restaurant.api.model.Restaurant;
import org.fasttrackit.restaurant.client.RestaurantClientIT;
import org.fasttrackit.restaurant.client.exceptions.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReportService {
    private final RestaurantClientIT restaurantClient;

    public PageInfo<Restaurant> getAllRestaurants() {
        return restaurantClient.restaurants().all();
    }

    public Restaurant getRestaurant(Long restaurantId) {
        return restaurantClient.restaurants().get(restaurantId)
                .orElseThrow(() -> new ResourceNotFound("Could not find restaurant with id %s".formatted(restaurantId)));
    }
}
