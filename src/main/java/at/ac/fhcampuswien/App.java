package at.ac.fhcampuswien;

import java.io.InputStream;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
            double num;
            double largestnum =0;
            int counter = 1;
            Scanner scanner;
            scanner = new Scanner(System.in);
            do{



                System.out.print("Number "+counter+": ");
                num = scanner.nextDouble();
                if(counter == 1 && num <=0) {
                    System.out.println("No number entered.");
                    return;
                }
                else if (num > largestnum){
                    largestnum = num;

                }

                counter++;

            }while(num != 0);
            String largestnumformatted = String.format("The largest number is %.2f",largestnum);
            System.out.print(largestnumformatted);


        }



    //todo Task 2
    public void stairs(){
        // input your solution here
        //System.out.printf(...) > für 2.Nachkomma stellen verwernden
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}