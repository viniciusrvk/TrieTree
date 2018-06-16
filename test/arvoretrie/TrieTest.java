/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoretrie;

//import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author viniciusrvk
 */
public class TrieTest {

    /**
     * Test of insertWord method, of class Trie.
     */
    @Test
    public void testInsertWord() {
        System.out.println("insertWord");
        String s = "teste";
        Trie instance = new Trie();
        instance.insertWord(s);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.search("teste"));
        
    }
    @Test
    public void testeSearch(){
        System.out.println("arvoretrie.TrieTest.testeSearch()");
        String str = "teste";
        Trie instance = new Trie();
        instance.insertWord(str);
        instance.insertWord("teste2");
        
        assertTrue(instance.search("teste2"));
    }
    
    @Test
    public void testRemove() {
        System.out.println("remove");
        
        Trie instance = new Trie();
        instance.insertWord("teste1");
        instance.insertWord("teste");
        boolean result = instance.remove("aaaa");
        assertTrue(result);
    }
    
    @Test
    public void testePrimeiro(){
        Trie instance = new Trie();
        instance.insertWord("kkk");
        instance.insertWord("hahaha");
        assertTrue("k".equals(instance.getRaiz().primeiro().getValor()));
    }
    
    @Test
    public void testeShow(){
        Trie instance = new Trie();
        instance.insertWord("teste1");
        instance.insertWord("teste2");
        instance.insertWord("aaaa");
        instance.show();
        assertTrue(true);
    }
    
}
