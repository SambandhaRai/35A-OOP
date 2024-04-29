package Tasks.Week2;

import java.util.Scanner;

public class OpTask {
    public static void main(String[] args) {
        /* Task 1
         * Write a program to print whether a variable is greater or equal to 18
         */
        int v = 20;
        boolean rExpression = v > 18;
        System.out.println("Is the variable greater than 18 ? " + rExpression);
        
        
        /* Task 2
         * Write a program to print simple interest from variables
         * Make 3 variables for amount, time and rate and save the calculation into a variable formula
         * s1 = amount * time * rate / 100
         */
        int amount = 200;
        int time = 2;
        float rate = 2.3f;
        float s1 = (amount * time * rate)/100f;
        System.out.println(s1);

        /* Task 3
         * Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
         */
        float l = 2.3f;
        float w = 4.5f;
        float h = 3f;
        float vcb = l * w * h;
        float s = 2f;
        float vc = s*s*s;
        System.out.println("Volume of Cuboid " + vcb);
        System.out.println("Volume of Cube " + vc);

        /* Task 4
         * Complete task1 using ternary operator
         */
        int v1 = 2;
        String com = v1 > 18 ? "True" : "False";
        System.out.println(com);

        /* Task 5
         * Write a program to take two integer inputs from the user and print the sum and product of them.
         */
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = user.nextInt();
        System.out.println("Enter another number:");
        int num2 = user.nextInt();
        int sum = num1 + num2;
        int prod = num1 * num2;
        System.out.println("Sum = "+ sum);
        System.out.println("Product = "+ prod);
        user.close();
    }
}
