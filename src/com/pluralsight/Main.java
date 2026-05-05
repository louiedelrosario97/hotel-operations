package com.pluralsight;

public class Main {
    static void main()
    {
    Employee Justin = new Employee("67", "Justin", "Manager", 51.25, 50.00000232323);

    System.out.printf("%.2f",Justin.getTotalPay());
    }
}