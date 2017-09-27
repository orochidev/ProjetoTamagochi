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
    private static int MAX_FELICIDADE = 100
    private static int MAX_FOME = 100
    private static int MAX_SAUDE = 100
    
    private int felicidade
    private int fome
    private int saude
    
    private Estado estado
    private Date tempoExistencia
    

    def alimentar(){
        if(fome + getRateFome() > MAX_FOME){
            estado = Estado.DOENTE
            fome = MAX_FOME
        }else{
            fome += getRateFome()
        }
    }
    
    def brincar(){
        if(felicidade + getRateFelicidade() > MAX_FELICIDADE){
            felicidade = MAX_FELICIDADE
        }else{
            felicidade += getRateFelicidade()
        }
    }
    
    def curar(){
        if(estado == Estado.CANSADO){
            estado = Estado.NORMAL
        }
    }
    
    def dormir(){
        if(estado == Estado.CANSADO){
            estado = Estado.NORMAL
        }
    }
    
    def banhar(){
        banhoSeguidoAdd()
        if(estado == Estado.SUJO){
           this.estado = Estado.NORMAL
        }
    }
    def isVivo(){
        return estado == Estado.MORTO
    }
    
    def respirar(){
        if(saude < 20){
            estado == Estado.DOENTE
        }
        if(saude <= 0){
            estado == Estado.MORTO
        }
    }
    // DAQUI PRA BAIXO É TUDO PRIVATE
    // LINGUAGEM BUGADA DÁ PRA ACESSAR MÉTODOS PRIVADOS COMOS SE FOSSEM PÚBLICOS NUMA BOA
    private def getRateFome(){
        
    }   
    private def getRateFelicidade(){
        
    }
        private seguidos = [:]
    
    private def banhoSeguidoAdd(){
        for ( e in seguidos ){
           if(e.key != "banhos") e.value = 0
        }
        seguidos.banhos += 1
    }
    
    private def countBanhosSeguidos(){
        return seguidos.banhos
    }
    
}

