package com.pluralsight;

public class Reservation

{
    // Declared Variables
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    // Constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    // Getters
    public boolean isWeekend() { return isWeekend; }
    public int getNumberOfNights() { return numberOfNights; }
    public String getRoomType() { return roomType; }

    // Setters
    public void setRoomType(String roomType) { this.roomType = roomType; }
    public void setNumberOfNights(int numberOfNights) { this.numberOfNights = numberOfNights; }
    public void setIsWeekend(boolean weekend) { isWeekend = weekend; }

    // Derived Getters

    public double getReservationTotal()
    {
        return getPrice() * numberOfNights;
    }

    public double getPrice()
    {
        double rate = 0;

        if (roomType.equals("king")) { rate = 139.00; }
        else if (roomType.equals("double")) { rate = 124.00; }

        if (isWeekend) { return rate * 1.10; }
        else { return rate; }
    }

}