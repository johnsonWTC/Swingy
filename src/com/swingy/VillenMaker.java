/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingy;




/**
 *
 * @author pi
 */
public class VillenMaker {
    
    public static IVillen VillenMaker(int b){
        
        Integer a = new Integer(b);
        if(a.equals(1)){
        LargeRoboot largeRoboot = new LargeRoboot();
        return largeRoboot;
        }
        else if (a.equals(2)){
            SmallRoboot smallRoboot = new SmallRoboot();
            return smallRoboot;
        }
        else if (a.equals(3)){
            BigRoobot bigRoobot = new BigRoobot();
            return bigRoobot;
        }
        else return null;
    }
}
