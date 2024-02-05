/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteC;

import daw.Vaca;
import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author Dan_n
 */
public class MainC {
    
    public static void main(String[] args) {
        
        ListadoVaquerias listado = new ListadoVaquerias();
        
        listado.getListado().put(1, new VaqueriaOrdenada());
        listado.getListado().put(2, new VaqueriaOrdenada());
        listado.encontrarVaqueria(1).añadirVaca(new Vaca("1", LocalDate.of(2023, Month.MARCH, 12), "negra"));
        //System.out.println( listado.encontrarVaqueria(1));
        //System.out.println( listado.encontrarVaqueria(2));
        listado.listadoVaquerias();
        
    }
    
}
