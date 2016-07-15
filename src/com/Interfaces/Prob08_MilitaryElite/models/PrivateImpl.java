
package com.Interfaces.Prob08_MilitaryElite.models;

import com.Interfaces.Prob08_MilitaryElite.interfaces.Private;
import com.Interfaces.Prob08_MilitaryElite.models.abstraction.SoldierImpl;

/**
 *
 * @author chobi
 */
public class PrivateImpl extends SoldierImpl implements Private{
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    
    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        
        //Name: <firstName> <lastName> Id: <id> Salary: <salary>
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(String.format(" Salary: %.2f", this.getSalary()));
                
        return sb.toString();
    }
    
    
    
}
