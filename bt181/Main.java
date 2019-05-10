/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt181;

/**
 *
 * @author NAM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Character c = new Character();
		Thread1 t1=new Thread1(c);
		Thread2 t2=new Thread2(c);
		t1.start();
		t2.start();
	}
    
    
}
