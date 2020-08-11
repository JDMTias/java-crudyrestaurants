package com.lambdaschool.crudyrestaurants.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//This is also an entity because it is going to go into our database. give it a name following
// our standards of singular class plural, lowercase tables.
@Entity
@Table(name = "payments")

//Payment is screaming at us because there is no primary key. so we give it a primary key called
// payment ID, of type long
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;
//    we will also have a type, which we will make it a string, unique and nullable
    @Column(unique = true, nullable = false)
    private String type;
//    we have now created a payments tables.
//    we will comeback and do getters, setters, etc later, first we need to connect this table to
//    our restaurant table. they will be connected with a many to many relationship. so we go
//    back to restaurant, this is a good place to have a split window so both restaurant and
//    payment are side by side.

//    ***This is to be done after setting up the relationship in restaurant class***
//    set up many to many relationship.
//    we don't have to redo our JoinTable here since we did it already in restaurant.
//    its already set up through the field payments. so we just use that.
    @ManyToMany(mappedBy = "payments")
//    then we create a set but in reverse form of what it is in Restaurant.
    private Set<Restaurant> restaurants = new HashSet<>();
//    now our payments table is done, next generate setters and getters and constructors.
    public Payment() {
    }
//    we are going to bring in the single item field, the one non collection field, which is
//    type, restaurant is a collectiong field.


    public Payment(String type) {
        this.type = type;
    }
//    now getters and setters of everything.


    public long getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(long paymentid) {
        this.paymentid = paymentid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
//    now we have a full payments class...
//    next we need to finish up restaurant...
}
