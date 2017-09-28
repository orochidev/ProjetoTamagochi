/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller

import view.View

/**
 *
 * @author Orochi
 */
abstract class Controller<T extends View> {
    private T view;
    public Controller(T view){
        this.view = view
    }
    
}

