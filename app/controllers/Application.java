package controllers;
//import play.*;
//import controllers.secure.Security;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import play.data.validation.Check;

@With(SecurityManager.class)
public class Application extends Controller {

    public static void index() {
        //String usuario = Security.connected();
        render();
    }
    
//    @Check("administrator")
   public static void delete(Long id) {
      
   }

    public static void login() {
        System.out.println(" ==Todos los usuarios == ");
        List<Usuario> usuarios = Usuario.findAll();
        for (Usuario usuario : usuarios) {
            System.out.println("usuario = " + usuario);
        }

        System.out.println(" ==Todos los usuarios con apellido Corona== ");
        List<Usuario> usuariosCorona = Usuario.find("primerApellido", "Corona").fetch();
        for (Usuario usuarioCorona : usuarios) {
            System.out.println("usuarioCorona = " + usuarioCorona);
        }

        System.out.println(" ==Todos los usuarios con apellido Corona y se llamen Oscar Arturo== ");
        usuariosCorona = Usuario.find("primerApellido =? AND nombre LIKE ?", "Corona", "Oscar Arturo").fetch();
        for (Usuario usuarioCorona : usuarios) {
            System.out.println("usuarioCorona = " + usuarioCorona);
        }
                
        render();
    }

    public static void autenticar(String usuario, String password) {
        session.put("usuario", usuario);
        index();
    }
    
    public static void borrar(Long id) {
       
   }
   
    public static void editar(Long id) {
       
   }
}
