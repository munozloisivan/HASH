package eetac.upc.edu.dsa;

import java.util.*;

/**
 * Created by ivanm on 21/02/2017.
 */
public class Controlador {

    public Hashtable<Integer, Eetakemon> hashtableEtakemon;
    public Hashtable<Integer, Usuario> hashtableUsuario;

    public Controlador(){
        hashtableEtakemon = new Hashtable();
        hashtableUsuario = new Hashtable();
    }

    int idEetakemonGenerated = 0;
    int idUsuarioGenerated = 0;


    //AÑADIR
    public void añadirEetakemon(Eetakemon e) {
        e.setId(idEetakemonGenerated);
        hashtableEtakemon.put(idEetakemonGenerated, e);
        idEetakemonGenerated++;
    }

    public void añadirUsuario(Usuario u){
        u.setId(idUsuarioGenerated);
        hashtableUsuario.put(idUsuarioGenerated,u);
        idUsuarioGenerated++;
    }

    //Borrar eetakemon por indice
    public void delEetakemon(int i) {
        hashtableEtakemon.remove(i);
    }


    //Borrar usuario por indice
    public void delUsuario(int i){
        hashtableUsuario.remove(i);
    }


    //Listar Eetakemons
    public Enumeration<Eetakemon> mostrarLista() {
        Enumeration<Eetakemon> en = hashtableEtakemon.elements();
        return en;
    }

    //Listar Usuarios
    public Enumeration<Usuario> mostrarListaUsuarios(){
        Enumeration<Usuario> enUs = hashtableUsuario.elements();
        return enUs;
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

    //Buscar Usuario por nombre
    public Usuario searchUserByName(String name){
        int idSearch = 0;
        List<Usuario> listu = Collections.list(mostrarListaUsuarios());
        for (int i=0; i<listu.size(); i++){
            if (listu.get(i).getName().equals(name)){
                idSearch = listu.get(i).getId();
            }
        }
        return hashtableUsuario.get(idSearch);
    }



    //BOLA EXTRA ---- buscar por nombre aproximacion
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

    //Buscar usuario por aproximación del nombre
    public List<Usuario> searchUserApproach(String aprox){
        List<Usuario> listu = Collections.list(mostrarListaUsuarios());
        List<Usuario> listUsersFinded = new ArrayList<Usuario>();
        for (int i=0; i<listu.size();i++){
            if (listu.get(i).getName().contains(aprox)){
                listUsersFinded.add(listu.get(i));
            }
        }
        return listUsersFinded;
    }





}

