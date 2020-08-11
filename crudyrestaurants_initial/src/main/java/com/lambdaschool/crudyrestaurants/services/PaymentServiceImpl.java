package com.lambdaschool.crudyrestaurants.services;

//its going to implement paymentService, it is a service so we need to tell it it is a service
// and give it a value. Once done go back to PaymentService.

import com.lambdaschool.crudyrestaurants.models.Payment;
import com.lambdaschool.crudyrestaurants.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "paymentService")
//notice how sometimes we give things values and other times we give them names, the name is
// something you called something, a value is something you will be using inside of our program,
// its a special type of name we will actually be using unlike name.
public class PaymentServiceImpl implements PaymentService {
//    once PaymentService is done
//    we need to autowired in our Payment Repo, and call it paymentrepos(banana word)
    @Autowired
    PaymentRepository paymentrepos;
//    now we need to implement the methods from the service, right click, generate, genereate
//    override methods. the one that is specific to our interface is save so generate that one.
//    it will generate something that doens't work but it will at least compile (return null).We
//    want it to go into the repo and save the payment that is sent to us.
    @Override
    public Payment save(Payment payment) {
        return paymentrepos.save(payment);
    }
//    that is it for now. next,  we want to do the same thing with restaurantservice, we want to
//    save a
//    restaurant.
}
