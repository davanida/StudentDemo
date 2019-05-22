/*
 * Daniel Davani-Davari  
 * Student ID: 991502775
 * SYST10199 - Web Programming
 */
package week2;

/**
 * May 22nd, 2019
 * @author Daniel
 */
public class Week2 {

    
    public static void main(String[] args) {
       
        Student arr [] = new Student [3];
        
        arr[0] = new Student("Ronnie",19,200);
        arr[1] = new Student("Rex",18,600);
        arr[2] = new Student("Repunzal",25,421);
        
        System.out.println(arr[2].getSid());
        
        
    }
    //System.out.println("Testing Fetch");
}
