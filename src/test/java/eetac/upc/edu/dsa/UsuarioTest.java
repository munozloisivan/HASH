package eetac.upc.edu.dsa;

import org.junit.Test;

import java.util.ArrayList;
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
        List<Eetakemon> listEt = new ArrayList<Eetakemon>();
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1,listEt);
        testControl.añadirUsuario(us);
        assertTrue(testControl.mostrarListaUsuarios().hasMoreElements());
    }

    @Test
    public void testDelUsuario(){
        List<Eetakemon> listEt = new ArrayList<Eetakemon>();
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1,listEt);
        testControl.añadirUsuario(us);
        testControl.delUsuario(us.getId());
        assertFalse(testControl.mostrarListaUsuarios().hasMoreElements());
    }

    @Test
    public void testSearchUserByName(){
        List<Eetakemon> listEt = new ArrayList<Eetakemon>();
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1,listEt);
        testControl.añadirUsuario(us);
        assertEquals(Usuario.class, testControl.searchUserByName("ivan").getClass());
    }

    @Test
    public void testSearchUserApproach(){
        List<Eetakemon> listEt = new ArrayList<Eetakemon>();
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1,listEt);
        testControl.añadirUsuario(us);
        List<Eetakemon> listEt2 = new ArrayList<Eetakemon>();
        Usuario us2 = new Usuario("ivana","passa","ivana@mail.com",1,listEt2);
        testControl.añadirUsuario(us2);
        assertEquals(2,testControl.searchUserApproach("an").size());
    }

    @Test
    public void testMostrarListaUsuarios(){
        List<Eetakemon> listEt = new ArrayList<Eetakemon>();
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1,listEt);
        testControl.añadirUsuario(us);
        List<Eetakemon> listEt2 = new ArrayList<Eetakemon>();
        Usuario us2 = new Usuario("ivana","passa","ivana@mail.com",1,listEt2);
        testControl.añadirUsuario(us2);
        List<Usuario> list = Collections.list(testControl.mostrarListaUsuarios());
        assertTrue(list.size() == 2);
    }

    @Test
    public void testAñadirEetakemonUsuario(){
        List<Eetakemon> listEt = new ArrayList<Eetakemon>(); {}
        Usuario us = new Usuario("ivan","pass","ivan@mail.com",1, listEt);
        testControl.añadirUsuario(us);
        us.etList.add(new Eetakemon("pikachu",1,2));
        us.etList.add(new Eetakemon("raichu",2,3));
    }

    @Test
    public void testMostrarListaEetakemonsUsuario(){
        List<Eetakemon> listEt = new ArrayList<Eetakemon>(); {}
        Usuario us = new Usuario("ivansiko","passika","ivansiko@mail.com",1, listEt);
        testControl.añadirUsuario(us);
        us.etList.add(new Eetakemon("pikachusiko",1,2));
        us.etList.add(new Eetakemon("raichusiko",2,3));
        assertTrue(testControl.mostrarEetakemonsUsuario(us.getName()).size() == 2);
    }

}
