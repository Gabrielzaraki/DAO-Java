package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1,"Books");
		Date data = new Date();
		Seller seller = new Seller(21, "Bob", "Bobmail", data, 3000.0, obj);
		System.out.println(seller);
	}

}
