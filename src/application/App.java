package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Seller;
import util.ClearScreen;

public class App {
    public static void main(String[] args) {
        ClearScreen.cls();

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TEST 1: seller findById");
        System.out.println("--------------------------");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("--------------------------");
    }
}
