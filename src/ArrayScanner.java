import java.util.Scanner;
public class ArrayScanner {
    public static void main(String[] args) {

        //  Write some Java code that asks the user how many favorite things they have. Based on their answer,
// you should create a String array of the correct size. Then ask the user to enter the things
// and store them in the array you created. Finally, print out the contents of the array


        Scanner scanner = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int numFavorites = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        String[] favoriteThings = new String[numFavorites];

        for (int i = 0; i < numFavorites; i++) {
            System.out.print("Enter favorite thing #" + (i + 1) + ": ");
            favoriteThings[i] = scanner.nextLine();
        }

        System.out.println("Your favorite things:");
        for (int i = 0; i < numFavorites; i++) {
            System.out.println((i + 1) + ". " + favoriteThings[i]);
        }


    }
}









