Coverage: 72%
# IMS Project

This IMS project covers Java, Maven, MYSQL, JUNIT testing all working together in one project. You can keep track of Customer data and create customers to be added to the customer table in the database, Once the customer is created you are able to update the customer to change the values or delete the customer completely. This project also gives you the capability to create and store Item objects, once an item is created you can update and change the values of an item or delete the item completely. The customer is tied to the orders of the project giving the customer an option to create an order and add items to the order. Items can be stored in the order using the Order/Items table which connects Items to Orders to handle the relationship between the two.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
You will need tp install Eclipse IDE you can find the download by searching Eclipse IDE
You will need to install MYSQL you can find this by searching mySQL you will also want mySQL workbench and the MySQL command line Client.
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
1. Open the project with eclipse
2. open the src/main/java folder
3. open the com.qa.ims package
4. double click on the Runner.Java class to open it.
5. right click inside the class and go down to run as and then 1 Java Application.
6. then at the bottom in the console you will see option like CUSTOMER ITEM ORDER.
7. Type in one of the options 
8. You then can type CREATE READ UPDATE DELETE 
9.  Type READ
10.You will then be presented with everything inside of the database you have selected.
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

You can run these tests by going into any testing class and right click and go down to run coverage as-junit 1. 
The tests for controllers will test the CRUD functions of the controller 
The tests for the DAO will test how the project is interacting with the database to insure everything is being submitted correctly.

### Unit Tests 

Explain what these tests test, why and how to run them

```
These tests test individual units or components to validate that each unit of the software code performs as expected.
You can run these tests by going into any testing class and right click and go down to coverage as-junit 1. 
You can then open the class that it is testing to see what the tests are doing and the lines will turn green if the test has passed and red if the test did not pass.

```

### Integration Tests 
Explain what these tests test, why and how to run them
An Integration test, tests the interface between two softwares 
```
In the DAO tests we are testing how our data is interacting between our project and MYSQL.
```

### And coding style tests

Explain what these tests test and why
these tests test every line of code in the project individually
```
In the some of the tests in this project you can see that some of the tests done test every line of code in the method it is testing.
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Don Uherka** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
