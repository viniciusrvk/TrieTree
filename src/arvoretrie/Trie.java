/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoretrie;

/**
 *
 * @author viniciusrvk
 */
public class Trie {
    private TrieNode raiz;

    public Trie() {
        raiz = new TrieNode("/");
    }
    public TrieNode getRaiz(){
        return raiz;
    }
    
    public void insertWord(String str){
        TrieNode corredor = raiz;
        for(int i=0; i<str.length(); i++){
            if(!corredor.temProximoValor(str.substring(i, i+1))){
                TrieNode novo = new TrieNode(str.substring(i, i+1));
                corredor.addPonteiro(novo);
                corredor = corredor.Proximo(str.substring(i, i+1));
            }else{
                corredor = corredor.Proximo(str.substring(i, i+1));
            }
        }corredor.stopIt();
    }

    public boolean search(String str) {
        
        TrieNode corredor = raiz;
        for(int i=0; i<str.length(); i++){
            if(corredor.temProximoValor(str.substring(i, i+1))){
                corredor = corredor.Proximo(str.substring(i, i+1));
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean remove(String str){
        TrieNode corredor = raiz;
        for(int i=0; i<str.length(); i++){
            if(corredor.temProximoValor(str.substring(i, i+1)) && corredor.Proximo(str.substring(i, i+1)).qtdPnteiro() < 2){
                corredor.removePonteiro(corredor.Proximo(str.substring(i, i+1)));
                return true;
            }
        }
        System.out.println("Já nao existia");
        return true;
    }
    
    public void show(){
        show(raiz, "");
    }
    public void show(TrieNode raiz, String str){
        if(raiz.getPonteiroNodes().isEmpty()){
            // retorna
        }else{
            for (TrieNode node : raiz.getPonteiroNodes()) {
                if(node.getStop()==true){
                    System.out.println(str+node.getValor());
                }
                show(node, str+node.getValor());
            }
        }
    }
}
