package com.company;

import com.company.model.Product;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

        Product product = new Product("keyboard");
        System.out.println(product.getName());
    }
}
