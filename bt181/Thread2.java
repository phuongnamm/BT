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
public class Thread2 extends Thread {
	long start = (long) System.currentTimeMillis();

	Character c;

    public Thread2(Character c) {
        this.c = c;
    }

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (c) {
				c.notifyAll();
				try {
					c.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				long end = (long) System.currentTimeMillis();
				int upperChar = (int) c.getC();
				System.out.println("Thread 2 Character: " + (char)(upperChar - 32));
				if (end - start > 20000) {
					System.out.println("Exit!!");
					System.exit(0);
				}
			}

			try {
				Thread2.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

