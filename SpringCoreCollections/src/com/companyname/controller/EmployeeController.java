package com.companyname.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.companyname.model.Account;
import com.companyname.model.Employee;

public class EmployeeController {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
		Object obj=context.getBean("employee");
		Employee e=(Employee) obj;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("----Employee Details----");
		System.out.println("Enter Employee Id:");
		e.setEmployeeId(scanner.nextInt());
		System.out.println("Enter Employee Name:");
		e.setEmployeeName(scanner.next());
		System.out.println("Enter Email Id:");
		e.setEmailId(scanner.next());
		System.out.println("Enter Contact Number:");
		e.setContactNumber(scanner.next());
		
		System.out.println("----Account Details----");
		Account acc1=new Account();
		System.out.println("Enter Account Number:");
		acc1.setAccountNumber(scanner.nextLong());
		System.out.println("Enter Account Holder Name:");
		acc1.setAccountHolderName(scanner.next());
		
		Account acc2=new Account();
		System.out.println("Enter Account Number:");
		acc2.setAccountNumber(scanner.nextLong());
		System.out.println("Enter Account Holder Name:");
		acc2.setAccountHolderName(scanner.next());
		
		Account acc3=new Account();
		System.out.println("Enter Account Number:");
		acc3.setAccountNumber(scanner.nextLong());
		System.out.println("Enter Account Holder Name:");
		acc3.setAccountHolderName(scanner.next());
		
		
		List<Account> list=new ArrayList<Account>();
		list.add(acc1);
		list.add(acc2);
		list.add(acc3);
		
		/*for(int i=0;i<3;i++)
		{
			Account acc[]=new Account[i];
			System.out.println("Enter Account Number:");
			acc[i].setAccountNumber(scanner.nextLong());
			System.out.println("Enter Account Holder Name:");
			acc[i].setAccountHolderName(scanner.next());
			list.add(acc[i]);
		}*/
		
		
		System.out.println("Employee Id: "+e.getEmployeeId());
		System.out.println("Employee Name: "+e.getEmployeeName());
		System.out.println("Email Id: "+e.getEmailId());
		System.out.println("Contact Number: "+e.getContactNumber());
		
		//System.out.println("Account Details: "+e.getAccount());
		System.out.println("-----------------------------------------------");
		System.out.println("Accountb Number"+"\t"+"Accountb Holder Number");
		System.out.println("-----------------------------------------------");
		
		//List<Account> accountList=list.getAccount();
		for(Account account:list)
		{
			System.out.println(account.getAccountNumber()+"\t"+account.getAccountHolderName());
		}
	}

}
