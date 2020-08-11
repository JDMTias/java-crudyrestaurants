package com.lambdaschool.crudyrestaurants.models;

import javax.persistence.*;

// looking at the read me we have restaurants and menus, menus have a dish, a rest, and a foreign
// key that points to the res table they also have their own Id, so we create menu first then
// connect it to restaurants table.
//it is going to be an Entity(because it is going into our database) and have a table name "menus"
// keeping with our standard of where our
// Class is singular and our Tables are Plural all lowerCase.


@Entity
@Table(name = "menus")

public class Menu {
//    we need an ID, all our our Ids will always be a long Data Type, they will always be private
//    . it is an ID so we have to give it the Id nottation, and we have to tell it how to make an
//    ID which we will have it be automated with GenerationType.Auto.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long menuid;

// our menu is going to have two things, a dish name which is a String  and a price which is a
// double. again they are both private, we don't want people to change these.
//    we dont' want the dish to ever be empty, we don't want it to be null so we can put a data
//    validation annotation @Column(nullable = false) it means it always has to have a value for
//    dish, so if our client tries to create a dish with no value then Spring will send out an
//    exception saying that is not possible. Column affects the very next field that shows up.
    @Column(nullable = false)
    private String dish;
    private double price;
//    one thing we need to do, remember that menu is connected to restaurant...there are many
//    menu items to a single restaurants...a ManyToOne relationship between menu and restaurants.
//    as you can see the in read me menus foreign id is restaurant id and we need to bring that in
//    so they can be joined, by adding a JoinColumn, restaurant id is the primary key inside of
//    restaurant. they both have to match exactly, case sensitive also. spring does not check
//    that for you, so even if you make an error and it doens't match it will still compile and
//    when you run it you will get a weird hibernate error.
//    we also want to make sure that every menu item has a single restaurant
    @ManyToOne
    @JoinColumn(name = "restaurantid", nullable = false)
    private Restaurant restaurant;
//    next is our constructors
//    the JPA requires us to create a default constructor. generate.constructor.selectnone.
    public Menu() {
    }
//    we also want to create a constructor that takes in all the sinlge type fields, nothing that
//    notice we don't bring in Id because that is automatically generated.

    public Menu(String dish, double price, Restaurant restaurant) {
        this.dish = dish;
        this.price = price;
        this.restaurant = restaurant;
    }
//    now we generate getters and setters for everything even ID(menuItemid)/ because we are going
//    to need
//    that once we get into testing next week.

    public long getMenuid() {
        return menuid;
    }

    public void setMenuid(long menuid) {
        this.menuid = menuid;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
//we have connected menu to Restaurant, so now we are going to go connect Restaurant to Menu.
