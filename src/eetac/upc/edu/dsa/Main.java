package eetac.upc.edu.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Controlador milista = new Controlador();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 88;
        while (i != 0) {

            System.out.println("\n ** MENU EETAKEDEX ** \n");
            System.out.println("Seleccione una opcion:");
            System.out.println("    1: añadir eetakemon");
            System.out.println("    2: borrar eetakemon por id");
            System.out.println("    3: Listar todos los eetakemons");
            System.out.println("    4: Buscar eetakemon por nombre");
            System.out.println("    5: Busqueda por aproximacion");
            System.out.println("    0: Salir");

            try {
                i = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.getMessage();
            }

            switch (i) {
                case 1: //añadir eetakemon
                    try {
                    Eetakemon nuevoEetakemon = new Eetakemon();
                        System.out.println("Introduce Nombre:");
                        nuevoEetakemon.setNombre(br.readLine());
                        System.out.println("Introduce nivel:");
                        nuevoEetakemon.setNivel(Integer.parseInt(br.readLine()));
                        milista.añadirEetakemon(nuevoEetakemon);
                    } catch (IOException e) {
                        e.getMessage();
                    }
                    break;
                case 2: //borrar eetakemon por id
                    try {
                        System.out.println("Introduce id a borrar");
                        int idDel = Integer.parseInt(br.readLine());
                        milista.delEetakemon(idDel);
                    }
                    catch (IOException e){
                        e.getMessage();
                    }
                    break;
                case 3: //listar todos los eetakemons
                        List<Eetakemon> mostrar = milista.mostrarLista();
                        if (mostrar.size() == 0) {
                            System.out.println("La lista esta vacia");
                        } else {
                            for (int x = 0; x < mostrar.size(); x++) {
                                System.out.println("Nombre: " + mostrar.get(x).getNombre() + " || ID: " + mostrar.get(x).getId() + " || Nivel: " + mostrar.get(x).getNivel());
                            }
                        }
                    break;
                case 4: //buscar por nombre
                    System.out.println("¿Cual quieres buscar?");
                    String nombreSearch = br.readLine();
                    System.out.println("Nombre: " + milista.searchByName(nombreSearch).getNombre()  + " || ID: " + milista.searchByName(nombreSearch).getId() + " || Nivel: " +milista.searchByName(nombreSearch).getNivel()+"\n");
                    break;
                case 5: //busqueda por aproximado
                    System.out.println("Introduce caracteres para la busqueda:");
                    String caracteres = br.readLine();
                    List<Eetakemon> mostrar2 = milista.searchApproach(caracteres);
                     if (mostrar2.size() == 0){
                       System.out.println("Lista vacia");
                    }
                    else{
                         System.out.println("Eetakemons que contienen *"+caracteres+"* :");
                        for (int z=0; z < mostrar2.size(); z++){
                            if (mostrar2.get(z).getNombre().contains(caracteres)){
                                System.out.println("Nombre: " + mostrar2.get(z).getNombre() + " || ID: " + mostrar2.get(z).getId() + " ||  Nivel: " + mostrar2.get(z).getNivel());
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
            }
        }
    }
}
