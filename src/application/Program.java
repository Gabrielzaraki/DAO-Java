package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TESTE 1 FindById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===== TESTE 2 FindByDep =====");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("\n===== TESTE 3 FindAll =====");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n===== TESTE 4 Insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gregmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
	}

}
