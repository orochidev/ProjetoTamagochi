/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view
	

import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import model.*
/**
 *
 * @author a1602632
 */

count = 0
l = Estado.DOENTE
new SwingBuilder().edt {
  frame(title: 'Frame', size: [300, 300], show: true) {
    borderLayout()
    textlabel = label(text: 'Click the button!', constraints: BL.NORTH)
    button(text:'Click Me',
         actionPerformed: {count++; textlabel.text = "Clicked ${count} time(s)."; println "clicked"}, constraints:BL.SOUTH)
  }
}




