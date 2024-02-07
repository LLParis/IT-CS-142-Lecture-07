import java.util.*;
import java.io.*;

public class Lecture07 {
  public static void boyGirl(Scanner scanner) {
    int boyCount = 0, girlCount = 0;
    int boySum = 0, girlSum = 0;
    boolean isBoy = true; // Assuming the first name is a boy's name

    while (scanner.hasNext()) {
      String name = scanner.next(); // Read the name
      if (scanner.hasNextInt()) {
        int number = scanner.nextInt(); // Read the associated number
        if (isBoy) {
          boyCount++;
          boySum += number;
        } else {
          girlCount++;
          girlSum += number;
        }
        isBoy = !isBoy; // Toggle the flag
      }
    }

    int difference = Math.abs(boySum - girlSum);
    System.out.println(boyCount + " boys, " + girlCount + " girls");
    System.out.println("Difference between boys' and girls' sums: " + difference);
  }

    public static void main(String[] args) throws FileNotFoundException {
      // SELF-CHECK PROBLEMS:
      // Note: you will need to put some of your answers inside a comments

      // Put your answer for #3 here:
      // Scanner input = new Scanner(new File( "example.txt"));

      // Put your answer for #5 here:
      // (The answer will be one of "A" or "B" or "C" or "D" or "E")
      // A because the Scanner is separating by whitespace.

      // Put your answer for #7 here:
      // 18

      // EXERCISES:

      // Put your answer for #1 here:
      // You will need to add the method in above main(), but then call it here
      Scanner scanner = new Scanner(new File("src/names.txt"));
      System.out.println("Enter names and integers (boys and girls alternately):");
      boyGirl(scanner);
      scanner.close();
    }
  }
