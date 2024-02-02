/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteB;

import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author daniel
 */
public class Decimos {
 
     //private Map<String,String> lista=new TreeMap<String,String>(); 
    private Map<Integer,Double> lista = new TreeMap<Integer,Double>();
    private final int registros=1000;

    public Decimos() {
        rellenar();
    }

    
    public void rellenar(){
        Random r = new Random();
        for(int i=0;i<registros;i++){
        lista.put(r.nextInt(10000), r.nextDouble(100_000));
        }
    }
    public void mostrar(){
        lista.forEach((k,v)->System.out.println("numero %05d".formatted(k)+ " premio: "+ v));
    }
    
    public void consultarPremio(int numero){
        System.out.println("el premio del numero %05d".formatted(numero)+ " es: " +lista.get(numero));
    }
    
    public Map<Integer,Double> getLista() {
        return lista;
    }

    public void setLista(Map<Integer,Double> lista) {
        this.lista = lista;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.lista);
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
        final Decimos other = (Decimos) obj;
        return Objects.equals(this.lista, other.lista);
    }
    
    
    
}
