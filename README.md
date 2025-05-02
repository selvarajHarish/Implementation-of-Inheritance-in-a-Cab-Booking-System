# Implementation-of-Inheritance-in-a-Cab-Booking-System
# 🚕 Cab Booking System using Inheritance

This project is a Java-based **Cab Booking System** that demonstrates the core object-oriented programming concepts of **inheritance, method overriding, and polymorphism**. It allows users to book different types of cabs (Mini, Sedan, Luxury) and view their booking details.

## 🎯 Objective

The objective of this task is to design and implement a cab booking system using inheritance in Java.  
The system allows users to:

✅ Select different cab types (Mini, Sedan, Luxury)  
✅ Provide pickup and drop locations  
✅ View full booking details

The implementation demonstrates:

- Inheritance
- Method overriding
- Polymorphism


## Steps to Implement the Task

### Step 1: Create the Parent Class (`Cab.java`)

- Define a `Cab` class with attributes:
  - Pickup location
  - Drop location
  - Driver details
  - Car brand and model
  - Number of seats
  - Car number
  - Phone number
  - Ratings

- Create a **parameterized constructor** to initialize these attributes.

###  Step 2: Create Child Classes (`Mini.java`, `Sedan.java`, `Luxury.java`)

- Extend the `Cab` class.
- Add an **extra attribute**:
  - Price per km (specific to each cab type)
- Use constructors to initialize both parent and child class attributes.

### 📍 Step 3: Implement the Booking Process (`CabDriver.java`)

- Take **user input**:
  - Select cab type (Mini, Sedan, Luxury)
  - Enter pickup and drop locations

- Instantiate the corresponding cab class.
- Call the generalized method `bookingDetails()` to display the details.

### 📍 Step 4: Implement Generalized Booking Method (`OLA.java`)

- Create a static method:
  java
  public static void bookingDetails(Cab cab)
