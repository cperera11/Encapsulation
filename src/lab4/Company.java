/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author CPere
 */
public class Company {
    private String name;
    private String address;
    private HRManager hrManager;
    private Employee employee;
    
    
    private Company(){
    employee = new Employee();
    }
    
    
}
