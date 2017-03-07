package eetac.upc.edu.dsa;

import java.util.List;

/**
 * Created by ivanm on 28/02/2017.
 */
public class Usuario {
    //usuario, correo , contraseña
    public String name, password, mail;
    private int id;
    public List<Eetakemon> etList;

    public Usuario(String name, String password, String mail, int id, List<Eetakemon> etList) {
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.id = id;
        this.etList = etList;
    }

    public Usuario() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Eetakemon> getEtList() {
        return etList;
    }

    public void setEtList(List<Eetakemon> etList) {
        this.etList = etList;
    }
}

