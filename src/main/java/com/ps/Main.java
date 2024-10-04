package com.ps;
import java.util.Scanner;



public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Vehicle [] vehicle = new Vehicle[20];


    public static void main(String [] args){

        int mainMenuCommand;
        int count = 6;
        vehicle[0] = new Vehicle(101121, "Ford Explorer","Red",45000,13500);
        vehicle[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicle[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicle[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicle[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicle[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);
        do {
            System.out.println("What do you want to do?");
            System.out.println("1) List all vehicles");
            System.out.println("2) search by make/model");
            System.out.println("3) Search by price range");
            System.out.println("4) Search by color");
            System.out.println("5) Add a vehicle");
            System.out.println("0) quit");
            System.out.println("Enter your command");

            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    allVehicles();
                    System.out.println("What would you like to do next? 1) Go back to menu 2)quit");
                    int response = scanner.nextInt();
                    if (response == 2){
                        mainMenuCommand = 6;
                    }
                    //System.out.println("testing");
                    break;
                case 2:
                    //searchByMake()
                    break;
                case 3:
                    //searchByPrice()
                    break;
                case 4:
                    //SearchByColor()
                    break;
                case 5:
                    //Add a vehicle()
                    break;
                case 6:
                    System.out.println("You choose to quit");
                default:
                    System.out.println("command not found please try again!");

            }

        } while(mainMenuCommand !=6);





};
    public static void allVehicles(){
        for(int i = 0; i < vehicle.length; i++){
            if(vehicle[i]!= null){
            System.out.println(vehicle[i].getMakeModel());
            }

        }





    }
}