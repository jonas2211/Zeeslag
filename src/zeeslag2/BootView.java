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
    
    public BootView(Vakje model, Boot model1) {
        this.model = model;
        //this.model1 = model1;
        Rectangle boot = new Rectangle(30,(30 * model1.getSize()),Color.GRAY);
        if(model.isGeraakt()){
        boot.setFill(Color.RED);
        Text raak = new Text(10,20,"X");
        getChildren().addAll(boot);
        }
    }   
}
