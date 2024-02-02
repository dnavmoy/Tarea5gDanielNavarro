/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteA;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;



/**
 *
 * @author daniel
 */
public class Traductor {
    
    private Map<String,String> lista=new TreeMap<String,String>(); 

    public Traductor() {
    }

    public void addEntrada(String palabraExtranjera,String palabraEspanol){
        lista.put(palabraExtranjera, palabraEspanol);
        
    }
    public void borrarEntrada(String palabraExtranjera){
        lista.remove(palabraExtranjera);
    }
    
    public void modificarEntrada(String palabraExtranjera){
        lista.remove(palabraExtranjera);
        addEntrada(palabraExtranjera, Main.pedirTexto("palabra Español"));
    }
    
    public void mostrarPalabras(){
       lista.forEach((k,v)->System.out.println("ingles: " + k + "-- Español: "+ v));
    }
    public void traducir(String palabraExtranjera){
        System.out.println(lista.get(palabraExtranjera));
    }
    
    public void mostrarListaExtrajera(){
       lista.forEach((k,v)-> System.out.println(k));
    }
    public void mostrarListaEspañol(){
       lista.forEach((k,v)-> System.out.println(v));
    }
    
    
    public Map<String,String> getLista() {
        return lista;
    }

    public void setLista(Map<String,String> lista) {
        this.lista = lista;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.lista);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Traductor other = (Traductor) obj;
        return Objects.equals(this.lista, other.lista);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traductor{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }

  
    
    
    
    
}
