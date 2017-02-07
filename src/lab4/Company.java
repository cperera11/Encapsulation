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
    
    private final static String name = "IT Net Solutions";
    private HRManager hrManager;

    public Company(String empFirstName, String empLastName, String empSsn) {
        hrManager = new HRManager(empFirstName, empLastName, empSsn);
    }

    public void hireEmployee(String empCubeId) {
        hrManager.hireEmployee(empCubeId);

    }

    public void fireEmployee() {

    }

    public static String getName() {
        return name;
    }

}

    
