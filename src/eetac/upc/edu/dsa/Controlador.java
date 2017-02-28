package eetac.upc.edu.dsa;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by ivanm on 21/02/2017.
 */
public class Controlador {

    public Hashtable<Integer, Eetakemon> hastableEtakemon;

    public Controlador(){
        hastableEtakemon = new Hashtable();
    }

    int id = 0;
    public Eetakemon resultado;
    public Eetakemon resultado2;

    public void añadirEetakemon(Eetakemon e) {
        e.setId(id);
        hastableEtakemon.put(id, e);
        id++;
    }

    //Borrar eetakemon por indice
    public void delEetakemon(int i) {
        hastableEtakemon.remove(id);
    }

    //Listar Eetakemons
    public Enumeration<Eetakemon> mostrarLista() {
        Enumeration<Eetakemon> en = hastableEtakemon.elements();
        return en;
    }

    //Buscar eetakemon por nombre
    public Eetakemon searchByName(int idS) {
        return hastableEtakemon.get(idS);
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

