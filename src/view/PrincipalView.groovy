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

count = 0
l = Estado.DOENTE
new SwingBuilder().edt {
  frame(title: 'Frame', size: [550, 500], show: true) {
    borderLayout()
  
    panel(constraints: BorderLayout.NORTH) {
        label(text: 'Saude')
        saude = textField(id: 'textSaude', text: '0', editable: false)
        label(text: 'Fome')
        fome = textField(id: 'textFome', text: '0', editable: false)
        label(text: 'Feicidade')
        felicidade = textField(id: 'textFeicidade', text: '0', editable: false)
       
    }
    panel(constraints: BorderLayout.CENTER) {
              
       
    }   
        
    panel(constraints: BorderLayout.SOUTH) {
        button text: 'Brincar', actionPerformed: {
            println address
        }
        button text: 'Banhar', actionPerformed: {
            println address
        }
        button text: 'Alimentar', actionPerformed: {
            println address
        }
        button text: 'Levar ao Médico', actionPerformed: {
            println address
        }
        button text: 'Botar Para Dormir', actionPerformed: {
            println address
        }
    }
  }
}




