package eetac.upc.edu.dsa;

import java.util.*;

/**
 * Created by ivanm on 21/02/2017.
 */
public class Controlador {

    public Hashtable<Integer, Eetakemon> hashtableEtakemon;

    public Controlador(){
        hashtableEtakemon = new Hashtable();
    }

    int id = 0;

    public void añadirEetakemon(Eetakemon e) {
        e.setId(id);
        hashtableEtakemon.put(id, e);
        id++;
    }

    //Borrar eetakemon por indice
    public void delEetakemon(int i) {
        hashtableEtakemon.remove(id);
    }

    //Listar Eetakemons
    public Enumeration<Eetakemon> mostrarLista() {
        Enumeration<Eetakemon> en = hashtableEtakemon.elements();
        return en;
    }

    //Buscar eetakemon por nombre
    public Eetakemon searchByName(String nombre) {
        int idS = 0;
        List<Eetakemon> list2 = Collections.list(mostrarLista());
        for (int i=0; i<list2.size();i++){
            if (list2.get(i).getNombre().equals(nombre)){
                idS = list2.get(i).getId();
            }
        }
        return hashtableEtakemon.get(idS);
    }


    public List<Eetakemon> searchApproach(String aprox){
       List<Eetakemon> list2 = Collections.list(mostrarLista());
       List<Eetakemon> encontrado = new ArrayList<Eetakemon>();
       for (int i=0; i<list2.size();i++){
           if (list2.get(i).getNombre().contains(aprox)){
                encontrado.add(list2.get(i));
           }
       }
       return encontrado;
    }

    //BOLA EXTRA
    //Implementar una búsqueda adicional que no busque por nombre exacto sino por aproximado
  /*  public List<Eetakemon> searchApproach(String aprox) {

        List<Eetakemon> encontrado = new ArrayList<Eetakemon>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().contains(aprox)) {
                encontrado.add(lista.get(i));
            }
        }
        return encontrado;
    } */

}

