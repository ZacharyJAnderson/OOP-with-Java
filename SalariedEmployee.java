package objectorienteddesign;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 *
 * @author Zachar J. Anderson
 */
public class SalariedEmployee extends SalesEmployee {

    private double baseSalary;

    public SalariedEmployee(double baseSalary, String firstName, String lastName, String id, double sales, double commission) {
        super(firstName, lastName, id, sales, commission);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("Salary must be greater than ZERO");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

}// end Class SalariedEmployee
