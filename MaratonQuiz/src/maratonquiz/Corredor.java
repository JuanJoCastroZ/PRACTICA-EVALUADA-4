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
public class Corredor {
    //Atributos
    private String Nombre = "";
    private int Edad = 0;
    private int numeroCorredor = 0;
    private double minutosEspeculados = 0;
    private double minutos = 0;
    private String Categoria = "";
    private String atributosConcatenados = "";
    //Constructor
    public Corredor(String Nombre, int Edad, int numeroCorredor, double minutosEspeculados, double minutos) {      
        this.numeroCorredor = numeroCorredor;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.minutosEspeculados = minutosEspeculados;
        this.minutos = minutos;
    }
    //Metodos
    public String getCategoria() { //Metodo para conseguir categoria del corredor
        if (Edad < 18) {
            return Categoria = "Juvenil";
        } else if (Edad > 18 && Edad < 41) {
            return Categoria = "Adulto";
        } else {
            return Categoria = "Master";
        }
    }
    public String getListaAtributos()
    {
        String stringEdad = "" + Edad;
        String stringnumeroCorredor = "" + numeroCorredor;
        String minutosE = "" + minutosEspeculados;
        String minutosR = "" + minutos;
        atributosConcatenados = Nombre + "," + stringEdad + "," + stringnumeroCorredor + "," + minutosE + "," + minutosR + "$";
        return atributosConcatenados;
    }
    //Metodos Getters

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getNumeroCorredor() {
        return numeroCorredor;
    }

    public double getMinutosEspeculados() {
        return minutosEspeculados;
    }

    public double getMinutos() {
        return minutos;
    }
    
}
