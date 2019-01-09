/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag2;

import javafx.scene.layout.Region;
import javafx.scene.image.ImageView;

/**
 *
 * @author jonas
 */
public class BordView extends Region {
    private Bord bordModel;
    private ImageView bordImageView;
    
    public BordView (Bord bord){
        this.bordModel = bord;
        this.update();
    }
    
    public void update(){
        bordImageView = new ImageView("pictures/spelbordCoo.png");
        this.getChildren().add(bordImageView);
    }
    
}
