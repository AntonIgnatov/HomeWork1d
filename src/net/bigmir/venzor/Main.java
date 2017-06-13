package net.bigmir.venzor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(Network.printArray());
		
		System.out.println("Input your nomber:");
		Scanner sc = new Scanner(System.in);
		Phone a = new Phone(sc.nextInt());
		a.connect();
		System.out.println("Input nomber to call:");
		int b = sc.nextInt();
		sc.close();
		a.call(b);

	}

}
