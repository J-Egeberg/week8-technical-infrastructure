#Exercises for database population
This exercise is about populating a database of buildings.

For this exercise we will assume that a building has a street address, a contact person (name and telephone).

Also, each building has a number of rooms, each having a floor number, room number, no square meters, and no of windows.

##Exercise 1
Write the necessary SQL script to create the two tables. 

##Exercise 2
Make a domain class for building, at first without a collection of rooms. Write a method which can be called from main which will return a list of random buildings. The street address, contact person and telephone should look realistic.

##Exercise 3
Write a method which takes the list from exercise 2 and inserts all the building objects into the database from exercise 1. The method can be called from the main method. Verify by through MySQLWorkbench that the objects are inserted into the table.

##Exercise 4
Create a domain class for Room. Write a method which returns a list of rooms that makes up a plausible building. A plausible building has the same size on each floor, and there is some reasonable connection between number of windows and number of square meters - for example a room of 12 square meter do not have 10 windows.

##Exercise 5
Change the domain class of building so that each building has a list of rooms. Change the building generator to also add a list of rooms to each building.

##Exercise 6
Change the method from exercise 3 in such a manner that also all the rooms are inserted into the rooms table.





