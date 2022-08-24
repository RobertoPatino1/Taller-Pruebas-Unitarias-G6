/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import com.mycompany.tallerpruebas.Employee;
import com.mycompany.tallerpruebas.EmployeeType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Estudiante
 */
public class EmployeeTest {

    
    public EmployeeTest() {
    }
    
    
    /*
    Test del constructor
    */
    @org.junit.jupiter.api.Test
    public void testConstructor(){
        float salary = 920.0F;
        String currency= "USD";
        float bonusPercentage= 0.20F;
        EmployeeType employeeType=EmployeeType.Manager;
        
        Employee empleado = new Employee(salary,currency,bonusPercentage,employeeType);
        
        assertNotEquals(null,empleado);
    }
    
    
    
    /**
     * Test of cs method, of class Employee.
     */
    
    
    
    @org.junit.jupiter.api.Test
    public void testCs() {
        Employee worker = new Employee(300.0F,"USD",0.15F,EmployeeType.Worker);
        Employee manager = new Employee(400.0F,"EU",0.15F,EmployeeType.Manager);
        Employee supervisor = new Employee(500.0F,"USD",0.15F,EmployeeType.Supervisor);
        float expResult1 = 300.0F;
        float expResult2 = 380.105F;
        float expResult3 = 500.0525F;
        float resultW = worker.calculateSalary();
        float resultM = manager.calculateSalary();
        float resultS = supervisor.calculateSalary();
        assertEquals(expResult1, resultW);
        assertEquals(expResult2, resultM);
        assertEquals(expResult3, resultS);

    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateYearBonus() {
        Employee worker = new Employee(400.0F,"EU",0.15F,EmployeeType.Worker);
        Employee manager = new Employee(750.0F,"USD",0.15F,EmployeeType.Manager);
        Employee supervisor = new Employee(860.0F,"USD",0.30F,EmployeeType.Supervisor);
        float expResult1 = 386.0F;
        float expResult2 = 1136.0F;
        float expResult3 = 1053.0F;
        float result1 = worker.CalculateYearBonus();
        float result2 = manager.CalculateYearBonus();
        float result3 = supervisor.CalculateYearBonus();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.

    }
    @org.junit.jupiter.api.Test
    public void testCsCCaseManager() {
        System.out.println("cs Manager");
        String currency="USD";
        Employee instance = new Employee(2000,currency,10,EmployeeType.Manager);
        float expResult = 2007.0F;
        float result = instance.calculateSalary();
        assertEquals(expResult, result, 0.0);
    }
 
    
    
    
}
