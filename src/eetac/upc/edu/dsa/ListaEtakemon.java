package eetac.upc.edu.dsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanm on 21/02/2017.
 */
public class ListaEtakemon {

    public List<Eetakemon> lista = new ArrayList<Eetakemon>();

    public Eetakemon resultado;

    public void añadirEetakemon(Eetakemon e){
        lista.add(e);
    }

    //Borrar eetakemon por indice
    public void delEetakemon(int i){
        lista.remove(i);
    }

    //Listar Eetakemons
    public List<Eetakemon> mostrarLista(){
        return lista;
    }

    //Buscar eetakemon por nombre
    public Eetakemon searchByName(String nombre){
        for (int i=0; i<lista.size(); i++){
            if (lista.get(i).getNombre().equals(nombre)){
                resultado = lista.get(i);
            }
        }
        return resultado;
    }
}
