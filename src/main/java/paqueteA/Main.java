/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteA;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Main {

    public static void main(String[] args) {
        
        
        Traductor ingles = new Traductor();
        
        
        //si hago otro put con la misma clave sustituyo la clave
        ingles.addEntrada("hello", "hola");
        ingles.addEntrada("hello", "hola!");
        ingles.addEntrada("house", "casa");
        ingles.addEntrada("pencil", "lapiz");
        ingles.addEntrada("car", "coche");
        ingles.addEntrada("dog", "perro");
        ingles.addEntrada("plane", "avion");
        ingles.addEntrada("sword", "espada");
        ingles.addEntrada("freedom", "libertad");
        ingles.addEntrada("zebra", "cebra");
        //System.out.println("intorduce palabra inlges y luego español");
        //ingles.addEntrada(teclado.nextLine(), teclado.nextLine());
        ingles.mostrarPalabras();
        System.out.println("-- borrar entrada hello");
        ingles.borrarEntrada("hello");
        ingles.mostrarPalabras();
        System.out.println("--- cambiar entrada car");
        ingles.modificarEntrada("car","auto");
        ingles.mostrarPalabras();
        System.out.println("----------traducir house");
        ingles.traducir("house");
        System.out.println("lista palabras inlges");
        ingles.mostrarListaExtrajera();
        System.out.println("lista palabra español");
        ingles.mostrarListaEspañol();
        System.out.println("mostrar palabras v2");
        ingles.mostrarPalabras2();
        
        
    }
    
    public static String pedirTexto(String texto){
        Scanner teclado = new Scanner(System.in);
        System.out.println(texto);
        String devolver=teclado.nextLine();
        return devolver;
    }
}
