package ru.mirea.task15.task1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "D://учеба//Джава//task15//task1.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String txt = in.nextLine();
        in.close();
        try (FileOutputStream output = new FileOutputStream(file)) {
            System.out.println("File has been successfully opened");
            byte[] buf = txt.getBytes();
            output.write(buf,0,buf.length);
            output.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}

class Main_2 {
    public static void main(String[] args) {
        String path = "D://учеба//Джава//task15//task1.txt";
        File file = new File(path);

        try (FileInputStream input = new FileInputStream(file)) {
            System.out.println("File has been successfully opened");
            int i=-1;
            while((i=input.read())!=-1) System.out.print((char)i);
            input.close();

            System.out.println("The file has been successfully read");
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Main_3 {
    public static void main(String[] args) {
        String path = "D://учеба//Джава//task15//task1.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String txt = in.nextLine();

        try {
            System.out.println("File has been successfully opened");
            FileWriter fstream1 = new FileWriter(path);
            BufferedWriter out1 = new BufferedWriter(fstream1);
            out1.write("");
            out1.close();

            FileOutputStream output = new FileOutputStream(file);
            byte[] buf = txt.getBytes();
            output.write(buf,0,buf.length);
            output.close();
            System.out.println("The file has been successfully rewritten");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Main_4 {
    public static void main(String[] args) {
        String path = "D://учеба//Джава//task15//task1.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line to append: ");
        String txt = in.nextLine();

        try {
            FileWriter fw = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            System.out.println("File has been successfully opened");

            out.println(txt);
            out.close();

            System.out.println("The text has been successfully appended");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}