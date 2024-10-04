package com.ps;
import java.util.Scanner;



public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        int mainMenuCommand;
        do {
            System.out.println("1) List all vehicles");
            System.out.println("2) search by make/model");
            System.out.println("3) Search by price range");
            System.out.println("4) Search by color");
            System.out.println("5) Add a vehicle");
            System.out.println("0) quit");

            System.out.println("Enter your command");
            mainMenuCommand = scanner.nextInt();

        } while(mainMenuCommand !=0);



    Vehicle [] vehicle = new Vehicle[20];

    int count = 6;
    vehicle[0] = new Vehicle(101121, "Ford Explorer","Red",45000,13500);
    vehicle[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
    vehicle[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
    vehicle[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
    vehicle[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
    vehicle[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

};
}