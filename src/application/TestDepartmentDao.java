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
        
        System.out.println("TEST 1: department findALL");
        System.out.println("------------------------------");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
        System.out.println("------------------------------");
        System.out.println();
    }
}