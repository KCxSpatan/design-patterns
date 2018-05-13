package kcx.example.designpatterns.cloneable;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCloning {

	@Test
	public void valid_clone() throws CloneNotSupportedException {

		Department hr = new Department(1, "Human Resource");
		Employee original = new Employee(1, "Admin", hr);
		Employee cloned = (Employee) original.clone();

		// Let change the department name in cloned object and we will verify in
		// original object
		cloned.getDepartment().setName("Finance");

		System.out.println("Clone department is " + cloned.getDepartment().getName());
		assertEquals("Finance", cloned.getDepartment().getName());
		// Because it not primitive type it reference type
		System.out.println("Original department is " + original.getDepartment().getName());
		assertFalse("Human Resource".equals(original.getDepartment().getName()));

		assertEquals(original.getEmployeeName(), cloned.getEmployeeName());
		cloned.setEmployeeName("Business Man");
		assertEquals("Admin", original.getEmployeeName());
		assertEquals("Business Man", cloned.getEmployeeName());
	}
}
