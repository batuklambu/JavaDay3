import java.util.Scanner;
public class Javaday3Loop {
    public static void main(String[] args) {


//Question 1: Print a Multiplication Table

                int num = 12;

                for (int j = 1;j<= num;j++){
                    for (int i = 1;i<=num;i++){
                        System.out.print(i*j + "\t");
                    }
                    System.out.println();
                }

//Question 2: Find the Greatest Common Divisor
//Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
//Examples:
//Enter 2 and 4. The gcd is 2.
//Enter 16 and 24.  The gcd is 8.
//How do you find the gcd?
//Name the two input integers n1 and n2.
//You know number 1 is a common divisor, but it may not be the gcd.
//Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.


                Scanner input = new Scanner(System.in);

                System.out.print("Enter the first positive integer: ");
                int n1 = input.nextInt();

                System.out.print("Enter the second positive integer: ");
                int n2 = input.nextInt();

                int gcd = 1;
                int k = 2;
                while (k <= n1 && k <= n2) {
                    if (n1 % k == 0 && n2 % k == 0) {
                        gcd = k;
                    }
                    k++;
                }

                System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd + ".");



//  Question 3: Predict Future Tuition
//Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
//In how many years will the tuition be doubled

                int tuition = 10000;
                int years = 0;
                int futuretution = tuition*2;

                while(tuition < futuretution){
                    tuition *= 1.07;
                    years++;
                }
                System.out.println("Tution will be double in "+years+" years");



            }
        }




















