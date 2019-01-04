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
public class VakjeSpelerView extends Region {
    private Vakje model;
    private Rectangle rechthoek;
    
public VakjeSpelerView(Vakje model) {
    this.model = model;
    this.rechthoek = new Rectangle (300,300,Color.BLUE);
    Rectangle achtergrond = new Rectangle(30,30);
    if(model.isGeraakt()){
        achtergrond.setFill(Color.RED);
        Text geraakt = new Text(10,20,"X");
        getChildren().addAll(achtergrond);
    }
    else{
        achtergrond.setFill(Color.WHITE);
        getChildren().addAll(achtergrond);
    }
}
    
//apparte view speler en tegenstander mss handiger om boten appart en alleen bij speler toe te voegen
    
    
}
