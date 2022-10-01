/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeModel;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class AllEmployees {
    private ArrayList<EmployeeDetails> allEmployees;
    
    public AllEmployees(){
        this.allEmployees = new ArrayList<>();
    }

    public ArrayList<EmployeeDetails> getAllEmployees() {
        return allEmployees;
    }

    public void setAllEmployees(ArrayList<EmployeeDetails> allEmployees) {
        this.allEmployees = allEmployees;
    }
    
    public EmployeeDetails addEmployeeDetails(){
        EmployeeDetails emp = new EmployeeDetails();
        allEmployees.add(emp);
        return emp;
    }
    
    public void deleteEmployee(EmployeeDetails emp){
        allEmployees.remove(emp);
    }
    
}
