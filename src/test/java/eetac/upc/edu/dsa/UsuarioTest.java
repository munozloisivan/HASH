package eetac.upc.edu.dsa;

import org.junit.Test;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by ivanm on 06/03/2017.
 */
public class UsuarioTest {

    Controlador testControl = new Controlador();

    @Test
    public void testAddUserOK(){
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1);
        testControl.añadirUsuario(us);
        assertTrue(testControl.mostrarListaUsuarios().hasMoreElements());
    }

    @Test
    public void testDelUsuario(){
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1);
        testControl.añadirUsuario(us);
        testControl.delUsuario(us.getId());
        assertFalse(testControl.mostrarListaUsuarios().hasMoreElements());
    }

    @Test
    public void testSearchUserByName(){
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1);
        testControl.añadirUsuario(us);
        assertEquals(Usuario.class, testControl.searchUserByName("ivan").getClass());
    }

    @Test
    public void testSearchUserApproach(){
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1);
        testControl.añadirUsuario(us);
        Usuario us2 = new Usuario("ivana","passa","ivana@mail.com",1);
        testControl.añadirUsuario(us2);
        assertEquals(2,testControl.searchUserApproach("an").size());
    }

    @Test
    public void testMostrarListaUsuarios(){
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1);
        testControl.añadirUsuario(us);
        Usuario us2 = new Usuario("ivana","passa","ivana@mail.com",1);
        testControl.añadirUsuario(us2);
        List<Usuario> list = Collections.list(testControl.mostrarListaUsuarios());
        assertTrue(list.size() == 2);
    }
}
