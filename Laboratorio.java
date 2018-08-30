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
       Alumno nuevo=new Alumno();
       alumnos.add(nuevo);
   }
}