/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package towerofhanoi;

/**
 *
 * @author rkaune
 */
public class TowerOfHanoi {
static int counter =0;
   public static void main(String[] args) {
        int n = 20;
        String fromPeg = "A";
        String toPeg = "C";
        String tempPeg = "B";
        
        System.out.println("Towers of Hanoi problem");
        System.out.println("There are " + n + " discs on peg A initially ");
        hanoi (fromPeg, toPeg, tempPeg, n);
        System.out.println(counter);

    }
    static public void hanoi (String from, String to, String temp, int n) {
        
        if (n ==1) {
            System.out.println("Move disc 1 from " + from + " to " + to);
        } else {
            hanoi (from, temp, to, n-1);
            counter++;
            System.out.println("Move disc " + n + " from " + from + " to " + to);
            hanoi (temp, to, from, n-1);
            counter++;
        }
        
    }
    
}
