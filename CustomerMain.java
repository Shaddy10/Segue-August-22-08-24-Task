package com.StreamSpecific;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
	public static void main(String[] args) {
		List<Customer> customers=new ArrayList<Customer>();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		
		try {
			customers.add(new Customer(1,"Niklaus","New Orleans",90000,sdf.parse("1991-04-07")));
			customers.add(new Customer(2,"Elijah","New Orleans",60000,sdf.parse("1989-07-07")));
			customers.add(new Customer(3,"Joey","NYC",70000,sdf.parse("1990-11-23")));
			customers.add(new Customer(4,"Rick Grimes","Tampa",50000,sdf.parse("1985-01-31")));
			customers.add(new Customer(5,"Chandler Bing","New Jersey",95000,sdf.parse("1992-05-15")));
			customers.add(new Customer(6,"Ross","Long Island",100000,sdf.parse("1991-10-06")));
			customers.add(new Customer(7,"Barney","NYC",120000,sdf.parse("1990-03-19")));
			customers.add(new Customer(8,"Soprano","NYC",82000,sdf.parse("1980-06-27")));
			customers.add(new Customer(9,"Stefan","Mystic Falls",45000,sdf.parse("1975-09-10")));
			customers.add(new Customer(10,"Daemon","Mystic Falss",50000,sdf.parse("1974-04-10")));
			
		} catch (ParseException e) {
			System.out.println("Cannot Add Customers");
			e.printStackTrace();
		}
		// Printing all the records
		customers.forEach(x ->{
			System.out.println(x);
		});
		
		
		//Premium > 80000
		System.out.println();
		System.out.println("------Customers Premium > 800000---------");
		customers.stream().filter(x -> x.getPremium()>80000).forEach(y ->{
			System.out.println(y);
		});
		
		// Customers belonging to NYC
		System.out.println();
		System.out.println("----Cusomers Belonging to NYC");
		customers.stream().filter(x -> x.getCity()=="NYC").forEach(y -> {
			System.out.println(y);
		});
		
		// Sorted by DOB
		System.out.println();
		System.out.println("----Sorted by DOB-----");
		Collections.sort(customers,(c1,c2) -> {
			return c1.getDateOfBirth().compareTo(c2.getDateOfBirth());
		});
		customers.forEach(x -> {
			System.out.println(x);
		});
		
		//Sorted by Customer Name
		System.out.println();
		System.out.println("---------Sorted by Customer Name---------");
		Collections.sort(customers,(c1,c2) ->{
			return c1.getCustName().compareTo(c2.getCustName());
		});
		customers.forEach(x -> {
			System.out.println(x);
		});
	}
	
}
