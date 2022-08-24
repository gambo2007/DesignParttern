package Main;

import java.util.Scanner;

import Entity.AbstractFactory.FoodAbstractFactory;
import Entity.AbstractFactory.FoodFactory;
import Entity.AbstractFactory.Milk;
import Entity.AbstractFactory.TypeFood;
import Entity.AbstractFactory.Yaour;
import Entity.Composite.DetailsEmployee;
import Entity.Decorator.Food;
import Entity.Decorator.Millk;
import Entity.Decorator.PureMilk;
import Entity.Decorator.PureYaour;
import Entity.Decorator.SugarMilk;
import Entity.Decorator.SugarYaour;
import Entity.Decorator.Yaour2;
import Entity.Proxy.ProxyImage;
import Entity.Singleton.SingleCompany;
import Entity.Template.NetOrder;
import Entity.Template.OrderProcess;
import Entity.Template.StoreOrder;

public class Main {
	private static FoodAbstractFactory factory;

	public static void main(String[] args) {
		System.out.println("Welcome to Company Management");
		Scanner scanner = new Scanner(System.in);
		
		SingleCompany company = SingleCompany.getInstance();
		boolean flag=true;
		company.inputInfor(scanner);
		System.out.println("---------------------------------------------------");
		
		do {
			int n;
			System.out.println("");
			showMenu();
			System.out.println("Enter your option: ");
			n = Integer.parseInt(scanner.nextLine());
			switch (n) {
			case 1:
				company.showInfor();
				break;
			case 2:
				boolean flag1 = true;
				do {
					System.out.println("");
					showTypeFood();
					System.out.println("Choose type food: ");
					int i = Integer.parseInt(scanner.nextLine());
					switch(i) {
					case 1:
						FoodAbstractFactory factory = FoodFactory.getFactory(TypeFood.PURE);
						boolean flag2 = true;
						do {
							System.out.println("");
							showFood();
							System.out.println("Choose food: ");
							int k = Integer.parseInt(scanner.nextLine());
							switch(k) {
							case 1:
								Milk milk = factory.createMilk();
								milk.create();
								break;
							case 2:
								Yaour yaour = factory.createYaour();
								yaour.create();
								break;
							case 0:
								System.out.println("Back to TypeFood");
								flag2 = false;
								break;
							default:
								System.out.println("Invalid input!!!!");
								break;
							}
						} while(flag2);
						break;
					case 2:
						FoodAbstractFactory factory1 = FoodFactory.getFactory(TypeFood.SUGAR);
						boolean flag3 = true;
						do {
							System.out.println("");
							showFood();
							System.out.println("Choose food: ");
							int k = Integer.parseInt(scanner.nextLine());
							switch(k) {
							case 1:
								Milk milk = factory1.createMilk();
								milk.create();
								break;
							case 2:
								Yaour yaour = factory1.createYaour();
								yaour.create();
								break;
							case 0:
								System.out.println("Back to TypeFood");
								flag3 = false;
								break;
							default:
								System.out.println("Invalid input!!!!");
								break;
							}
						} while(flag3);
						break;
						
					case 0:
						System.out.println("Back to Menu");
						flag1 = false;
						break;
					default:
						System.out.println("Not TypeFood!!!!");
						break;
					}
				}while(flag1);
				break;
				
			case 3:
				Food food = new Millk();
				food = new PureMilk(food);
				System.out.println(food.getDescription()
						+"$" + food.cost());
				
				Food food2 = new Millk();
				food2 = new SugarMilk(food2);
				System.out.println(food2.getDescription()
						+"$" + food2.cost());
				
				Food food3 = new Yaour2();
				food3 = new PureYaour(food3);
				System.out.println(food3.getDescription()
						+"$" + food3.cost());
				
				Food food4 = new Yaour2();
				food4 = new SugarYaour(food4);
				System.out.println(food4.getDescription()
						+"$" + food4.cost());

				break;	
			case 4:
				
				
				boolean flag7 = true;
				do{
				System.out.println("");
				showImageFood();
				System.out.println("Choose type food images: ");
				int u = Integer.parseInt(scanner.nextLine());
				switch(u) {
				case 1:
					System.out.println("----PureMilk---- ");
			        ProxyImage proxyImage = new ProxyImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqNOggwZJXZRl4Y5ABJ8uKa9Q67WLoHJmDcyDYMXhbvgHP4YAraDX8J3NiOrURXB6ojfSYDN0&usqp=CAc");
			        proxyImage.showFoodImage();
					break;
				case 2:
					System.out.println("----SugarMilk---- ");
			        ProxyImage proxyImage2 = new ProxyImage("https://suachobeyeu.vn/upload/images/sua-tuoi-tiet-trung-vinamilk-co-duong-bich-220-ml-1.jpg");
			        proxyImage2.showFoodImage();
					break;
				case 3:
					System.out.println("----PureYaour---- ");
			        ProxyImage proxyImage3 = new ProxyImage("https://www.purnatur.eu/images/producten/natuuryoghurt/624.jpg");
			        proxyImage3.showFoodImage();
			        break;
				case 4:
					System.out.println("----SugarYaour---- ");
			        ProxyImage proxyImage4 = new ProxyImage("https://www.purnatur.eu/images/producten/natuuryoghurt/624.jpg");
			        proxyImage4.showFoodImage();
					break;
				case 0:
					System.out.println("Back to Menu");
					flag7 = false;
					break;
				default:
					System.out.println("Invalid input!!!!");
					break;
				}
				} while(flag7);
				break;
				
			case 5:
				boolean flag4 = true;
				do{
				System.out.println("");
				showOrder();
				System.out.println("Choose type food: ");
				int i = Integer.parseInt(scanner.nextLine());
				switch(i) {
				case 1:
					
					boolean flag5 = true;
					do {
						System.out.println("");
						showProcessOrder();
						System.out.println("Choose food: ");
						int k = Integer.parseInt(scanner.nextLine());
						switch(k) {				
								case 1:
									OrderProcess netOrder = new NetOrder();
							        netOrder.processOrder(true);
							        System.out.println();
									break;
								case 2:
									OrderProcess storeOrder = new StoreOrder();
							        storeOrder.processOrder(true);
									break;
								case 0:
									System.out.println("Back to TypeFood");
									flag5 = false;
									break;
								default:
									System.out.println("Invalid input!!!!");
									break;
								}
							} while(flag5);
							break;
				case 2:
					boolean flag6 = true;
					do {
						System.out.println("");
						showProcessOrder();
						System.out.println("Choose food: ");
						int k = Integer.parseInt(scanner.nextLine());
						switch(k) {
								case 1:
									OrderProcess netOrder = new NetOrder();
							        netOrder.processOrder(true);
							        System.out.println();
									break;
								case 2:
									OrderProcess storeOrder = new StoreOrder();
							        storeOrder.processOrder(true);
									break;
								case 0:
									System.out.println("Back to TypeFood");
									flag6 = false;
									break;
								default:
									System.out.println("Invalid input!!!!");
									break;
								}
							} while(flag6);
							break;
				case 0:
					System.out.println("Back to Menu");
					flag4 = false;
					break;
				default:
					System.out.println("Invalid input!!!!");
					break;
				}
				} while(flag4);
				break;
			
				
			case 6:
				DetailsEmployee e1 = new DetailsEmployee("Long","CEO",1,"LeHoangLong@gmail.com","FoodCompany");
				DetailsEmployee e2 = new DetailsEmployee("Son","HeadSales",2,"TranNgocThaiSon@gmail.com","FoodCompany");
				DetailsEmployee e3 = new DetailsEmployee("Tai","HeadMarketing",3,"NguyenHuuTai@gmail.com","FoodCompany");
				
				e1.add(e2);
				e1.add(e3);
				
				System.out.println(e1);
				
				for (DetailsEmployee headEmployee : e1.getSubordinates()) {
			         System.out.println(headEmployee);
			         
			         for (DetailsEmployee employee : headEmployee.getSubordinates()) {
			            System.out.println(employee);
			         }
			      }	
				break;
				
				
				
				
			case 0:
				System.out.println("See you again!!!!");
				flag1 = false;
				break;
			default:
				System.out.println("Invalid input!!!!");
				break;
			} 
		}while (flag);
	}
	
	
	static void showMenu() {
		int spaceNum = 20;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "Company Management" + String.format("%" + spaceNum + "s", ""));
		System.out.println("Menu:");
		System.out.println("\t1. Show information about company");
		System.out.println("\t2. Create Food");
		System.out.println("\t3. Show Menu of Food");
		System.out.println("\t4. Image of Food");
		System.out.println("\t5. Order Food");
		System.out.println("\t6. Show information about employee");
		System.out.println("\t0. Exit");
	}
	
	static void showTypeFood() {
		int spaceNum = 25;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "Type Food" + String.format("%" + spaceNum + "s", ""));
		System.out.println("\t\t1. Pure Food");
		System.out.println("\t\t2. Sugar Food");
		System.out.println("\t\t0. Back to Menu");
	}
	
	static void showFood() {
		int spaceNum = 25;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "Food" + String.format("%" + spaceNum + "s", ""));
		System.out.println("\t\t\t1. Milk");
		System.out.println("\t\t\t2. Yaour");
		System.out.println("\t\t\t0. Back to Type Food");
	}
	
	static void showOrder() {
		int spaceNum = 25;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "Type Food" + String.format("%" + spaceNum + "s", ""));
		System.out.println("\t\t\t1. Order Milk");
		System.out.println("\t\t\t2. Order Yaour");
		System.out.println("\t\t\t0. Back to Menu");
	}
	
	static void showProcessOrder() {
		int spaceNum = 30;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "Type Order" + String.format("%" + spaceNum + "s", ""));
		System.out.println("\t\t\t1. Internet Order");
		System.out.println("\t\t\t2. Store Order");
		System.out.println("\t\t\t0. Back to Type Food");
	}
	
	static void showImageFood() {
		int spaceNum = 40;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "FoodImage" + String.format("%" + spaceNum + "s", ""));
		System.out.println("\t\t1. Pure Milk");
		System.out.println("\t\t2. Sugar Milk");
		System.out.println("\t\t3. Pure Yaour");
		System.out.println("\t\t4. Sugar Yaour");
		System.out.println("\t\t0. Back to Menu");
	}
	
	
	static void BacktoMenu() {
		int spaceNum = 30;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "Food" + String.format("%" + spaceNum + "s", ""));
		System.out.println("\t\t\t0. Back to Menu");
	}
}
