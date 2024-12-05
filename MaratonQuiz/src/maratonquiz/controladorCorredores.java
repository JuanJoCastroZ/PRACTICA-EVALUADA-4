/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maratonquiz;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class controladorCorredores {
    //Atributos
    private String[] listaCorredores;
    private String listaAtributos = "";
    private String[] listaAtributosDivididos;
    private int Seleccion = 0; //Guarda la seleccion del menu
    //Constructor
    public controladorCorredores() {
        
    }
    //Metodos
    public void Interfaz() //Muestra las opciones disponibles
    {
        Object[] opciones = new Object[]{"Buscar", "Eliminar", "Listar por categoria"};
        Seleccion = JOptionPane.showOptionDialog(null,"Elige una opcion:","Menu gestion",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, opciones, opciones[0]);
        switch(Seleccion)
        {
            case 0:
                Buscar();
                break;
            case 1:
                break;
            case 2:
                break;
            
        }
    }
    //Metodos que tratan los datos
    public void setLista(String atributosConcatenados)
    {
        listaAtributos = listaAtributos + atributosConcatenados;
        System.out.println(listaAtributos);
        setListaCorredores(listaAtributos);
    }
    public void setListaCorredores(String listaAtributos)
    {
        listaCorredores = listaAtributos.split("$");
    }
    
    //Metodos que accionaran lo elegido en el menu
    public void Buscar()
    {
        System.out.println(listaCorredores.length);
       int numeroCorredorBusqueda = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero de corredor deseas buscar?"));
       
       String textoAMostrar = "";
       for(int i = 0; i < listaCorredores.length; i++)
       {
           String[] criteria = listaCorredores[i].split(",");
           
           if(Integer.parseInt(criteria[2]) == numeroCorredorBusqueda)
           {
               for(int j = 0; j < criteria.length; j++)
               {
                   textoAMostrar = textoAMostrar + criteria[j] + "\n";
               }
           }
       }
       JOptionPane.showMessageDialog(null, "Informacion de corredor: \n" + textoAMostrar); //No esta mostrando bien a como lo queria hacer :(
    }
    //No pude completar las otras funcionalidades :(
    public void Eliminar()
    {
        
    }
    public void Listar()
    {
    }
    
}
