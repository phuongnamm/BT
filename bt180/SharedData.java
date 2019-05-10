/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt180;

/**
 *
 * @author NAM
 */
public class SharedData {
    int total=0;

    public SharedData() {
    }

    public int getTotal() {
        return total;
    }

    public synchronized void setTotal(int total) {
        this.total += total;
    }
}
