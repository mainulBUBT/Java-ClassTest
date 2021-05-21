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
public class Citizen {
    String NID, Name,Phone;
    int Salary;
    
    public Citizen(String a, String b, String c, int d)
    {
        NID = a;
        Name = b;
        Phone = c;
        Salary = d;
    }
    
    public Citizen(String a, String b, String c)
    {
        NID = a;
        Name = b;
        Phone = c;
        Salary = 0;
    }
    
}
