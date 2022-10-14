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

            }while(num > 0);
            String largestnumformatted = String.format("The largest number is %.2f",largestnum);

            System.out.println( largestnumformatted.replaceAll(",","."));


        }



    //todo Task 2
    public void stairs(){
        // input your solution here
        //System.out.printf(...) > für 2.Nachkomma stellen verwernden
        Scanner scanner;
        scanner = new Scanner(System.in);
        int n;
        int counter=0;
        System.out.print("n: ");
        n = scanner.nextInt();
        if(n>0) {
            for (int i = 1; i <= n; i++) {
                for (int x = 1; x <= i; x++) {
                    counter = counter + 1;
                    System.out.print(counter + " ");
                }
                System.out.println("");
            }
        }
        else {
            System.out.println("Invalid number!");
        }


    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int rows = 6;
        int staramount = 1;
        int spaceamount = 5;
        //Loop for the Rows
        for (int i=1; i<=rows; i++){
            //Loop for the spaces
            for(int y =1; y<=spaceamount;y++){
                System.out.print(" ");
            }
            //Loop for the Stars
            for(int x = 1; x<=staramount;x++){
                System.out.print("*");

            }
            System.out.println("");
            staramount = staramount+2;
            spaceamount = spaceamount -1;


        }

    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here

    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner scanner;
        scanner = new Scanner(System.in);
        int mark;
        int markcount = 0;
        int marksum = 0;
        int negmark=0;
        double averagemark;


        do {
            markcount++;
            System.out.print("Mark " + markcount + ": ");
            mark = scanner.nextInt();

            if(mark>5){  //Ask for the same Mark Num again if the mark is invalid
                System.out.println("Invalid mark!");
                System.out.print("Mark " + markcount + ": ");
                mark = scanner.nextInt();
            }
            if(mark==5){  //If the mark is a 5, count it
                negmark++;
            }
            //System.out.println("DEBUG: "+mark);
            marksum = (marksum+mark);

        }while(mark>0);
        markcount = markcount-1;
        averagemark = (double)marksum/(double)markcount;
        String averagemarkformatted = String.format("%.2f",averagemark);
        if(Double.isNaN(averagemark) && markcount == 0 ){  //Checks if the output is NaN (Not a Number) and replaces it with 0.00
            System.out.println("Average: 0.00");
            System.out.println("Negative marks: "+negmark);
        }else{
        System.out.println("Average: "+averagemarkformatted);
        System.out.println("Negative marks: "+negmark);}





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