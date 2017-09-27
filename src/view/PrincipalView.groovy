/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view
	

import groovy.swing.SwingBuilder
import java.awt.BorderLayout
import model.*
/**
 *
 * @author a1602632
 */
def teste = {
    saude.setText("teste")
}

count = 0
l = Estado.DOENTE
new SwingBuilder().edt {
    frame(title: 'Frame', size: [550, 500], show: true) {
    borderLayout()
  
    panel(constraints: BorderLayout.NORTH) {
        label(text: 'Saude')
        saude = textField(id: 'textSaude', text: '0', editable: false, columns:10)
        label(text: 'Fome')
        fome = textField(id: 'textFome', text: '0', editable: false, columns:10)
        label(text: 'Feicidade')
        felicidade = textField(id: 'textFeicidade', text: '0', editable: false, columns:10)
       
    }
    panel(constraints: BorderLayout.CENTER) {
              
       
    }   
        
    panel(constraints: BorderLayout.SOUTH) {
        button text: 'Brincar', actionPerformed: {
            teste()
        }
        button text: 'Banhar', actionPerformed: {
            teste()
        }
        button text: 'Alimentar', actionPerformed: {
            teste()
        }
        button text: 'Levar ao Médico', actionPerformed: {
            teste()
        }
        button text: 'Botar Para Dormir', actionPerformed: {
            teste()
        }
    }
  }
}




