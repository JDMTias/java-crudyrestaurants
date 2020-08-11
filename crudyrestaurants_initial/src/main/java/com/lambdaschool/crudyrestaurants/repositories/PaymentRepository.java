package com.lambdaschool.crudyrestaurants.repositories;

import com.lambdaschool.crudyrestaurants.models.Payment;
import org.springframework.data.repository.CrudRepository;

//remember if you accidentally make it a class instead of a interface you can just change class
// to interface and it will chage the type automatically.
//extend CrudRepository, its going to work with payment and payment id is of type long.
public interface PaymentRepository extends CrudRepository<Payment, Long> {
}

//Now we have our 3 repos that we needed. it is industry standard to have a repo for each model
// except the JoinTable(RestaurantPayment)
//next we create the services that we need them for, we know that we only want people to be
// accesing the restaurant and the payment, and if they want to acces menu items they have to go
// through restaurants, this is what we just decided, we already have a service for restaurant so
// lets create a service for payment.