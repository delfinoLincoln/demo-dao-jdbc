package application;

import java.util.Date;
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
        System.out.println();

        System.out.println("TEST 3: seller findAll");
        System.out.println("--------------------------");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("TEST 4: seller insert");
        System.out.println("--------------------------");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id: " + newSeller.getId());
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("TEST 5: seller insert");
        System.out.println("--------------------------");
        seller = sellerDao.findById(10);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Update Complete");
        System.out.println("--------------------------");
        System.out.println();
    }
}
