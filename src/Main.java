// Quincy Yarbrough
// 7-11-2024
// project to read a .txt file

import java.io.*;
import java.util.Scanner;

public class Main {
    // set scanner class
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String choice = "y";
        System.out.println("File Reader");

        // control statement
        while (choice.equalsIgnoreCase("y")) {
            String fileName = "";
            // get file path
            System.out.print("Enter a path to a file: ");
            fileName = sc.nextLine();

            // pull file and try to read it
            try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
                String line = in.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = in.readLine();
                }
            } catch (FileNotFoundException e) {
                System.out.println(fileName + " not found.");
            } catch (IOException e) {
                System.out.print(e);
            }

            // choice to go again
            System.out.print("Continue? (Y/N): ");
            choice = sc.nextLine();
        }
    }
}