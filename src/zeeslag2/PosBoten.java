/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag2;


/**
 *
 * @author jonas
 */

public class PosBoten{
    Boot  boot2;
    Boot  boot3;
    Boot  boot4;
    Boot  boot5;
    
    public PosBoten(){
        //x en y waarden kiezen we voorlopig nog zelf, de bedoeling is
        //om 
        boot2 = new Boot("boot2",2,2,6,true);
        boot3 = new Boot("boot3",3,5,3,false);
        boot4 = new Boot("boot4",4,1,8,true);
        boot5 = new Boot("boot5",5,8,1,false);
                
    }
    
    //for loop maken om door lijst met boten te lopen en te
    //checken of er op een bepaalde coordinaat een boot staat.
    //als de boot horizontaal staat moet de x coordinaat +size-1 gedaan worden
    //staat de boot verticaal moet de y coordinaat +size-1 gedaan worden
}   







