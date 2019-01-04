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
public class Boot {
    private String naam;
    private int size;
    private int levens;
    private boolean gezonken;
    private Positie positie;

   
    public Boot(String naam, int size) {
        this.naam = naam;
        this.size = size;
        this.gezonken = false;
        this.levens = size;
    }

    public String getNaam() {
        return naam;
    }

    public int getSize() {
        return size;
    }
    

    public int getLevens() {
        return levens;
    }

    public boolean isGezonken() {
        return gezonken;
    }

    public Positie getPositie() {
        return positie;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setGezonken(boolean gezonken) {
        this.gezonken = gezonken;
    }
    public void Geraakt(){
        if (levens == 0){
            gezonken = true;
            System.out.println(naam + "is gezonken");
        }
        else 
            levens --;
    }
    
    public void test(){
        return test;
    }
    
    
}
