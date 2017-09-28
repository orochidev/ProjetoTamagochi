/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller

/**
 *
 * @author Orochi
 */
import model.Callback
import model.Tamagochi
class TamagochiController extends Controller{
	private Tamagochi tamagochi
        
        def alimentar(Callback r = null){
            r?.onResult()
        }
        
        def dormir(Callback r = null){
            r?.onResult()

        }
        def brincar(Callback r = null){
            r?.onResult()
        }
        def curar(Callback r = null){
             r?.onResult()           
        }
        
        def banho(Callback r){
            
        }
}

