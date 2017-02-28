package eetac.upc.edu.dsa;

/**
 * Created by ivanm on 28/02/2017.
 */
public class Usuario {
    //usuario, correo , contraseña
    public String user, password, mail, id;

    public Usuario(){}

    public Usuario(String user, String password, String mail, String id) {
        this.user = user;
        this.password = password;
        this.mail = mail;
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

