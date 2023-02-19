import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //      : Fill in the array with the values that would be stored after the code executes:
        //
        //        int[] list = {2, 18, 6, -4, 5, 1};
        //        for (int i = 0; i < list.length; i++) {
        //            list[i] = list[i] + (list[i] / list[0]);
        //
        //            System.out.println(list[i]);
        //        }

        //
        //
        //Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.

        int []  a = {1,2,3};
        for (int i = 0; i < a.length;i++) {
            System.out.println("Each Array element at index is " + i +" : " +a[i]);
        }

        //Write a program that returns the middle element in an array.
        // Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

        int [] array = {13,5,7,68,2};
        int middleindex = array.length/2;
        int middleelement = array[middleindex];

        System.out.println("The middle Element is  : "+ middleelement);

        //Write a program that creates an array of String type and initializes it with the strings
        // “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method.
        // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.

        String [] colors = { " red","green","blue","yellow"};
        System.out.println("length of color String is : "+colors.length);

        String [] colorscopy = colors.clone();

        System.out.println("colorscopy array is "+ Arrays.toString(colorscopy));

        //Write a program that creates an integer array with 5 elements (i.e., numbers).
        // The numbers can be any integers.  Print out the value at the first index and the
        // last index using length - 1 as the index. Now try printing the value at index = length
        // ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced.
        // Now try to assign a value to the array index 5. You should get the same type of exception.
        //
        int [] myArray =  {1,2,3,4,5};
        //        System.out.println("The value of first index is :" + myArray[0]);
        //        System.out.println("The value of last index is :" + myArray[myArray.length-1]);
        //        System.out.println("value at index is : "+ myArray[myArray.length]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //        myArray[5]=7;
        //        System.out.println("The value of last index is :" + myArray[5]); // Exception created

        //Write a program where you create an integer array with a length of 5.
        // Loop through the array and assign the value of the loop control variable (e.g., i)
        // to the corresponding index in the array.

        int [] arr1 = new int[5];

        for( int i = 0;i< arr1.length;i++){
            arr1[i]= i;
        }
        //print contents of the array

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        //Write a program where you create an integer array of 5 numbers. Loop through the array
        // and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.

        int [] arr2 = new int[5];

        for( int i = 0;i< arr2.length;i++){
            arr1[i]= i*2;
        }
        //print contents of the array

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr2[i]);
        }

        //Write a program where you create an array of 5 elements.
        // Loop through the array and print the value of each element, except for the middle (index 2) element.

        int [] arr3 = {10,20,30,40,50};

        for( int i = 0;i< arr3.length;i++){
            if(i!=2){
                System.out.println("The value of each element of arr3[" + i + "] = " + arr3[i]);

            }
        }

        //Write a program that creates a String array of 5 elements
        // and swaps the first element with the middle element without creating a new array.

        String [] str1 = {"a","b","c","d","e"};

        for( int i = 0;i< str1.length;i++) {
            System.out.println("str1[" + i + "] = " + str1[i]);

        }
        String temp = str1[0];
        str1[0]=str1[2];
        str1[2]=temp;

        System.out.println("\nModified array:");
        for ( int i = 0; i < str1.length; i++) {
            System.out.println("The string value is [" + i + "] = " + str1[i]);
        }

        //Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}
        // Print the array in ascending order, and print the smallest and the largest element of the arr
        // The output will look like the following:
        //Array in ascending order: 0, 1, 2, 4, 9, 13
        //The smallest number is 0
        //The biggest number is 13

        int [] num = {4,2,9,13,1,0};
        System.out.println("Array before sorting : " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Array after sorting : " + Arrays.toString(num));
        System.out.println("The smallest number is " + num[0]);
        System.out.println("The biggest number is " + num[num.length - 1]);
    }


    }



