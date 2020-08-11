-- // last thursday we used seed data, and we had a single table and we loaded table from that
-- // single table, this time its similar except we have multiple table to deal with, the biggest
-- // issue is that you have to deal with id's
-- // first thing we do is we want to make sure that we remove everything from the database
-- // now since we are dealing with a (local) in memory database once we close it all the data
-- will go away, however in the industry it is not the case so thats why we do this.
DELETE
FROM restaurantpayments;

DELETE
FROM payments;

DELETE
FROM menus;

DELETE
FROM restaurants;

-- // next we insert the payment like we did with employees.
-- // no need to worry about the relationship because there is no foreign key within the table

INSERT INTO payments (paymentid, type)
    VALUES (1, 'Cash'),
           (2, 'Credit Card'),
           (3, 'Mobile Pay');

-- // next insert restaurants.
-- // no need to worry about the relationship because there is no foreign key within the table
INSERT INTO restaurants (restaurantid, name, address, city, state, telephone, seatcapacity)
    VALUES (1, 'Apple', '123 Main Street', 'City', 'ST', '555-555-1234', 15),
           (2, 'Eagle Cafe', '321 Uptown Drive', 'Town', 'ST', '555-555-5555', 24),
           (3, 'Number 1 Eats', '565 Side Avenue', 'Village', 'ST', '555-123-1555', 37);

-- // we do have to insert directly into restaurants payments, notice we dind't list the fields
-- here that means it is going to use whatever the default is and if you look at the diagram in
-- the read me you can see it has restaurantid first then paymentid second that is the default.
-- so we read the following restaurant 1 accepts every type of payment, restaurant two only
-- accepts mobile payment, and restaurant three only accepts card or mobile pay
INSERT INTO restaurantpayments
    VALUES (1, 1),
           (1, 2),
           (1, 3),
           (2, 3),
           (3, 2),
           (3, 3);

-- // the only place there is a foreing key is inside the menus table, this is the only place
-- where we have to deal with SQL and relationships
-- //we create a menu table,  menu id, give it a name, a price, then the restaurant that is
-- related to, restaurant id. we have to give it that foreign key.
INSERT INTO menus (menuid, dish, price, restaurantid)
    VALUES (4, 'Mac and Cheese', 6.95, 1),
           (5, 'Lasagna', 8.50, 1),
           (6, 'Meatloaf', 7.77, 1),
           (7, 'Tacos', 8.49, 1),
           (8, 'Chef Salad', 12.50, 1),
           (9, 'Tacos', 10.49, 2),
           (10, 'Barbacoa', 12.75, 2),
           (11, 'Pizza', 15.15, 3);

/*
We must tell hibernate the ids that have already been used.
The number must be larger than the last used id.
15 > 11 so we are good!
 */

alter sequence hibernate_sequence restart with 15;

-- // next we have three things left to do, we need to look at our data, how we can look at it
-- from the h2 console, how we can look at it from intellij and then finally seed data. These
-- notes will start at the bottom of the read me. unless otherwise noted...first though we are
-- going to run our app in the main class in CrudyRestaurantApplication
-- // if there are any errors this is where we find out.
