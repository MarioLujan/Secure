package models;

import javax.persistence.Entity;
import play.data.validation.Required;
import play.db.jpa.Model;

/**
 *
 * @author Mario
 */

@Entity
public class Productos extends Model {
    
    
    public String nombre;
    public String categoria;
    public float costo;
    
    @Override
    public String toString(){
        return String.format("%s %s", this.nombre, this.categoria);
    }
}