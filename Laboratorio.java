import java.util.ArrayList;

public class Laboratorio
{
   private ArrayList<Alumno> alumnos;
   
   public Laboratorio()
   {
       alumnos=new ArrayList<Alumno>();
   }
   
   public void inscribir(String nombre,int clave)
   {
       Alumno nuevo=new Alumno(nombre,clave);
       alumnos.add(nuevo);
   }
   
   public void bajas(int claveBaja)
   {
       for(int i=0;i<alumnos.size();i++){
           Alumno aux=alumnos.get(i);
           if(aux.dimeClave()==claveBaja){
               alumnos.remove(i);
           }
       }
   }
   
   public void imprimir()
   {
        System.out.println("Lista de Alumnos");
        for(int i=0;i<alumnos.size();i++){
            Alumno lista=alumnos.get(i);
            System.out.println(lista);
        }
   }
}