/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoretrie;

import java.util.Scanner;

/**
 *
 * @author viniciusrvk
 */
public class Main {
    
    public static void main(String[] args) {
        Trie trie = new Trie();
        System.out.println("Ola!\ndigite a palavra que deseja inserir.(Para terminar digite 'sair')");
        Scanner in = new Scanner(System.in);
        String entrada = "";
        while(!"sair".equals(entrada)){
            //System.out.print(">> ");
            entrada = in.next();
            if("sair".equals(entrada)){
                continue;
            }
            trie.insertWord(entrada);            
        }
        trie.show();
    }
    
}
