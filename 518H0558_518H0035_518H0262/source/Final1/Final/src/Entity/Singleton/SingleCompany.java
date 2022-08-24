package Entity.Singleton;

import java.util.Scanner;

public class SingleCompany {
	private static String nameCompany;
	private static String taxId;
	private static double revenueCompany;
	
	private static SingleCompany instance = new SingleCompany(nameCompany, nameCompany, revenueCompany);
	
	
	private SingleCompany(String nameCompany, String taxId, double revenueCompany) {
		this.nameCompany = nameCompany;
		this.taxId = taxId;
		this.revenueCompany= revenueCompany;
	}
	
	public static SingleCompany getInstance() {
		return instance;
	}
	
	public void inputInfor(Scanner scanner) {
		System.out.println("Input name Company: ");
		this.nameCompany = scanner.nextLine();
		System.out.println("Input TaxId: ");
		this.taxId = scanner.nextLine();
		System.out.println("Input revenue Company: ");
		this.revenueCompany = Float.parseFloat(scanner.nextLine());
	}
	
	public void showInfor() {
		System.out.println("--ABOUT COMPANY--");
		System.out.println("\tName: " + this.nameCompany);
		System.out.println("\tId Tax: " + this.taxId);
		System.out.println("\tRevenue: " + this.revenueCompany);

	}
}
