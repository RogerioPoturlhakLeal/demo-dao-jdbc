package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerrDao();
		
		System.out.println("=== TESt 1: seller findById =====");		
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		
		System.out.println("\n=== TEST 2: seller findByIdDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
