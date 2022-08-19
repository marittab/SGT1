package oop.members;

import java.nio.file.Watchable;

public class JobClassCalling {
    public static void main(String[] args) {

        Employee employee = new Employee();
       Manager manager = new Manager();

        employee.name = "qwer";
        employee.age = 46;
        employee.phoneNumber = "+371542552";
        employee.address = "Rmsbn";
        employee.salary = 12345;
        employee.specialization = "werty";
        employee.printSalary();

        manager.name = "qwer";
        manager.age = 46;
        manager.phoneNumber = "+371542552";
        manager.address = "DFGH";
        manager.salary = 5432;
        manager.department = "uytr";
        manager.printSalary();
    }
}
