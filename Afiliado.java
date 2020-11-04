
package examenbimestral;
public class Afiliado {
    private String Nombre;
    private int anio_afiliacion;
    private String membresia;
    public int identificador;
              
   
     public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
     private String getNombre(){
         return this.Nombre;
     }
     private void setanio_afiliacion(int anio_afiliacion){
         this.anio_afiliacion = anio_afiliacion;
     }
     public int getanio_afiliacion(){
         return this.anio_afiliacion;
     }
     private void setmembresia(String membresia){
         this.membresia = membresia;
     }
     public String getmembresia(){
         return this.membresia;
        
     }
     public void setidentificador(int identificador){
        this.identificador = identificador;
    }
     public int getidentificador(){
         return this.identificador;
     }
     
    protected String menorAfiliación( int anio,String nombre, String membresia, int identificador){
         if (anio < getanio_afiliacion() )
             setNombre(nombre);
             setanio_afiliacion(anio);
             setmembresia(membresia);
            return  "El afiliado:" +getNombre()+"\tiene su tarjeta vencida con el sig año de afiliacion:"+getanio_afiliacion();
 
     }
}