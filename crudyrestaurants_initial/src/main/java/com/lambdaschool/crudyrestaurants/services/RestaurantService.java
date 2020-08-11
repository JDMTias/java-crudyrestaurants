package com.lambdaschool.crudyrestaurants.services;

import com.lambdaschool.crudyrestaurants.models.Restaurant;

//restaurant services is going to be an interface, because we are going to give the controllers
// methods they can call with their parameters list, and if we need to change things we want to
// change
// as little as we can to affect the controllers, that way the users aren't affected as much.
//so we are going to create another Service class called RestaurantServiceImpl(emantation)
public interface RestaurantService {
//    ***after payment impl is done***
//    we want to save a restaurant
    Restaurant save(Restaurant restaurant);
//    lets go implement it. RestaurantServiceImpl
}
