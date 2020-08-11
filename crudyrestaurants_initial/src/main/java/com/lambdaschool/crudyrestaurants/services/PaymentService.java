package com.lambdaschool.crudyrestaurants.services;

import com.lambdaschool.crudyrestaurants.models.Payment;

//next create the implementation for this then we comeback and add what we need to add.
// what we are doing with this entire application is creating our database, creating our tables
// for our databases in our models, and we are going to be laoding initial data into it, so we
// need to do a Create(save Data) method.
public interface PaymentService {
//    creating save data method, this will make it so other people can create a payment type and
//    save it. for today this is all we need. we will add more later on.
   Payment save(Payment payment);
//    lets go write a simple implementation of this.in the PaymentServiceImpl

}
