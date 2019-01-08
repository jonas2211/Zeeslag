/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zeeslag2;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle; 
import javafx.scene.text.Text;
 

/**
 *
 * @author jonas
 */
public class VakjeTegenstanderView extends Region {
    private Vakje model;
    private Rectangle rechthoek;
    
public VakjeTegenstanderView(Vakje model) {
    this.model = model;
    this.rechthoek = new Rectangle (300,300,Color.BLUE);
    Rectangle achtergrond = new Rectangle(30,30);
    if(model.isRaak()){
        achtergrond.setFill(Color.RED);
        Text raak = new Text(10,20,"X");
        getChildren().addAll(achtergrond);
    }
    else{
        achtergrond.setFill(Color.WHITE);
        getChildren().addAll(achtergrond);
    }
}

    /*public int getPositieMuis(double x, double y) {
        int kolom = (int) (x/30);
        int rij = (int) (y/30);
        return rij*10 + kolom;
    }*/
//getters
    public int getColumn(int x){
        return x/70;//70 veranderen door dikte vakje
    }

    public int getRow(int y){
        return y/70;//70 veranderen door dikte vakje
    
    }
    
    
    
}
