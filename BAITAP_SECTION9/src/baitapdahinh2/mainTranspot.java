package baitapdahinh2;

import java.util.Scanner;

import baitapdahinh1.Dog;

public class mainTranspot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Please Enter Number");
			System.out.println("1 :Train");
			System.out.println("2 : Car ");
			int n = new Scanner(System.in).nextInt();

			if (n == 1) {
				System.out.println("1.Menu Train");
				menuTrain();
				break;
			} else if (n == 2) {
				System.out.println("--------------");
				System.out.println("ENTER BUS OR TAXI");
				System.out.println("3.bus");
				System.out.println("4.taxi");
				int m = new Scanner(System.in).nextInt();
				if (m == 3) {
					System.out.println("3.Bus");
				}
				if (m == 4) {
					System.out.println("4.Taxi");
				}
				menuCar();
				break;

			}
		}
	}

	public static void input(Transpot a) {
		if (a instanceof Train) {
			Train train = (Train) a;
			System.out.println("TRAIN INPUT");
			System.out.println("_____________");
			System.out.println("Enter Ticket Price");
			train.setTicketPrice(new Scanner(System.in).nextInt());
			System.out.println("Enter Seat");
			train.setSeat(new Scanner(System.in).nextInt());
			System.out.println("Enter Wagon");
			train.setWagon(new Scanner(System.in).nextInt());
		}
		if (a instanceof Car) {
			Car car = (Car) a;
			System.out.println("Car INPUT");
			System.out.println("_____________");
			System.out.println("Enter Ticket Price");
			car.setTicketPrice(new Scanner(System.in).nextInt());
			System.out.println("Enter Seat");
			car.setSeat(new Scanner(System.in).nextInt());
			System.out.println("Enter car Species");
			car.setCarSpecies(new Scanner(System.in).nextLine());
		}
	}

	public static void info(Transpot a) {
		if (a instanceof Train) {
			Train train = (Train) a;
			System.out.println("Ticket Price" + train.getTicketPrice() + "Enter Seat" + train.getSeat() + "Enter Wagon"
					+ train.getWagon());
		}
		if (a instanceof Car) {
			Car car = (Car) a;
			System.out.println("Ticket Price" + car.getTicketPrice() + "Enter Seat" + car.getSeat()
					+ "Enter Car Species" + car.getCarSpecies());
		}
	}

	public static void menuTrain() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong Train: ");
		int d = sc.nextInt();

		Train[] trains = new Train[d];
		for (int i = 0; i < trains.length; i++) {
			trains[i] = new Train();
			input(trains[i]);
		}

		for (Train train : trains) {
			info(train);
		}
	}

	public static void menuCar() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap so luong Car: ");
			int c = sc.nextInt();

			Car[] cars = new Car[c];
			for (int i = 0; i < cars.length; i++) {
				cars[i] = new Car();
				input(cars[i]);
			}

			for (Car car : cars) {
				info(car);
			}
		}
	}

