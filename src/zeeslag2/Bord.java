/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zeeslag2;

import Zeeslag2.Variabelen;
import Zeeslag2.Boot;
import Zeeslag2.Positie;

import java.awt.Point;
import java.util.Scanner;
/**
 *
 * @author jonas
 */
public class Bord {
    private static Boot[] boten;
    private char[][] bord;
            
    static {
        boten = new Boot[]{
                new Boot("boot5", Variabelen.Boot5),
                new Boot("boot4", Variabelen.Boot4),
                new Boot("boot3", Variabelen.Boot3),
                new Boot("boot32", Variabelen.Boot32),
                new Boot("boot2", Variabelen.Boot2)
        };
    }
    
    public Bord (){
        bord = new char[Variabelen.spelbord][Variabelen.spelbord];
      //  zetBotenOpBord();
    }
}