package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstructions();
	    while(!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - to print choice option");
        System.out.println("\t 1 - to print list of grocery items");
        System.out.println("\t 2 - to add an item to te list");
        System.out.println("\t 3 - to  modify and item in the list");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search for an item in the list");
        System.out.println("\t 6 - to quit the application");
    }
    public static void addItem(){
        System.out.print("enter the grocery item");
        groceryList.addGroceryItem(scanner.nextLine());

    }
    public static void modifyItem(){
        System.out.print("enter item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter replacement item");
        String newItem=scanner.nextLine();
        groceryList.modifyGtoceryItem(itemNo-1,newItem);
    }
    public static void removeItem(){
        System.out.print("enter item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }
    public static void searchForItem(){
        System.out.println("item to search");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem)!=null){
            System.out.println("found "+searchItem+" in grocery list");
        }else {
            System.out.println("item "+searchItem+" not in the list");
        }
    }
}
