/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alexandre.chaves
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ProcessadorPato processador;
        processador = new ProcessadorPato();
        
        //Pato pato = new PatoSelvagem();
        Peru peru = new PeruSelvagem();
        PeruAdapter adapter = new PeruAdapter(peru);
        
        //processador.processar(pato);
        processador.processar(adapter);
        
        
        
        
        
        
        
    }
    
}
