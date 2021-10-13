### 1. [Exercise 4]

## Exercise 1
Advantages: 
* This is a standard MVC procedure and therefore easy to implement
* All components are dependent on one another for usage

Disadvantages: 
* Slower, and needs all pieces functioning in order to operate properly


## Exercise 2 - View Interface
Advantages:
*	Inverts the dependency between model and view, allowing us to take a different approach by depending on abstractions, not details

Disadvantages: 
* Not fully necessary as this is a small project with 1 function, and inverting dependencies creates complications for smaller projects



## Exercise 3 - Observer Pattern
Advantages:
* Observer pattern allows it to update quickly and immediately once an item is scanned
* Allows a one-to-many relationship between the CashRegister, the Display, and the TicketPrinter

Disadvantages: 
* Forces Display and TicketPrinter to wait for CashRegister for all inputs
* Without functioning CashRegister, Display and TicketPrinter become useless


