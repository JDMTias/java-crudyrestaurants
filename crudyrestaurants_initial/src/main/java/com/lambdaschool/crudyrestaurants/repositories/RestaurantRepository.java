package com.lambdaschool.crudyrestaurants.repositories;

import com.lambdaschool.crudyrestaurants.models.Restaurant;
import org.springframework.data.repository.CrudRepository;
//First we are going to create a Restaurant repo interface.
// This is supposed to extend the class CrudRepository, going to be working with restaurant that
// it has to import because it is in a different paggage, and they use the Long Data type.
// Then we are going to create a Restaurant Service interface under services.
//
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
}
