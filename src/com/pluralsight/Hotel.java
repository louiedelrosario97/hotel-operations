package com.pluralsight;
// Checks if rooms are available for the current day
// The hotel has 2 types of rooms "King Suite" and " Basic Double"

public class Hotel {
    // Declared Variables
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // Constructor 1
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // Constructor 2 ???
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // Derived Getters
    public int getAvailableSuites() { return numberOfSuites - bookedSuites; }

    public int getAvailableRooms() { return numberOfRooms - bookedBasicRooms; }

    // Action Methods
    public void roomRequest() { }

    public boolean bookRoom(int roomQuantity, boolean isSuite) // Returns true/false AND updates 'bookedSuites'
    {
        if (isSuite)
        {
            if (roomQuantity <= getAvailableSuites())
            {
                roomQuantity += bookedSuites;
                return true;

            } else { return false; }

            else
            {
                if (roomQuantity <= getAvailableRooms())
                {
                    roomQuantity += bookedSuites;
                    return true;

                } else { return false; }
            }
        }
    }
}
