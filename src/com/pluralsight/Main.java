package com.pluralsight;

public class Main {
    static void main()
    {
    Employee Justin = new Employee("67", "Justin", "Manager", 50, 6);

    System.out.println(Justin.getHoursWorked());
    Justin.punchTimeCard(10, 11);
    System.out.println(Justin.getHoursWorked());

    }
}