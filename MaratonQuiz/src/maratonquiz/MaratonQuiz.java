/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maratonquiz;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Aulas Heredia
 */
public class MaratonQuiz {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instancias
        Random randomNum = new Random(); //Usado para dar valores aleatorios
        controladorCorredores controlador = new controladorCorredores();
        String listaCorredores = "";
        int guardarNumCorredor = 0;
        int randomCantidadCorredores = randomNum.nextInt(1, 4); //da valor aleatorio de corredores
        for(int i = 0; i < randomCantidadCorredores; i++)
        {
            //Atributos aleatorios para corredor
            int randomNumCorredor = randomNum.nextInt(1, 999);
            System.out.println("Numero corredor " + randomNumCorredor);
            if(guardarNumCorredor != randomNumCorredor) //Verifica que no se repitan numeros de corredor
            {
                //Atributos aleatorios para corredor
                int randomEdad = randomNum.nextInt(12, 80);
                guardarNumCorredor = randomNumCorredor;
                double randomTiempoEsperado = randomNum.nextDouble(150.00, 1000.00);
                double randomTiempoReal = randomNum.nextDouble(150.00, 1000.00);
                //Instanciamientos con parametros necesarios
                Corredor corredor = new Corredor(JOptionPane.showInputDialog("Introducir nombre de participante:"), randomEdad, randomNumCorredor, randomTiempoEsperado, randomTiempoReal);        
                controlador.setLista(corredor.getListaAtributos());
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Numero de corredor ya utilizado.");
            }
            
        }
        controlador.Interfaz();
    }
    
}
