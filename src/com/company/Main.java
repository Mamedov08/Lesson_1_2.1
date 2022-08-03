package com.company;

public class Main {

    public static void main(String[] args) {
        int temperature = 36;
        int numberOfStudents = 22;
        boolean isRainy = false;

        if (numberOfStudents == 22) {
            System.out.println("Play football !!!");
        }
        if (temperature < 0){ // меньше нуля
            System.out.println("Play hockey !!!!");
        }
        if (temperature >30) {
            System.out.println("Go swimming");
        } else {
            System.out.println("Stay at home");
        }
    }
}