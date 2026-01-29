package application;

import java.util.List;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;
import util.ClearScreen;

public class Test {
    public static void main(String[] args) {
        ClearScreen.cls();

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TEST 1: seller findById");
        System.out.println("--------------------------");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("TEST 2: seller findByDepartment");
        System.out.println("--------------------------");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("--------------------------");

        System.out.println("TEST 3: seller findAll");
        System.out.println("--------------------------");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("--------------------------");
    }
}
