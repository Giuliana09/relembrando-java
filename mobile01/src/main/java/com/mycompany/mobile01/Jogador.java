/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobile01;

/**
 *
 * @author Lab06aluno
 */
public class Jogador {
    String nome;
    int pontuacao;
    Carta monteCarta [] = new Carta[5];
    
    
    Jogador(){
        pontuacao = 0;
        for(int i = 0; i <=4; i++){
            Carta carta = new Carta();
            monteCarta[i] = carta;
        }
    }
    
    void exibirMonte(){
        for(int i = 0; i<=4;i++){
            monteCarta[i].exibirCarta();
        }
    }
}
