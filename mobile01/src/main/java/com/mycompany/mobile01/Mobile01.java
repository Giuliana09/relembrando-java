  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mobile01;

/**
 *
 * @author Lab06aluno
 */
public class Mobile01 {

    public static void main(String[] args) {
        
       //Carta c1 = new Carta(); 
       //c1.exibirCarta();
       Jogador play1 = new Jogador();
       Jogador play2 = new Jogador();
       
       //play1.exibirMonte();
       //play2.exibirMonte();
       
       Batalha rodada1 = new Batalha();
       rodada1.duelar(play1, play2);
        
    }
}
