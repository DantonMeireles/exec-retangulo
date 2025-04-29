package application;

import entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();
        System.out.println("Entre com a base e a altura do retangulo");
        System.out.println("");
        System.out.println("Base: ");
        retangulo.widht = sc.nextDouble();
        System.out.println("");
        System.out.println("Altura: ");
        retangulo.height = sc.nextDouble();

        System.out.println("Area: " + retangulo.area());
        System.out.println("Perimeter: " + retangulo.perimetro());
        System.out.println("Diagonal: " + retangulo.diagonal());

        sc.close();
    }
}
