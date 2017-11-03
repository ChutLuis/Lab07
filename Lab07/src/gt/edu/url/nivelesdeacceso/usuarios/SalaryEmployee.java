/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.nivelesdeacceso.usuarios;

/**
 *
 * @author t203
 */
public abstract class SalaryEmployee extends Employee {
    int annualSalary;
    public SalaryEmployee(){
        name = "Luis";        
        setHireYear(1999);
        country = "Guatemala";
    }

    @Override
    public double monthlyPay() {
        return 1000.00;
    }
    

    @Override
    protected abstract double annualPay();
    
    
    
}
