package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Seller;
import util.ClearScreen;

public class App {
    public static void main(String[] args) {
        ClearScreen.cls();

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
