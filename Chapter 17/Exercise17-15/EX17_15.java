/*
Name: Robert Riddle
Date: 11/10/2024

This program is a slightly modified version of exercise 17_14, it decrypts a file 
by subtracting 5 to every byte in the file. 

 */
import java.io.*;
import java.util.Scanner;

public class EX17_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input and output file names
        System.out.print("Enter input file name: ");
        String inputName = scanner.nextLine();
        System.out.print("Enter output file name: ");
        String outputName = scanner.nextLine();

        try ( // Finds encrypted file and creates new decrypted file
            RandomAccessFile encrypted = new RandomAccessFile(inputName, "r");
            RandomAccessFile decrypted = new RandomAccessFile(outputName, "rw");
        ) {
            int byteData;
            while ((byteData = encrypted.read()) != -1) {
                //  Subtracts 5 from the byte
                decrypted.write(((byte)byteData) - 5);
            }
            System.out.println("File decrypted!");
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}