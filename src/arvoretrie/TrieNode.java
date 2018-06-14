/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoretrie;

import java.util.ArrayList;

/**
 *
 * @author viniciusrvk
 */
public class TrieNode {

    private String valor;
    private ArrayList<TrieNode> ponteiros;
    private boolean stop;
    
    /**
     *
     * @param valor
     */
    public TrieNode(String valor) {
        this.valor = valor;
        ponteiros = new ArrayList();
        stop = false;
    }

    /**
     *
     * @return
     */
    public String getValor() {
        return valor;
    }
    public void stopIt(){stop = true;}
    public boolean getStop(){return stop;}
    
    public ArrayList<TrieNode> getPonteiroNodes(){
        return ponteiros;
    }
    
    /**
     *
     * @param novo
     */
    public void addPonteiro(TrieNode novo){
        ponteiros.add(novo);
    }
    
    public boolean temProximoValor(String str){
        for (TrieNode ponteiro : ponteiros) {
            if(str.equals(ponteiro.getValor())){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param valor
     */
    public void setValor(String valor) {
        this.valor = valor;
    }    

    public TrieNode Proximo(String str) {
        for (TrieNode ponteiro : ponteiros) {
            if(str.equals(ponteiro.getValor())){
                return ponteiro;
            }
        }return null;
    }

    public int qtdPnteiro() {
        return ponteiros.size();
    }
    public void removePonteiro(TrieNode node){
        ponteiros.remove(node);
    }

    TrieNode primeiro() {
        return ponteiros.get(0);
    }
    
}
