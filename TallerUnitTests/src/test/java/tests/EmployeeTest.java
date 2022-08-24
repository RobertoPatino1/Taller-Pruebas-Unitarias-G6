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
    
    @org.junit.jupiter.api.Test
    public void testCalculateSalaryWorkerUSD() {
        Employee worker = new Employee(300.0F,"USD",0.15F,EmployeeType.Worker);
        float expResult1 = 300.0F;
        float resultW = worker.calculateSalary();
        assertEquals(expResult1, resultW);
    }
    
    public void testCalculateSalaryWorkerEU(){
        Employee worker = new Employee(300.0F,"EU",0.15F,EmployeeType.Worker);
        float expResult1 = 285.0F;
        float resultW = worker.calculateSalary();
        assertEquals(expResult1, resultW);
    }
    public void testCalculateSalaryManagerUSD(){
        Employee manager = new Employee(400.0F,"USD",0.15F,EmployeeType.Manager);
        float expResult1 = 400.105F;
        float resultM = manager.calculateSalary();
        assertEquals(expResult1, resultM);
    }
    public void testCalculateSalaryManagerLB(){
        Employee manager = new Employee(400.0F,"LB",0.15F,EmployeeType.Manager);
        float expResult1 = 380.105F;
        float resultM = manager.calculateSalary();
        assertEquals(expResult1, resultM);
    }
    public void testCalculateSalarySupervisorUSD(){
        Employee supervisor = new Employee(500.0F,"USD",0.15F,EmployeeType.Supervisor);
        float expResult1 = 500.0525F;
        float resultS = supervisor.calculateSalary();
        assertEquals(expResult1, resultS);
    }
    public void testCalculateSalarySupervisorMXN(){
        Employee supervisor = new Employee(500.0F,"MXN",0.15F,EmployeeType.Supervisor);
        float expResult1 = 475.0525F;
        float resultS = supervisor.calculateSalary();
        assertEquals(expResult1, resultS);
    }


    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateYearBonusWorkerUSD() {
        Employee worker = new Employee(400.0F,"USD",0.15F,EmployeeType.Worker);
        float expResult1 = 386.0F;
        float result1 = worker.CalculateYearBonus();
        assertEquals(expResult1, result1);
    }
    
    @org.junit.jupiter.api.Test
    public void testCalculateYearBonusWorkerEU(){
        Employee worker = new Employee(400.0F,"EU",0.15F,EmployeeType.Worker);
        float expResult1 = 386.0F;
        float result1 = worker.CalculateYearBonus();
        assertEquals(expResult1, result1);
    }
    
    @org.junit.jupiter.api.Test
    public void testCalculateYearBonusManagerUSD(){
        Employee manager = new Employee(750.0F,"USD",0.15F,EmployeeType.Manager);
        float expResult1 = 1136.0F;
        float result1 = manager.CalculateYearBonus();
        assertEquals(expResult1, result1);        
    }
    
    @org.junit.jupiter.api.Test
    public void testCalculateYearBonusManagerLB(){
        Employee manager = new Employee(750.0F,"LB",0.15F,EmployeeType.Manager);
        float expResult1 = 1098.5F;
        float result1 = manager.CalculateYearBonus();
        assertEquals(expResult1, result1);        
    }
    
    @org.junit.jupiter.api.Test
    public void testCalculateYearBonusSupervisorUSD(){
        Employee supervisor = new Employee(860.0F,"USD",0.30F,EmployeeType.Supervisor);        
        float expResult1 = 1053.0F;
        float result1 = supervisor.CalculateYearBonus();
        assertEquals(expResult1, result1);        
    }

    @org.junit.jupiter.api.Test
    public void testCalculateYearBonusSupervisorMXN(){
        Employee supervisor = new Employee(860.0F,"MXN",0.30F,EmployeeType.Supervisor);
        float expResult1 = 1010.0F;
        float result1 = supervisor.CalculateYearBonus();
        assertEquals(expResult1, result1);        
    }
}
