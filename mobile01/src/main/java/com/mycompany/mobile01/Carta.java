/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobile01;

import java.util.Random;



/**
 *
 * @author Lab06aluno
 * POO -->
 * abstração - enxergar o que é importante para a aplicação(identificar o que é importante ou não)
 * metodo - é a ação que a classe vai ter(comportamento)
 * construtor - tem o mesmo nome da classe. ele execulta sem precisar chamar ele... 
 */
public class Carta {
    int forca; // atributo ou 'propriedade'
    int inteligencia;
    int resistencia;
    int fadiga;
    
    Carta(){ // construtor
        Random gerador = new Random();
        forca = gerador.nextInt(100);
        inteligencia = gerador.nextInt(100);
        resistencia = gerador.nextInt(100);
        fadiga = gerador.nextInt(100);
    }
    
    void exibirCarta(){ //metodo 
        System.out.println("****CARTA****");
        System.out.println("1 - Força...........: " + forca);
        System.out.println("2 - Inteligência....: " + inteligencia);
        System.out.println("3 - Resistência.....: " + resistencia);
        System.out.println("4 - Fadiga..........: " + fadiga + "\n");
    }
    
    
}
