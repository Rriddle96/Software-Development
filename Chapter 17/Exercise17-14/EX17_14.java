/*
Name: Robert Riddle
Date: 11/10/2024

This program encodes a file by adding 5 to every byte in the file. This program
prompts the user to enter a input file and output file name and saves the encrypted
version of the input file to the output file.
 */
import java.io.*;
import java.util.*;

public class EX17_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input and output file names
        System.out.print("Enter input file name: ");
        String inputName = scanner.nextLine();
        System.out.print("Enter output file name: ");
        String outputName = scanner.nextLine();

        try ( // Finds file name and creates new output file
            RandomAccessFile unencrypted = new RandomAccessFile(inputName, "r");
            RandomAccessFile encrypted = new RandomAccessFile(outputName, "rw");
        ) {
            int byteData;
            while ((byteData = unencrypted.read()) != -1) {
                // Add 5 to the byte
            	encrypted.write(((byte)byteData) + 5);
            }
            System.out.println("File encoded successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}