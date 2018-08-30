public class Alumno
{
   private String alumno;
   private int clave;
    
   public Alumno(String alumno,int clave)
   {
       this.alumno=alumno;
       this.clave=clave;
   }
    
   public int dimeClave()
   {
       return clave;
   }
   
   public String toString()
   {
       String aux="Nombre:"+alumno+" Clave:"+clave;
       return aux;
   }
}