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

    @FXML
    void initialize() {
        assert paneBoven != null : "fx:id=\"paneBoven\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert paneOnder != null : "fx:id=\"paneOnder\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert HandelButtonAction != null : "fx:id=\"HandelButtonAction\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        
    }
    private Vakje model;
    private VakjeSpelerView view;
    private VakjeTegenstanderView view2;
    
    public void update(){
        view.update();
        view2.update();
    }
    
    public void selecteerVakje(MouseEvent e){
        System.out.println(e.getX() + "-" + e.getY());
        int pos = view2.getPositieMuis(e.getX(), e.getY());
        double X = e.getX();
        double Y = e.getY();
        System.out.println(pos);
        model.schieten(pos);
        
        update();
    }
}
