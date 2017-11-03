/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.nivelesdeacceso;

import gt.edu.url.nivelesdeacceso.usuarios.FullTime;
import gt.edu.url.nivelesdeacceso.usuarios.Manager;
import gt.edu.url.nivelesdeacceso.usuarios.PartTime;
import gt.edu.url.nivelesdeacceso.usuarios.Staff;



/**
 *
 * @author t203
 */
public class NivelesDeAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager n1 = new Manager();
       n1.name = "Luis";
       System.out.println(n1.annualPay());
       
       Staff n2 = new Staff();
       n2.name = "Panchito";
       System.out.println(n2.annualPay());
       
       FullTime n3 = new FullTime();
       n3.setHoursPerWeek(50);
       n3.setHourlyWage(5);
       n3.name = "Fulano";
       System.out.println(n3.annualPay());
       
       PartTime n4 = new PartTime();
       n4.setHoursPerWeek(12);
       n4.setHourlyWage(5);
       n4.name = "Fulano";
       System.out.println(n4.annualPay());
       
    }
    
}
