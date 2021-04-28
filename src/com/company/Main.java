package com.company;
import com.company.model.Product;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
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

        try {
            Scanner util =new Scanner(System.in);
            System.out.println("Articulo: ");
            String articulo = util.nextLine(); //sirve para capturar datos String
            System.out.println("Cantidad: ");
            int canti = util.nextInt(); //sirve para capturar datos de tipo Int
            System.out.println("Precio: ");
            double precio = util.nextDouble(); //sirve para capturar datos tipo Double

            System.out.println("\n\n--Factura---");
            System.out.println("Cantidad: "+canti);
            System.out.println("Articulo: "+articulo);
            System.out.println("Precio: "+precio);
            System.out.println("Importe: "+(canti*precio));
        }
        catch (InputMismatchException error1){
            System.out.println("A ocurrido un error de tipo: "+error1.toString());
        }
        catch (Exception error2){
            System.out.println("A ocurrido un error de tipo: "+error2.toString());
        }
        finally {
            //normalmente se utiliza para limpiar, pero como en este sistema no se usa tanta memoria
            //pues no fue necesaria usar un metodo tan grande, para fines didacticos solo imprimiremos texto
            System.out.println("Gracias por usar nuestro sistema");
        }

        //ciclo for
        for (int x = 0; x <= 10; x++){ //si qerer ir de 2 en 2 la expresion final seria x+=2
            System.out.println(x);
        }
        //para ejemplo de foreach usamos vectores
        char[] vector = new char[6];
        vector[0]='C';
        vector[1]='h';
        vector[2]='r';
        vector[3]='o';
        vector[4]='n';
        vector[5]='o';

        for (char letra: vector){
            System.out.print(letra);
        }
    }
}