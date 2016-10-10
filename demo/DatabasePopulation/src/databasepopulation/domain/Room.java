package databasepopulation.domain;

// each building has a number of rooms, each having a floor number, 
// room number, no square meters, and no of windows

// to turn this class into a proper Java class with 
// * private fields
// * getter and setters
// * constructor
// 1. Select menu "Refactor>Encapsulate fields"
// 2. Place the cursor after the the { of the Room class, and press ctrl-space
//    Or pick the menu "Source>complete code"
//    From the menu that pops up, pick the longer constructor (which has generate at the end of the line)
public class Room { 
    Building myBuilding;
    int floorNo;
    int roomNo;
    float size; // in square meters
    int noWindows;
}
