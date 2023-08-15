# 🌱 Plant Nursery Management System : REST API for Online Plant Nursery Management 🌱
## Introduction
The Plant Nursery Management system API is a sophisticated digital solution tailored to address the challenges and needs of modern plant nurseries. This REST API enables a seamless experience for both administrators and users by providing core CRUD functionalities essential for any Plant Nursery Application. Crafted with precision and foresight, this API prioritizes user authentication at each interaction, ensuring data security and personalized user experiences. This robust project was brought to life by a dedicated team of back-end developers during an intensive project week at Masai School.

## Tech Stack
- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
## Modules
- Login, Logout Module
- Admin Module
- Plants Module
- Planters Module
- Seeds Module


## Overview of REST APIs in the Plant Store Management System
The Plant Store Management System employs a series of RESTful APIs designed to cover the wide array of functionalities required to efficiently manage the store. Each module/controller addresses specific concerns of the store, streamlining data flow and ensuring a seamless user experience.

## 1. Admin Controller (/admin)
Purpose: Centralized management functionalities.

Customer Management: Provides administrators the tools to view all registered customers. Additionally, admins can delete a customer, which might be useful in cases of fraudulent accounts or upon user requests.

Seed Management: Administrators have the flexibility to introduce new seed varieties to the inventory, update existing seed details, or remove seeds that are no longer available or relevant. This ensures the store's seed offerings remain fresh, updated, and in line with demand.

## 2. Login Controller
Purpose: User Authentication and Session Management.

User Authentication: By offering login functionalities, the application can provide a personalized experience for users. It ensures only authorized individuals can access specific features, making transactions secure.

Session Control: The logout endpoint helps in maintaining the integrity of user sessions. It ensures that sessions are closed properly, reducing the risk of unauthorized access or session hijacks.

## 3. Order Controller (/order)
Purpose: Order Lifecycle Management.

Order Creation & Retrieval: Users can place new orders for plants, seeds, or planters, making the shopping experience straightforward. They can also view their order history, allowing them to repurchase or review past orders.

Order Modifications: For instances where users might want to modify or cancel their orders, the update and delete functionalities offer flexibility in order management.

## 4. Plant Controller
Purpose: Inventory and Information Management for Plants.

Plant Information: Allows users and administrators to view details of different plant varieties. This is especially useful for customers looking to make purchase decisions.

Inventory Updates: Admins can add new plant varieties, update existing plant details, or remove plants based on inventory changes, seasonality, or demand shifts.

## 5. Planter Controller
Purpose: Inventory and Information Management for Planters.

Planter Display: Users can view different planter options, designs, sizes, and prices to decide which best fits their needs.

Inventory Control: As with plants and seeds, admins can keep the planter inventory updated by adding, modifying, or deleting planter entries.

## 6. Seed Controller
Purpose: Inventory and Information Management for Seeds.

Seed Catalog: Provides users with a comprehensive view of available seeds, their specifications, planting instructions, etc.

Inventory Adjustments: Admins can regulate seed offerings based on seasonal availability, demand, or any other strategic reasons.

## Features
- User and Admin authentication & validation with session uuid.
### Admin Features:
* Administrator Role of the entire application
* Only  admins can add/update/delete plants, planters, seeds from main database
* Admin can access the details of different users and orders.
### User Features:
* Registering themselves with application, and logging in to get the valid session token
* Viewing list of available plants, planters, seeds and order items of them.
* Only logged in user can access his orders, profile updation and other features.

## Installation & Run
- Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database config.
    server.port=8886

    spring.datasource.url=jdbc:mysql://localhost:3306/plantdb
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root

API Root Endpoint
https://localhost:8886/

http://localhost:8886/swagger-ui/



# ER DIAGRAM OF PLANT NURSERY MANAGEMENT APPLICATION


![ER Diagram of Plant Nursery Project](https://user-images.githubusercontent.com/101380040/193456250-c8fea983-dd1c-4888-a967-94ebfad02748.jpeg)

