package org.example;

public class Main{
	public static void main(String[] args){
		User user = new User();
		Report report1 = new Report(user);
		report1.report();
		Persister persister = new Persister(user);
		persister.save();
	}
}