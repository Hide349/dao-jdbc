package app;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		List<Department> list = new ArrayList<>();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1: department findbyId ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("=== TESTE 2 : department find ALL ===");
		list = departmentDao.findAll();
		for(Department departmento : list) {
			System.out.println(departmento);
		}
		
		System.out.println("=== TESTE 3 : department INSERT ");
		Department dep = new Department(8,"Alimentação");
//		departmentDao.insert(dep);
		System.out.println("INserido! novo id = " + dep.getId());
		
		System.out.println("=== TESTE 4 : department UPDATE");
		dep.setName("TESTE");
		departmentDao.update(dep);
		
		System.out.println("=== TESTE 5 : department DELETE");
		departmentDao.deleteById(8);
		departmentDao.deleteById(7);

	}

}
