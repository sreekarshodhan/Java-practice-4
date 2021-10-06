package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //PROGRAM TO CHECK A LEAP YEAR METHOD 1:
        Scanner input = new Scanner(System.in);
       int year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("The year input is both centurian and leap year");
                }
                else{
                    System.out.println("The year input is century but not a leap year.");
                }
            }
            else{
                System.out.println("IT is not a centurian year but still a leap year");
            }

        }
        else{
            System.out.println("IT is not a leap year");
        }

        //METHOD 2:
        int year1 = input.nextInt();

        boolean leap = false;

        if (year1 % 4 == 0) {
            if (year1 % 100 == 0) {
                if (year1 % 400 == 0) {
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
            else{
            leap = true;}
        }
        else {
            leap = false;
        }
        if (leap) {
            System.out.println(year1 + "is a leap year");
        } else {
            System.out.println(year1 + "is not a leap year");
        }
    //NUMBER IS POSITIVE OR NEGATIVE
        int num =input.nextInt();
        boolean check =false;

        if(num >= 0){
            check = true;
        }
        else{
            check = false;
        }
        if(check){
        System.out.println(num+ "is a positive number");}
        else{
            System.out.println(num+ "is a negative number");
        }
    //  CHECK IF THE CHARACTER IS ALPHABET OR NOT
        String character = input.next();
        char c = character.charAt(0);

        if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
            System.out.println(c+ " is an alphabet");
        }
        else
            System.out.println(c+ " is not an alphabet");

    //SUM OF TWO NATURAL NUMBERS WITH FOR LOOP AND WHILE LOOP
    int n = input.nextInt();//Sum upto n natural numbers
    int sum = 0;
    for(int i= 0;i<=n; i++){
        sum+= i;

    }
        System.out.println(sum);
    int i=0;
    int sum2=0;
    while(i<=n){
        sum2+=i;
        i++;
    }
        System.out.println(sum2);
    //FACTORIAL OF NUMBERS:
        int number = input.nextInt();
          int factorial = 1;
          for(int i3=1; i3<=number; i3++){
              factorial*= i3;
              System.out.println(factorial);
         }
    //MULTIPLICATION TABLE:
    int number1 = input.nextInt();
    int result = 1;
    for(int i2=1; i2<=10;i2++){
        result = number1*i2;
        System.out.println(number+ "*" +i2+ "=" +result);
    }
    // FIBONACCI SERIES:
        int n1 = input.nextInt();
        int firstTerm = 0, secondTerm = 1;
        for(int i1= 0; i1<=n1; i1++){
            System.out.print(firstTerm+ " , ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    //FIBONACCI UPTO N NUMBERS:


                int n2 = 100, firstTerm1 = 0, secondTerm1 = 1;

                System.out.println("Fibonacci Series Upto " + n1 + ": ");

                while (firstTerm1 <= n2) {
                    System.out.print(firstTerm1 + ", ");

                    int nextTerm1 = firstTerm1 + secondTerm1;
                    firstTerm1 = secondTerm1;
                    secondTerm1 = nextTerm1;

                }
        //int mystery = 'z';
        //System.out.println(mystery);


    }
}
