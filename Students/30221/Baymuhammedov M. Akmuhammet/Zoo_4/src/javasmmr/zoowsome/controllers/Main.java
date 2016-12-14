package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.employees.*;
import javasmmr.zoowsome.services.*;
import javasmmr.zoowsome.views.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] arg) throws Throwable {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Zoowsome!");
		/*
		 * System.out.
		 * println("type:\n1: Mammals\n2: Reptiles\n3: Aquatics\n4: Birds\n5: Insects"
		 * ); int key = in.nextInt(); do{ if(key==1){ Mammalsview m = new
		 * Mammalsview(); m.Mammalsview(); } else if(key==2){ Reptilesview r =
		 * new Reptilesview(); r.Reptilesview(); } else if(key==3){ Aquaticsview
		 * a = new Aquaticsview(); a.Aquaticsview(); } else if(key==4){
		 * Birdsview a = new Birdsview(); a.Birdsview(); } else if(key==5){
		 * Insectsview a = new Insectsview(); a.Insectsview(); } else{ throw new
		 * Exception("NotFound!"); } key=0; }while(key!=6 || key!=0);
		 */

		Animals[] A = new Animals[15];
		A[0] = new Goat();
		A[1] = new Cow();
		A[2] = new Panda();
		A[3] = new Cockroach();
		A[4] = new Beetle();
		A[5] = new Ant();
		A[6] = new Nightingale();
		A[7] = new Hawk();
		A[8] = new Penguin();
		A[9] = new Whale();
		A[10] = new Shark();
		A[11] = new Dolphin();
		A[12] = new Snake();
		A[13] = new Lizard();
		A[14] = new Chameleon();

		Caretaker[] c = new Caretaker[9];
		Random rand = new Random();
		long[] r = new long[5];

		for (int i = 0; i < 5; i++)
			r[i] = rand.nextLong();

		String result = null;

		c[0] = new Caretaker("Dave", r[0], 1000, false, 8.0);
		c[1] = new Caretaker("Nick", r[1], 1000, false, 8.0);
		c[2] = new Caretaker("Conor", r[2], 900, false, 7.0);
		c[3] = new Caretaker("Nate", r[3], 1100, false, 8.0);
		c[4] = new Caretaker("John", r[4], 500, false, 4.0);
		c[5] = new Caretaker("Jack", r[4], 500, false, 4.0);
		c[6] = new Caretaker("David", r[4], 500, false, 4.0);
		c[7] = new Caretaker("Logan", r[4], 500, false, 4.0);
		c[8] = new Caretaker("Ching Chang Yung", r[4], 500, false, 4.0);

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 15; j++) {
				if (c[i].getisDead() == false && A[j].getTakencareof() == false) {
					result = c[i].Takecareof(A[j]);

					if (result.equals(Constants.Employee.Caretaker.TCO_No_time)) {
						continue;
					} else if (result.equals(Constants.Employee.Caretaker.TCO_Killed)) {
						c[i].setisDead(Boolean.TRUE);
					} else
						A[j].setTakencareof(Boolean.TRUE);
					System.out.println("Animal " + A[j].getName() + " Takencare status: " + result + " Took care: "
							+ c[i].getname());
				}
			}

		}

		for (int i = 0; i < 9; i++) {
			System.out.println(" ");
			System.out.println("Employee nr:" + i);
			System.out.println("name:" + c[i].getname());
			System.out.println("id:" + c[i].getid());
			System.out.println("Salary:" + c[i].getSalary());
			System.out.println("Workhour:" + c[i].getworkinghours());
			System.out.println("IsDead:" + c[i].getisDead());
		}

		ArrayList<Animals> array = new ArrayList<Animals>();
		AnimalRepository p = new AnimalRepository();
		for (int i = 0; i < 15; i++) {
			array.add(A[i]);
		}
		p.save(array);
		
		ArrayList<Employee> array2 = new ArrayList<Employee>();
		EmployeeRepository e = new EmployeeRepository();

		for(int i = 0;i<9;i++){
          array2.add(c[i]);
		}
		e.save(array2);
	}

	
}
