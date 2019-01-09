package Zeeslag2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.MouseEvent;

public class FXMLZeeslag2ViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneBoven;

    @FXML
    private AnchorPane paneOnder;

    @FXML
    private Button HandelButtonAction;

    @FXML
    private TextField lbl1;
    
  //123
    

    @FXML
    void initialize() {
        assert paneBoven != null : "fx:id=\"paneBoven\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert paneOnder != null : "fx:id=\"paneOnder\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert HandelButtonAction != null : "fx:id=\"HandelButtonAction\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        
    }
    
    private Vakje model;
    private VakjeSpelerView view;
    private VakjeTegenstanderView model2;
    
    /*
    om figuur op te roepen
        public void setModel(Hnefatafl hnefataflModel) {
        this.hnefataflModel = hnefataflModel;
        hnefataflView = new HnefataflView(hnefataflModel);
        gamePane.getChildren().add(hnefataflView);
        gamePane.setFocusTraversable(true);
    */ 
    
    /*
    public void update(){
        view.update();
        view2.update();
    }
    */
    /*
    public void selecteerVakje(MouseEvent e){
        System.out.println(e.getX() + "-" + e.getY());
        int pos = view2.getPositieMuis(e.getX(), e.getY());
        double X = e.getX();
        double Y = e.getY();
        System.out.println(pos);
        model.schieten(pos);
        
        update();
    }
*/
   
    
    
    //mogelijk begin controller
    
    public void setModel(VakjeTegenstanderView model2) {
    this.model2 = model2;
    model2 = new VakjeTegenstanderView(model);
    }
   
    public void selecteerVakje(MouseEvent e){
        int x = (int) e.getX();
        int y = (int) e.getY();
        System.out.println(model2.getColumn(x) + "-" + model2.getRow(y));
    }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
