# Order Processing System

This is an implementation of an Order Processing System for an online store using the **State Pattern**. The system allows orders to change their behavior based on their current state (e.g., New, Paid, Shipped, Delivered, Cancelled).

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [How It Works](#how-it-works)
- [Usage](#usage)
- [Classes Overview](#classes-overview)
- [License](#license)

## Features

- Define various order states and manage transitions between them.
- Handle actions like payment, shipping, delivery, and cancellation based on the current state.
- Demonstrate state-specific behavior through different scenarios.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor (e.g., IntelliJ IDEA, Eclipse, Visual Studio Code)

### Installation

1. Clone the repository or download the code files.
   ```bash
   git clone <repository-url>
Open the project in your favorite IDE or text editor.

Compile the Java files and run the Main class.

How It Works
The system consists of an Order class that maintains the current state and delegates actions to it. Each state is represented by a concrete class implementing the State interface. Actions such as payOrder, shipOrder, deliverOrder, and cancelOrder are defined in the interface and implemented in each concrete state class to handle the behavior specific to that state.

Usage
Create a new order:

java
Копировать код
Order order = new Order();
Perform actions based on the current state:

java
Копировать код
order.payOrder();      // Pay the order
order.shipOrder();     // Ship the order
order.deliverOrder();  // Deliver the order
order.cancelOrder();   // Cancel the order
Classes Overview
State: Interface that defines actions for order states.
NewState: Represents a new order.
PaidState: Represents a paid order.
ShippedState: Represents a shipped order.
DeliveredState: Represents a delivered order.
CancelledState: Represents a cancelled order.
Order: Class that maintains the current state and delegates actions to it.
Main: Class that demonstrates the order processing system's operation through various scenarios.