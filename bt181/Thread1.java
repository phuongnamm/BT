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
public class Thread1 extends Thread {
    Character c;

    public Thread1(Character c) {
        this.c = c;
    }

    public static int randomInt(){
	    int random = 97 + (int)(Math.random()*26);
	    return random;
	}
    @Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread1.sleep(1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (true) {
			synchronized (c) {				
				int number = randomInt();
				c.setC((char) number);
				System.out.println("Thread 1 Character: " + (char)number);
				c.notifyAll();
				try {
					c.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread1.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

    

}
