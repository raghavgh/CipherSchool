package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Map<String, Product> products = new HashMap<>();
        ArrayList<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your budget : ");
        double budget = sc.nextDouble();
        int choice;
        while (true) {
            System.out.print("1. Add an item\n2. Exit\nEnter Your choice : ");
            choice = sc.nextInt();
            if (choice == 1) {
                try {
                    System.out.print("Enter product : ");
                    String product = sc.next();
                    sc.nextLine();
                    System.out.print("Enter quantity : ");
                    double quantity = sc.nextDouble();
                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();
                    if (price <= budget) {
                        if (products.containsKey(product)) {
                            Product productObj = products.get(product);
                            budget += productObj.getPrice();
                            productObj.setPrice(price);
                            productObj.setQuantity(quantity);
                            budget -= price;
                        } else {
                            Product productObj = new Product(price, quantity, product);
                            products.put(product, productObj);
                            list.add(productObj);
                            budget -= price;
                        }
                    } else {
                        System.out.println("Can't Buy the product ###(because budget left is " + budget + ")");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                break;
            }
            System.out.println("Amount left : " + budget);
        }
        if (budget >= 0) {
            for (Product product : list) {
                if (product.getPrice() <= budget) {
                    System.out.println("Amount left can buy you " + product.getProductName());
                    break;
                }
            }
        }
        System.out.println("GROCERY LIST is:\n");
        System.out.println("Product name   Quantity   Price\n");
        for (Product product : list) {
            System.out.print(product.getProductName() + "      " + product.getQuantity() + " kg   " + product.getPrice() + "\n");
        }
    }
}
