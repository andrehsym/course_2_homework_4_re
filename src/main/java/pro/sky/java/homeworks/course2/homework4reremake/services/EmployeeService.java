package pro.sky.java.homeworks.course2.homework4reremake.services;

import pro.sky.java.homeworks.course2.homework4reremake.Employee;

public interface EmployeeService {
    Employee addNew(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

}
