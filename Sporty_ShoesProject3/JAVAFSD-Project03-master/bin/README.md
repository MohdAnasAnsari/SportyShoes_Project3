## Table of Contents

- [General Info](#General-info)
- [Problem Statement](#Description)
- [Using the application](#Using-the-application)
- [Technologies](#Technologies)
- [Setup](#Setup)

## General Info

This is a Full Stack Developer - Backend Project.

# Description

### Project objective:

As a Full Stack Developer, complete the features of the application by planning the development and pushing the source code to the GitHub repository.

Sporty Shoes is a company that manufactures and sells sports shoes. They have a walk-in store, and now, they wish to launch their e-commerce portal sportyshoes.com.

You’re asked to develop a prototype of the application. It will be then presented to the relevant stakeholders for budget approval. Your manager has set up a meeting where you’re asked to do the following:

* Presenting the specification document which has the product’s capabilities, appearance, and user interactions

* Setting up Git and GitHub account to store and track your enhancements of the prototype

* Explaining the Java concepts used in the project

* Discussing the generic features of the product:

* There will be an admin to manage the website. An administrator login will be required to access the admin page.

The admin should be able to change his password if he wants, he should be able to:

* Manage the products in the store including categorizing them

* Browse the list of users who have signed up and be able to search users

* See purchase reports filtered by date and category 

### The flow and features of the application:

* Plan more than two sprints to complete the application

* Document the flow of the application and prepare a flow chart

* List the core concepts and algorithms being used to complete this application

* Implement the appropriate concepts such as exceptions, collections, and sorting techniques for source code optimization and increased performance


You must use the following:

* Eclipse/IntelliJ: An IDE to code for the application

* Java: A programming language to develop the controller, databases, and others

* SQL: To create tables for admin, product, and other specifics

* Git: To connect and push files from the local system to GitHub

* GitHub: To store the application code and track its versions

* Scrum: An efficient agile framework to deliver the product incrementally

* Search and Sort techniques: Data structures used for the project

* Specification document: Any open-source document or Google Docs


Following requirements should be met:

* The source code should be pushed to your GitHub repository. You need to document the steps and write the algorithms in it.

* The submission of your GitHub repository link is mandatory. In order to track your task, you need to share the link of the repository. You can add a section in your document.

* Document the step-by-step process starting from sprint planning to the product release.

* Application should not close, exit, or throw an exception if the user specifies an invalid input.

* You need to submit the final specification document which includes:

    * Project and developer details

    * Sprints planned and the tasks achieved in them

    * Algorithms and flowcharts of the application

    * Core concepts used in the project

    * Links to the GitHub repository to verify the project completion


## Using the application

These are the different controllers that are used to manage the data in backend.

<img alt = "Admin Controller" src = "https://github.com/Instantgaming2356/JAVAFSD-Project03/blob/master/Images/Screenshot%20(2110).png">

<img alt = "Customer Controller" src = "https://github.com/Instantgaming2356/JAVAFSD-Project03/blob/master/Images/Screenshot%20(2111).png">
 
<img alt = "Product Controller" src = "https://github.com/Instantgaming2356/JAVAFSD-Project03/blob/master/Images/Screenshot%20(2112).png">

<img alt = "Purchased Product Controller" src = "https://github.com/Instantgaming2356/JAVAFSD-Project03/blob/master/Images/Screenshot%20(2113).png">

<img alt = "User Controller" src = "https://github.com/Instantgaming2356/JAVAFSD-Project03/blob/master/Images/Screenshot%20(2114).png">

This is New Image of the contents in the Database showing One-To-Many Relations.

<img alt = "Database Screen" src = "https://github.com/Instantgaming2356/JAVAFSD-Project03/blob/master/Images/Screenshot%20(2109).png">

1. User will have three choice to perform certain operations

    a. If User has selected "admin".

    b. If user has selected "customer".

    c. If user has selected "login-user".

2. In admin section, user can perform CRUD operation on products that are going to be available in stock and along with user can manage their details, email and password.

3. In Customer section, user has to enter its details for purchasing any products along with productId that is present in available stock.
  
4. In Login user section, as the user can manage the user details along with email and password. They can also purchase the available product directly through their userId and productId. 

5. The admin  can also view all the customers (including users) that have done any purchasing in this portal. And also list of users that are registered in this portal.


## Technologies

Technologies used in project:

-java 8 \
-intelliJ \
-Spring Boot \
-MySql \
-For Testing - PostMan and Swagger-UI

## Setup

Run this as a Spring Boot App or right-click and "run all tests"

```
Right-Click on the project in Java IDE and run it as a spring boot app or run the main file.
```
