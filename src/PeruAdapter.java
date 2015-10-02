/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre.chaves
 */
public class PeruAdapter implements Pato{
    
    private Peru peru;
    
    
    public PeruAdapter(Peru peru){
        this.peru = peru;
    }
    
    @Override
    public void grasnar(){
        peru.gorgolejar();
    }
    
    @Override
    public void voar(){
        for (int i = 0; i<5; i++){
            peru.voar();
        }
    }
    
}
