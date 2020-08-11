# Java Reading CRUDy Restaurants The Starting Application

A student that completes this project shows that they can:

* Perform CRUD operations on an RDBMS using JPA and Hibernate (reading)
* Implement seed data using SQL statements
* Explain and use Spring Data Relationships
* Use the JsonIgnoreProperties annotation to prevent infinite loops
* Use JPA constructs to create advanced queries

## Introduction

This is a basic database scheme with restaurants, menus, payment system. This Java Spring REST API
 application will provide endpoints for clients to read various data sets contained in the
  application's data. This application is used as a starting point for the project.

### Database layout

The table layouts are as follows

* Restaurant is the driving table.
* Menus have a Many-To-One relationship with Restaurant. Each Restaurant has many menus.
*Each menu has only one Restaurant.
* Payments have a Many-To-Many relationship with Restaurants.

![Image of Database Layout](../java-crudyrestaurant-read-db.png)


* ***********Extra Notes*************
* once we are up and running we are wanting to take a look at our h2 console. leave application
 running since database is in memory.
* open up a browser window. and surf to localhost:2019/h2-console this was set up in the
 applicationProperties.
* if everything is set up correctly you will come into a h2 log in page.
* make sure saved setting is Generic H2
* the Driver Class has to be org.h2.Driver
*the JDBC(Java Data Base Connector) URL is where it can get a bit dicey, our application properties
 doesn't have it, for
 Spring Boot 2.2.x it is not needed for Spring Boot 2.3.x it is needed, so its not wrong to put
  it in there it all depends on the version you are using. 
 * the url should be* jdbc:h2:mem:testdb
 * the username is sa with no password
 * if non of these match up, they must changed to what is above. 
 * then you can click on the different methods? and run them to see what you get back. 
 * we weren't gettting any info back so we have to figure out what we did wrong, close h2, stopp
  the app from running. 
  * first lets check if we have data.sql and its in the right spot, its in the same folder as
   application properties,
   * next we check application properties
   * line 20 is our problem, we have initialization set to never, that means ignore the data.sql
   * that is not what we want we want to always load it. so we need to change it to always.
   * run it again
   * look at h2 console again. 
   * paused at 1:43:10 need to go back about a minute and write all that he says. in here. 
  
 


