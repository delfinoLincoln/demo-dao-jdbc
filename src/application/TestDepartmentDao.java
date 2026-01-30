package application;

import java.util.List;

import models.dao.DaoFactory;
import models.dao.DepartmentDao;
import models.entities.Department;
import util.ClearScreen;

public class TestDepartmentDao {
    public static void main(String[] args) {
        ClearScreen.cls();

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("TEST 1: department insert");
        System.out.println("------------------------------");
        Department newDep = new Department(null, "Food");
        departmentDao.insert(newDep);
        System.out.println("Inserted! New id is " + newDep.getId());
        System.out.println("------------------------------");
        System.out.println();

        System.out.println("TEST 2: department update");
        System.out.println("------------------------------");
        newDep.setName("Photo");
        departmentDao.update(newDep);
        System.out.println("Update completed!");
        System.out.println("------------------------------");
        System.out.println();
        
        System.out.println("TEST 5: department findALL");
        System.out.println("------------------------------");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
        System.out.println("------------------------------");
        System.out.println();

    }
}