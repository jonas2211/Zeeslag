/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zeeslag2;

/**
 *
 * @author jonas
 */
public class Vakje {
    private int aantal;
    private boolean geraakt;
    private boolean gemist;
    private boolean raak;
    private boolean mis;
    
    
    public Vakje() {
        aantal = 100;
        geraakt = false;
        gemist = false;
        raak = false;
        mis = false;
    }

    public boolean isRaak() {
        return raak;
    }

    public boolean isMis() {
        return mis;
    }

    public boolean isGeraakt(){
        return geraakt;
    }

    public boolean isGemist(){
        return gemist;
    }
    
}
