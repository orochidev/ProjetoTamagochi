/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model

/**
 *
 * @author a1602632
 */
class Tamagochi {
    private static int MAX_FELICIDADE = 30
    private static int MAX_FOME = 30
    private static int MAX_SAUDE = 30
    
    private int felicidade
    private int fome
    private int saude
    private Estado estado
    private Date tempoExistencia
    
    public void alimentar(){
        if(fome + getRateFome() > MAX_FELICIDADE){
            estado = Estado.DOENTE
        }
        
    }
    
    public brincar(){
        
    }
    
    public curar(){
        
    }
    
    public dormir(){
        
    }
    
    public banhar(){
        if(estado == Estado.SUJO){
           this.estado = Estado.NORMAL;
        }
        
    }
    private getRateFome(){
        
    }
    
}

