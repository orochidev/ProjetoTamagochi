/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view

import controller.Controller

/**
 *
 * @author Orochi
 */
class View<T extends Controller>{
    private T controller;
    def refresh(){
        
    }
    
    def getController(){
        return controller;
    }
    
}

