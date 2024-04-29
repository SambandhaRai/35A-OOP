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

        /* Task 7
         * Take the name, roll number, and field of interest from the user
         * and print in the format below: 
         * Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. 
         */
        Scanner scan1=new Scanner(System.in);
            System.out.println("What is your name?");
            String name=scan1.nextLine();
            System.out.println("Roll NO?: ");
            int roll= scan1.nextInt();
            System.out.println("Field of Interest? ");
            String interest=scan1.nextLine();
            scan1.close();
        System.out.println("Hey, my name is "+name+" My roll number is "+roll+" My field of interest is "+interest);

        /* Task 8
         * Take side of a square from user and print area and perimeter of it. 
         * Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
         * Take the attributes as user input.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int side = scan.nextInt();
        System.out.println("Area of square is: "+(side*side));
        System.out.println("Perimeter of square is: "+(2*side));
        System.out.println("Input Amount: ");
        int Amount = scan.nextInt();
        System.out.println("Input Rate: ");
        int Rate = scan.nextInt();
        System.out.println("Input Time in years: ");
        float Time = scan.nextFloat();
        System.out.println("Simple Interest is "+((Amount*Rate*Time)/100));
        System.out.println("Input base of triangle: ");
        int base = scan.nextInt();
        System.out.println("Input height of triangle: ");
        int height = scan.nextInt();
        System.out.println("Area of triangle is: "+(0.5*(base*height)));
        System.out.println("Enter length of cube ");
        int length = scan.nextInt();
        System.out.println("Volume of cube is "+(length*length*length));
        System.out.println("Input length: ");
        int cubLen =scan.nextInt();
        System.out.println("input breadth: ");
        int breadth = scan.nextInt();
        System.out.println("Input height: ");
        int cubHeight=scan.nextInt();
        System.out.println("Volume of cuboid is: "+(cubLen*breadth*cubHeight));
        scan.close();

        /* Task 9
         * Ask user to give two double input for length and breadth of a rectangle 
         * and print area type casted to int. */
        Scanner scan2=new Scanner(System.in);
        System.out.println("Input length");
        double len =scan2.nextDouble();
        System.out.println("Input Breadth: ");
        double bd = scan2.nextDouble();
        double area=len*bd;
       
        System.out.println("The area of rectangle is: "+ ((int)area));

        scan2.close();

        /* Task 10
         * Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;
         * a. If equal to or more than 70 -> First Class
         * b. If more than 59 -> Upper Second Class
         * c. If more than 49 -> Second class
         * d. If more than 39 -> Third class and if below than 40 the result is fail. 
         * Hint: Use ternary operator*/
                int math = 90;
                int physics = 80;
                int chemistry = 70;
                int total = math + physics + chemistry;
                String result=total > 70 ? "First Class" :
                 total > 59 ? "Upper Second Class" : 
                total > 49 ? "Second Class" :
                total > 39 ? "Third Class" : "Fail";
                System.out.println(result);
    }
}
