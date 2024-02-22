/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobile01;

import java.util.Scanner;

/**
 *
 * @author Lab06aluno
 */
public class Batalha {
    void duelar(Jogador p1, Jogador p2){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        for(int i = 0; i <= 4; i++){
            
            p1.monteCarta[i].exibirCarta();
            System.out.println("Escolha um atributo: ");
            opcao = entrada.nextInt();
            
            switch(opcao){ // caso se
                
                case 1 :if(p1.monteCarta[i].forca > p2.monteCarta[i].forca){
                    p1.pontuacao++;
                    System.out.println("Voce ganhou!!");
                }
                else{
                    p2.pontuacao++;
                    System.out.println("Voce Perdeu!!");
                }
                break;
                
                case 2 :if(p1.monteCarta[i].inteligencia > p2.monteCarta[i].inteligencia){
                    p1.pontuacao++;
                    System.out.println("Voce ganhou!!");
                }
                else{
                    p2.pontuacao++;
                    System.out.println("Voce Perdeu!!");
                }
                break;
                
                case 3 :if(p1.monteCarta[i].resistencia > p2.monteCarta[i].resistencia){
                    p1.pontuacao++;
                    System.out.println("Voce ganhou!!");
                }
                else{
                    p2.pontuacao++;
                    System.out.println("Voce Perdeu!!");
                }
                break;
                
                case 4 :if(p1.monteCarta[i].fadiga < p2.monteCarta[i].fadiga){
                    p1.pontuacao++;
                    System.out.println("Voce ganhou!!");
                }
                else{
                    p2.pontuacao++;
                    System.out.println("Voce Perdeu!!");
                }
                break;
            }
            exibirPlacar(p1,p2);
        }              
    }
    
    void exibirPlacar(Jogador p1, Jogador p2){
        System.out.println("------PLACAR------");
        System.out.println("Play1   VS   Play2");
        System.out.println(p1.pontuacao + "                  " + p2.pontuacao);
    }
}
