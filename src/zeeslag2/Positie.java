/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zeeslag2;
import Zeeslag2.Variabelen;
import java.awt.Point;

public class Positie {
    private int x,y;


/**
 *
 * @author jonas
 */

    /*
public Positie(Point from, Point to) {
        if(from.getX() > Variabelen.spelbord || from.getX() < 0
                || from.getY() > Variabelen.spelbord || from.getY() < 0
                || to.getX() > Variabelen.spelbord || to.getX() < 0
                || to.getY() > Variabelen.spelbord || to.getY() < 0) {
            throw new ArrayIndexOutOfBoundsException();
public Positie(Point from, Point to) {
        if(from.getX() > Variabelen.spelbord || from.getX() < 0
                || from.getY() > Variabelen.spelbord || from.getY() < 0
                || to.getX() > Variabelen.spelbord || to.getX() < 0
                || to.getY() > Variabelen.spelbord || to.getY() < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        this.from = from;
        this.to = to;
    }

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }

    public static boolean ligtPuntTussen(Point point, Positie positie) {
        Point from = positie.getFrom();
        Point to = positie.getTo();
        if (from.getY() <= point.getY() && to.getY() >= point.getY()
            && from.getX() <= point.getX() && to.getX() >= point.getX()){
            return true;
                }
        else

            return false;
    }
    
     public static double AfstandTussenPunten(Point from, Point to) {
        double x1 = from.getX();
        double y1 = from.getY();
        double x2 = to.getX();
        double y2 = to.getY();

        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) + 1;
    }

        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) + 1;
    }*/

    //getters
    /*
    public int getColumn(int x){
        return x/70;//70 veranderen door dikte vakje
    }

    public int getRow(int y){
        return y/70;//70 veranderen door dikte vakje
    
    }
*/
}
