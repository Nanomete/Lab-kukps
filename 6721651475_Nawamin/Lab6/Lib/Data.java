package Lib;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private ArrayList<String> data;
    Scanner input;

    public Data() {
        data = new ArrayList<>(); // ArrayList is a class that implements List interface
        input = new Scanner(System.in);
    }
    public void printMenu() {
        System.out.println("=====MENU=====");
        System.out.println("1) Add Text to back");
        System.out.println("2) Add Text at index");
        System.out.println("3) Edit Text");
        System.out.println("4) Remove Text by index");
        System.out.println("5) Remove Text by value");
        System.out.println("6) Exit");
    }
    public void printArr() {
        System.out.print("Data = ");
        for (String text : data) {
            System.out.print(text + " "); // text is a string in data
        }
        System.out.println();
        System.out.println();
    }

    // 1) Add Text to back
    public void addTextToBack() throws Exception {
        System.out.println("== Add Text to back ==");
        System.out.print("Input text: ");
        String text = input.nextLine();
        data.add(text);
        printArr();
    }

    // 2) Add Text at index
    public void addTextAtIndex() throws Exception {
        System.out.println("== Add Text at index ==");
        System.out.print("Input index: ");
        int index = input.nextInt();
        input.nextLine();
        System.out.print("Input text: ");
        String text = input.nextLine();
        data.add(index, text);
        printArr();
    }

    // 3) Edit Text
    public void editText() throws Exception {
        System.out.println("== Edit Text ==");
        System.out.print("Input index: ");
        int index = input.nextInt();
        input.nextLine();
        System.out.print("Input text: ");
        String text = input.nextLine();
        data.set(index, text);
        printArr();
    }

    // 4) Remove Text by index
    public void removeTextByIndex() throws Exception {
        System.out.println("== Remove Text by index ==");
        System.out.print("Input index: ");
        int index = input.nextInt();
        data.remove(index);
        printArr();
    }

    // 5) Remove Text by value
    public void removeTextByValue() throws Exception {
        input.nextLine();
        System.out.println("== Remove Text by value ==");
        System.out.print("Input text: ");
        String text = input.nextLine();
        data.remove(text);
        printArr();
    }
}
