/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

/**
 *
 * @author DELL
 */
public class ClassTest {

   
    public static void main(String[] args) {
        Citizen[] a = new Citizen[4];
        
        a[0]=new Citizen ("123", "Mihan","000001", 25000);
        a[1]=new Citizen ("124", "Nafiz","000022", 22000);
        a[2]=new Citizen ("125", "Hridoy","0202020", 20000);
        a[3]=new Citizen ("126", "Rabbi","93477313", 19000);
        int count=0;
         for(Citizen s:a)
         {
             if(s.Salary>20000)
             {
                 count++;
             }
         }
         
         System.out.println(count);
        
                
        
                
    }
    
}
