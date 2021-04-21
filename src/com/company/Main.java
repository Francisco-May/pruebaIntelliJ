package com.company;
import com.company.model.Product;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

        Product product = new Product("keyboard");
        System.out.println(product.getName());

        int num1=20;
        int num2=10;

        System.out.println("El resultado es: "+(num1+num2));

        byte dia = 3;
        String nombredia;
        switch (dia){
            case 1: nombredia ="Lunes";
            break;
            case 2: nombredia="Martes";
                break;
            case 3: nombredia="Miercoles";
                break;
            case 4: nombredia="Jueves";
                break;
            case 5: nombredia="Viernes";
                break;
            case 6: nombredia="Sabado";
                break;
            case 7: nombredia="Domingo";
                break;
            default:nombredia="Dia INVALIDO";
            break;
        }
        System.out.println(nombredia);


        Scanner util =new Scanner(System.in);
        System.out.println("Articulo: ");
        String articulo = util.nextLine();
        System.out.println("Cantidad: ");
        int canti = util.nextInt();
        System.out.println("Precio: ");
        double precio = util.nextDouble();

        System.out.println("\n\n--Factura---");
        System.out.println("Cantidad: "+canti);
        System.out.println("Articulo: "+articulo);
        System.out.println("Precio: "+precio);
        System.out.println("Importe: "+(canti*precio));

    }
}