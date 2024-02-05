/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author Dan_n
 */
public class ListadoVaquerias {
    
    private Map<Integer,VaqueriaOrdenada> listado;

    public ListadoVaquerias() {
        listado=new HashMap<>();
    }

    public Map<Integer,VaqueriaOrdenada> getListado() {
        return listado;
    }

    public void setListado(Map<Integer,VaqueriaOrdenada> listado) {
        this.listado = listado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.listado);
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
        final ListadoVaquerias other = (ListadoVaquerias) obj;
        return Objects.equals(this.listado, other.listado);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListadoVaquerias{");
        sb.append("listado=").append(listado);
        sb.append('}');
        return sb.toString();
    }
    
    
    public VaqueriaOrdenada encontrarVaqueria(int id){
        
        return listado.get(id);
        
    }
    
    public void listadoVaquerias(){
        listado.forEach((k,v)-> System.out.println(v));
    }
    
    public  ArrayList<VaqueriaOrdenada> obtenerVaquerias(){
        ArrayList<VaqueriaOrdenada> listadoVaquerias = new ArrayList<>(listado.values());
        
        return listadoVaquerias;
    }
    
    
}
