package models;

import java.util.Date;
import javax.persistence.Entity;
import play.data.validation.Email;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;

/**
 *
 * @author Mario
 */
@Entity
public class Usuario extends Model {
    
    @Required
    public String usuario;
    @Password
    public String password;
    public String primerApellido;
    public String segundoApellido;
    public String nombre;
    public Date fechaNacimiento;
    
    @Email
    public String email;
    public boolean administrador;
    
    
    @Override
    public String toString() {
        return String.format("%s %s", this.nombre, this.primerApellido);
}
    
}
