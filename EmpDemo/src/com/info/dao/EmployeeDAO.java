package com.info.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.info.model.Address;
import com.info.model.Employee;
//import com.info.model.Address;
@Component
public class EmployeeDAO {
	@Autowired
	SessionFactory factory;
	public EmployeeDAO() {
	
	}
	
	 	public int addEmployee(Employee employee)
	 	{
	 		System.out.println(employee.getEno() + employee.getUsername() + employee.getAddress().getAno() + employee.getAddress().getCity());
	 		 	
	 		
	        	Session	session = factory.openSession();
	        	session.beginTransaction();
	        	Address address = new Address();
	 		 	address.setAno(employee.getAddress().getAno());
	 		 	address.setCity(employee.getAddress().getCity());
	 		 	address.setState(employee.getAddress().getState());
	 		 	session.save(address);
	            employee.setAddress(address);
	            int eno = (Integer)session.save(employee);
	        	session.getTransaction().commit();
	        	session.close();
	        	System.out.println(eno);
			    return eno;
}
	 	
	 	public boolean checkEmployee(Employee employee)
	 	{
	 		Session session = factory.openSession();
	 		String hquery = "from Employee where username=:username and password=:password";
	 		Query query= session.createQuery(hquery);
	 		query.setParameter("username", employee.getUsername());
	 		query.setParameter("password", employee.getPassword());
	 		Employee emp = (Employee)query.uniqueResult();
	 		boolean flag =false;
	 		if(emp!=null)
	 			flag= true;
	 		session.close();
			return flag;
	 	}
	 
	 	public List<Employee> viewEmployeeDetails()
	 	{
	 		Session session = factory.openSession();
	 		/*String hquery = "SELECT employee.eno, employee.ename, employee.gender, employee.salary, employee.username, address.city, address.state " + 
	 				"FROM Employee employee " + 
	 				"INNER JOIN employee.address address";
	 	*/	
	 		String hquery="from Employee";
	 		String hquery1="from Address";
	 		
	 		Query query = session.createQuery(hquery);
	 		Query query1 = session.createQuery(hquery1);
	 		
	 		//List allEmployees = query.getResultList();
	 		List<Employee> allEmployees = query.list();
	 		List<Address> allAddress = query1.list();
	 		
	 		for(int i=0;i<allEmployees.size();i++)
	 		{
	 			allEmployees.get(i).setAddress(allAddress.get(i));
	 		}
	 	
	 		System.out.println(allAddress.get(0));
	 		System.out.println(allEmployees.get(0));
	 	//	System.out.println(allEmployees.get(0).setAddress(allAddress.get(0)));

	 	
	 		
	 	return allEmployees;
	 	}
	 	
	 	
		
		public void deleteEmployee(int no)
	 	{
	 		Session session = factory.openSession();
	 		session.beginTransaction();
	 	   
	 	    Address address = new Address();
	 	    Query query = session.createQuery("delete Employee where ano = :no");
	 	    query.setParameter("no", no);
	 	    query.executeUpdate();
	 	    address.setAno(no);
	 		session.delete(address);
	 		
	 		session.getTransaction().commit();
	 		session.close();
	 		
	 		
	 	}

		
}
