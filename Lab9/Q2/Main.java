package edu.manipal.mahe.main;

import edu.manipal.mahe.employee.Employee;
import edu.manipal.mahe.department.Department;
import edu.manipal.mahe.payroll.Payroll;

public class Main {

    public static void main(String[] args) {
        Employee emp1   = new Employee(101, "Arun", 35, 50000.0);
        Department dept1 = new Department("IT Department", "Mr. Rao", "Bangalore");
        Payroll payroll1 = new Payroll(emp1, dept1);
        payroll1.generatePaySlip();
    }
}
