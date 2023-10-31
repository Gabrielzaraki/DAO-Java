package application;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao deptDao = DaoFactory.createDepartmentDao();
		
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
		
		/*System.out.println("\n===== TESTE 4 Insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gregmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());*/
		
		/*System.out.println("\n===== TESTE 5 SellerUpdate =====");
		seller = sellerDao.findById(1);
		seller.setName("Manitada Jhonsons");
		sellerDao.update(seller);
		System.out.println("Update Complete!");*/
		
		System.out.println("\n===== TESTE 6 DeleteByID =====");
		sellerDao.deleteById(1);
		System.out.println("Delete Complete!");
		
		System.out.println("\n===== TESTE 7 FindAll Departments =====");
		List<Department> deptList = deptDao.findAll();
		deptList.forEach(System.out::println);
		
		System.out.println("===== TESTE 8 FindById Departments ====");
		Department dept = deptDao.findById(2);
		System.out.println(dept);
		
		/*System.out.println("\n===== TESTE 4 Insert Departments =====");
		Department newDept = new Department(null, "Tecnology");
		deptDao.insert(newDept);
		System.out.println("Inserted! New id = " + newDept.getId());*/
		
		/*System.out.println("\n===== TESTE 9 DeptUpdate =====");
		dept = deptDao.findById(6);
		dept.setName("Food");
		deptDao.update(dept);
		System.out.println("Update Complete!");*/
		
		System.out.println("\n===== TESTE 10 DeleteByID Depts =====");
		deptDao.deleteById(6);
		System.out.println("Delete Complete!");
		
		
		
		
		
		
		
		
		
	}

}
