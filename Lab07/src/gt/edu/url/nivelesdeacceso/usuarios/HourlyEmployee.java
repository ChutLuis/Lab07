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
public abstract class HourlyEmployee extends Employee {

    private int hoursPerWeek;
    private double hourlyWage;
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public double monthlyPay() {
        return (hoursPerWeek*hourlyWage)*4;
    }
    
    protected abstract double annualPay();  
    
    
}
