/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructural;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juane & CristianDevia
 */
public class Universidad
{
    private static ArrayList estudiantes;
    
    public Universidad()
    {
        estudiantes = new ArrayList();
     
    }  

    public ArrayList getEstudiantes()
    {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList estudiantes) {
        Universidad.estudiantes = estudiantes;
    }
          
  
    public void anadirEstudiante(String pNombre, int pCedula, String pCodigo, String pCorreo, int pCelular, Date pFecha )
    {
        
        Estudiante nuevo = new Estudiante(pNombre,pCedula,pCodigo,pCorreo,pCelular, pFecha);
        estudiantes.add(nuevo);
        
    }
    
    public void eliminarPorCodigo(String pCodigo)
    {
        for(int i=0; i< estudiantes.size();i++)
        {
            Estudiante actual = (Estudiante) estudiantes.get(i);
            if(actual.getCodigo().equals(pCodigo))
            {
                estudiantes.remove(actual);
            }
        }
    }
    
    public void actualizarPorCodigo(String pCodigo,String pNombre, int pCedula, String pCorreo, int pCelular, Date pFecha)
    {
        for(int i=0; i< estudiantes.size();i++)
        {
            Estudiante actual = (Estudiante) estudiantes.get(i);
            if(actual.getCodigo().equals(pCodigo))
            {
              actual.setCedula(pCedula);
              actual.setNombre(pNombre);
              actual.setCorreo(pCorreo);
              actual.setCelular(pCelular);
              actual.setFecha(pFecha);
            }
        }
    }
    
    public Estudiante buscarEstudiantePorCodigo(String codigo)
    {
        Estudiante buscado =null;
        
        for(int i =0; i<estudiantes.size();i++ )            
        {
            Estudiante actual = (Estudiante)estudiantes.get(i);
            if(actual.getCodigo().equals(codigo))
            {
                buscado = actual;
            }
        }
        return buscado;
    }
    
    public boolean existeCorreo(String pCorreo)
    {
        boolean centinela = false;
         for(int i =0; i<estudiantes.size() && centinela == false;i++ )            
        {
            Estudiante actual = (Estudiante)estudiantes.get(i);
            
            if(actual.getCorreo().equals(pCorreo))
            {
                centinela = true;
            }
        }
         
         return centinela;
    }
    
       public boolean existeCelular(int pCelular)
    {
        boolean centinela = false;
         for(int i =0; i<estudiantes.size() && centinela == false;i++ )            
        {
            Estudiante actual = (Estudiante)estudiantes.get(i);
            
            if(actual.getCelular() == pCelular)
            {
                centinela = true;
            }
        }
         
         return centinela;
    }
       
     public boolean usuarioExiste( String pCodigo )
    {
        boolean centinela = false;
        
        for(int i = 0; i < estudiantes.size() && !centinela; i++)
        {
            Estudiante estu = (Estudiante) estudiantes.get(i);
            String auxCod = estu.getCodigo();
            
            if(pCodigo.equalsIgnoreCase(auxCod))
            {
                centinela = true;
                
            }
        }
        
        return centinela;
    }
}
