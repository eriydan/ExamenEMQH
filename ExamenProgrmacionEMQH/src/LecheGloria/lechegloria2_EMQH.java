package LecheGloria;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lechegloria2_EMQH{
    ArrayList <lechegloria1_EMQH> Listaproductos = new ArrayList<>();
    lechegloria1_EMQH producto = new lechegloria1_EMQH();
    
    public void agregarProducto (lechegloria1_EMQH p){
        Listaproductos.add(p);
    }
    public Date fecha(String f){
        Date fecha = null;
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            fecha=formato.parse(f);
        } catch (ParseException ex){
            Logger.getLogger(Produc.class.getName()).log(Level.SEVERE, null,ex);
        }
        return fecha;
    }
    public void Listaproductos(){
        for(lechegloria1_EMQH prod : Listaproductos){
            System.out.println("Nombre: "+prod.getNombreProducto());
            System.out.println("Precio: "+prod.getPrecio());
            System.out.println("Fecha de caducidad: "+prod.getFechaCaducidad());
        }
    }
}