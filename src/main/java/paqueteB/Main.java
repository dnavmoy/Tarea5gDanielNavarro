/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteB;

/**
 *
 * @author daniel
 */
public class Main {
    
    public static void main(String[] args) {
        Decimos nuevo = new Decimos();
        nuevo.mostrar();
        nuevo.consultarPremio(Integer.parseInt(paqueteA.Main.pedirTexto("introduce numero")));
    }
    
    
    
}
