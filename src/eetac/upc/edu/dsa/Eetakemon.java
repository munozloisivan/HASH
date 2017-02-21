package eetac.upc.edu.dsa;

/**
 * Created by ivanm on 21/02/2017.
 */
public class Eetakemon {
    public String nombre;
    public int id;
    public int nivel;

    public Eetakemon(String nombre, int id, int nivel) {
        this.nombre = nombre;
        this.id = id;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

