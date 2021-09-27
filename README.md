# Spring Boot Shopping Cart Web App

## About

It was made using **Spring Boot**, **Spring Security**, **Thymeleaf**, **Spring Data JPA**, **Spring Data REST **. 
Database is in memory **H2**.

There is a login and registration functionality included.

Users can shop for products. Each user has his own shopping cart (session functionality).
Checkout is transactional.

## How to run
Open the project using your favourite IDE.

Build the project then run the project main class.

This will start the application on port 8070.

Navigate to http://localhost:8070/home.

You may Login using :
username: user

password: password

Or simply register using the registration tab.

once registered login with your username and Password.

Only when logged in will you see the buy options on  the products.

when you click buy you will add that item to cart and the quantity in stock reduces by 1.

You can confirm this using Basmati Rice which when added to cart will have quantity zero when you return to the shop menu and thus won't show buy option.

You can add as many items as you want and the total will be calculated.

As of now the functionality allows adding one item at a time going back and forth between the cart and the home/shop tab.

you will be able to also check out from the cart once satisfied.
