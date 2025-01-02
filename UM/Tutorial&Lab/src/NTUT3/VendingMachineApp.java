package NTUT3;

public class VendingMachineApp {
    /*
    *a) Discuss the design of the VendingMachine class and how it can be improved.
    * Encapsulation of Workflow: The workflow for selecting a drink, inserting coins, checking change, and printing a receipt is well-structured.
    *
    * Areas for Improvement:
    Hardcoding of Drink Options:
    Drinks and prices are hardcoded into the selectDrink method.
    Improvement: Use a Drink class and store drinks in a collection (e.g., an array or list) to make the code more maintainable and extensible.
    *
    * Limited Reusability:

    The vending machine workflow runs only once in the constructor.
    Improvement: Implement a reusable method to allow multiple transactions without creating a new object.
    *
    *
    *
    * b) Relevant Class to Relate to VendingMachine
    * A relevant class to relate to the VendingMachine class could be a Drink class. Here’s why:

    Encapsulation: Encapsulate drink-related data like name and price.
    Extensibility: Makes it easier to add or modify drink options.
    *
    *
    * c) Suggest how the application can be re-designed to involve the class in (b)?
    *
    * Encapsulate Drink Information:

    Use the Drink class to represent individual drink options, including attributes like name and price.
    Store Drinks in an Array:

    Use an array to store multiple Drink objects for easier indexing and management.
    Redesign the selectDrink Method:

    Display all drinks using a loop over the Drink array.
    Validate the user’s selection to ensure it's within bounds.
    *
    * Improve Maintainability:

    Make the drink list dynamic. To add or modify drinks, changes are only needed in the array initialization.
    * */


}
