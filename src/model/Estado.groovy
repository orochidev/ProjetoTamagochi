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
enum Estado {
    NORMAL, DOENTE, CANSADO, SUJO, TRISTE, MORTO;
    private String motivo;
    public Estado(motivo){
        this.motivo = motivo
    }
    public Estado(){}
    
    public getMotivo(){
        this.motivo
    }
}

