package Tasks.Week3;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        /* Task 1
         * Write a JAVA program to find the maximum between three numbers.
         */
        int num1=12, num2=13, num3=15;
        if (num1>num2&&num1>num3){
            System.out.println("The maximum among the three is "+num1);
        }
        else if(num2>num3){
            System.out.println("The maximum among the three is "+num2);
        }
        else{
            System.out.println("The maximum among the three is "+num3);
        }

        /* Task 2
         * Write a JAVA program to check whether a number is negative, positive, or zero.
         */
        int a=12;
        if (a>0){
            System.out.println("The number is positive");
        }
        else if(a<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }

        /* Task 3
         * Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
         */
        int b = 15;
        if (b%5==0&&b%11==0){
            System.out.println(a+"is divisible by 5 and 11");
        }
        else{
            System.out.println(a+"is not divisible by 5 and 11");
        }

        /* Task 4
         * Write a JAVA program to check whether a number is even or odd.
         */
        int c = 3;
        if (c%2==0){
            System.out.println(c+"is an even number");
        }
        else{
            System.out.println(c+"is an odd number");
        }

        /* Task 5
         * Write a JAVA program to check whether a year is a leap year or not. 
         * Hint: if year%4==0; if year%100!==0 ; year%400==0; 
         */
        int year = 2022;
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"is a leap year");
        }
        else{
            System.out.println(year+"is not a leap year");
        }

        /* Task 6
         * Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char alpha = scan.next().toLowerCase().charAt(0);
        if ((alpha >= 'a' && alpha <= 'z')){
            if (alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u'){
                System.out.println(alpha+" is a vowel");
            }
            else{
                System.out.println(alpha+" is a consonant");
            }
        }
        scan.close();

        
    }
}
