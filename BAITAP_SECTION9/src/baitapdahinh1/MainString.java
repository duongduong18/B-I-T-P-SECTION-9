package baitapdahinh1;

import java.util.Scanner;

public class MainString {

	public static void main(String[] args) {
		while (true) {
			System.out.println("please choose animal");
			System.out.println("Menu 1. DOG");
			System.out.println("Menu 2. CHIKEN");

			int n = new Scanner(System.in).nextInt();

			if (n == 1) {
				System.out.println("1.Menu Dog");
				menuDog();
				break;
			} else if (n == 2) {
				System.out.println("2.Menu Chicken");
				menuChiken();
				break;

			}
		}
	}

	public static void input(Animal a) {
		if (a instanceof Dog) {
			Dog dog = (Dog) a;
			System.out.println("Dog input");
			System.out.println("-------------");

			System.out.println("Nhap Ten Cho");
			dog.setName(new Scanner(System.in).nextLine());

			System.out.println("Nhap Tuoi Cho");
			dog.setAge(new Scanner(System.in).nextInt());

			System.out.println("Nhap Xuat Su Cho");
			dog.setDogCountry(new Scanner(System.in).nextLine());
		}
		if (a instanceof Chiken) {
			Chiken chiken = (Chiken) a;
			System.out.println("Chiken input");
			System.out.println("-------------");

			System.out.println("Nhap Ten GA");
			chiken.setName(new Scanner(System.in).nextLine());

			System.out.println("Nhap Tuoi Ga");
			chiken.setAge(new Scanner(System.in).nextInt());

			System.out.println("Nhap Loai Ga");
			chiken.setChikenSpeices(new Scanner(System.in).nextLine());

		}

	}

	public static void info(Animal a) {
		if (a instanceof Dog) {
			Dog dog = (Dog) a;
			System.out.println(
					"Ten cho :" + dog.getName() + "Tuoi cho :" + dog.getAge() + "Xuat Su Cho" + dog.getDogCountry());
		}
		if (a instanceof Chiken) {
			Chiken chiken = (Chiken) a;
			System.out.println("Ten Ga :" + chiken.getName() + "Tuoi Ga :" + chiken.getAge() + "Xuat Su Ga"
					+ chiken.getChikenSpeices());
		}

	}

	
public static void menuDog() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong Cho: ");
		int d = sc.nextInt();

		Dog[] dogs = new Dog[d];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			input(dogs[i]);
		}

		for (Dog chicken : dogs) {
			info(chicken);
		}
	}
	public static void menuChiken() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong Ga: ");
		int g = sc.nextInt();

		Chiken[] chikens = new Chiken[g];
		for (int i = 0; i < chikens.length; i++) {
			chikens[i] = new Chiken();
			input(chikens[i]);
		}

		for (Chiken chicken : chikens) {
			info(chicken);
		}
	}

}
