/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt180;

import java.util.Random;

public class Thread2 extends Thread {
	Thread1 t1;
	SharedData data;
	
	public Thread2(SharedData data) {
		this.data=data;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rad = new Random();
		while (true) {
			int number = rad.nextInt(101) - 101;
			data.setTotal(number);
			System.out.println("Thread2: " + number);
			System.out.println("TOTAL:"+data.getTotal());
			if (data.getTotal() > 100 || data.getTotal() < -100) {
				System.out.println("STOP!");
				System.exit(0);
					
			}
                        try {
                                Thread.sleep(500);
                        } catch (InterruptedException e) {
                                System.out.println(e);
                        }
			
		}
	}
}