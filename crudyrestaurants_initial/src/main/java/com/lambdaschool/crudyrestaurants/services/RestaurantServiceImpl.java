package com.lambdaschool.crudyrestaurants.services;

import com.lambdaschool.crudyrestaurants.models.Restaurant;
import com.lambdaschool.crudyrestaurants.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//this is going to implement RestaurantService, it is also going to need the repo for rest so we
// autowired the repo for restaurant.
// remember this is a service this will be running in the background and Spring is going to
// manage it. we will comeback and make more changes but we have our basic flow and we are ready
// to start creating new tables. we are going to work on menus model first.
@Service(value = "restaurantService")
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    RestaurantRepository restrepos;
//    because only services are allowed to use the repo (industry standard);
//    ***after addind a method to Restaurant Service***
//    no need to autowired since we already did that, generate override methods of the method
//    that we just created in RestaurantService, we are going to have it save my restaurant from
//    the repo. we are allowing spring data module to saving the restaurant, all the menu items
//    and any relationships to payments so that .save is very useful and it is from the
//    CrudRepository abstract class.
    @Override
    public Restaurant save(Restaurant restaurant) {
        return restrepos.save(restaurant) ;
    }
//    at this point we should be able to test our code out....before we do that we need to talk
//    about seed data. go to data sql.
}
