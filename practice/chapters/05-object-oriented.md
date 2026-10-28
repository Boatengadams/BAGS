# Chapter 5 — Object-Oriented Programming

Represent a problem with classes, objects, and clear responsibilities.

## Task 28: Model a person

Create a `Person` with personal details and methods for basic actions.

- Reference: `src/OOP/Person.java`
- [ ] Each object stores its own details.
- [ ] An action can be called on a person object.
- Stretch: validate the data and add a method that updates the person's address.

## Task 29: Model rectangles

Store a rectangle's width and height and calculate its area and perimeter.

- References: `src/OOP/UML.java`, `src/OOP/RectangleProgram.java`
- [ ] Default and custom dimensions work.
- [ ] Three user-entered rectangles display correct measurements.
- Stretch: reject dimensions that are zero or negative.

## Task 30: Build an account class

Create an account with an ID, balance, and interest rate. Support deposits and withdrawals.

- References: `src/OOP/AccountClass.java`, `src/OOP/BANK/Account.java`
- [ ] A successful withdrawal reduces the balance.
- [ ] A withdrawal larger than the balance is rejected.
- [ ] Deposits update the balance.
- Stretch: calculate monthly interest and prevent negative deposits.

## Task 31: Connect clients, accounts, and transactions

Create clients who own accounts. Record deposits and withdrawals as transactions, then print each client's accounts.

- References: `src/OOP/BANK/Client.java`, `src/OOP/BANK/Account.java`, `src/OOP/BANK/Transaction.java`, `src/OOP/BANK/Main.java`
- [ ] Each client can have multiple accounts.
- [ ] Account transactions keep their type, amount, balance, date, and description.
- Stretch: add a transfer operation and ensure both balances update correctly.

## Task 32: Implement a game console interface

Define common directional methods and implement them in two different games.

- References: `src/Console/GamingConsole.java`, `src/Console/MarioGame.java`, `src/Console/CheeseGame.java`, `src/Console/Main.java`
- [ ] The same loop can issue commands to either game.
- [ ] Each game responds with its own actions.
- Stretch: add a third game without changing the command loop.

## Task 33: Model a shopping cart

Represent products and a cart. Add and remove products, then calculate the total.

- Reference: `src/OOP/OnlineShopping.java`
- [ ] Adding products changes the total.
- [ ] Removing a product updates the total.
- Stretch: add quantities, stock limits, and a receipt.

Continue to the [Chapter 6 capstone](06-capstone.md).
