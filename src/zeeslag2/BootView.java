/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Zeeslag2;

//import zeeslag.Boot;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle; 
import javafx.scene.text.Text;
 

/**
 *
 * @author jonas
 */
public class BootView extends Region {
    
    private Vakje model;
    private Boot model1;
   // private Boot model1;
    private Rectangle rechthoek;
    
    public BootView(Vakje model) {
        this.model = model;
        //this.model1 = model1;
        Rectangle boot = new Rectangle(30,(30 * model1.getSize()),Color.GRAY);
        //1 vakje x aantal vakjes lengte(30 vervangen)
        if(model.isGeraakt()){
        Rectangle hit = new Rectangle(e.getColumn, e.getRow, 30, 30);
        //e is mouse-event en 30 moet vervangen door dikte vakje
        hit.setFill(Color.RED);
        //geraakte vakje wordt rood
        Text raak = new Text(10,20,"X");
        getChildren().addAll(boot);
        }
    }   
}
