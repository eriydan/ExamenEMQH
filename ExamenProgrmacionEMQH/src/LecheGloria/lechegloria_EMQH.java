package LecheGloria;

public class lechegloria_EMQH {
    
    public static void main(String[] args) {
        lechegloria2_EMQH pa = new lechegloria2_EMQH();
        lechegloria1_EMQH pe = new lechegloria1_EMQH();
        pe.setNombreProducto("LECHE GLORIA");
        pe.setPrecio(3.5);
        pe.setFechaCaducidad(pa.fecha("07-12-2019"));
        
        
        pa.agregarProducto(pe);
        pa.Listaproductos();
        
        System.out.println("");
        System.out.println("El producto no esta vencido ");
    }
}
