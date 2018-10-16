package studentInfoLab;

import java.util.Scanner;

public class LabNumber8 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String enter;
		String[] names = { "Aja", "Anthony", "James", "Charlotte", "Bryan", "Lindsay" };
		String[] food = { "Pasta", "Pizza", "Burgers", "Fries", "Mexican Food" };
		String[] hometown = { "Southfield", "Detroit", "Detroit", "Southfield", "Grand Rapids", "Redford" };

		do {
			System.out.println("Welcome to the student info portal!");
			for (int i = 0; i < names.length; i++) {
				System.out.println((i + 1) + ". " + names[i]);

			}

			int selection = Validator.getInt(key, "Pick a student to know more about them\n(enter a number corresponding to the student from 1-6): ", 1, names.length);

			

			if (selection == 1) {
				System.out.println("Student " + selection + " is " + names[selection - 1] + ". What would you like to know about "
						+ names[selection - 1] + "?\n(enter either 'Hometown' or 'Favorite Food'): ");
				enter = key.nextLine();
				while (!enter.equalsIgnoreCase("Hometown") && !enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println("Invalid entry. Please enter either 'Hometown' or 'Favorite Food'.");
					enter = key.nextLine();
				}
				if (enter.equalsIgnoreCase("Hometown")) {
					System.out.println(names[selection - 1] + "'s is from " + hometown[selection - 1] + ".");
				}
				if (enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println(names[selection - 1] + " favorite food is " + food[selection - 1] + ".");
				}

			} else if (selection == 2) {
				System.out.println("Student " + selection + " is " + names[selection - 1] + ". What would you like to know about "
						+ names[selection - 1] + "?\n(enter either 'Hometown' or 'Favorite Food'): ");
				enter = key.nextLine();
				while (!enter.equalsIgnoreCase("Hometown") && !enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println("Invalid entry. Please enter either 'Hometown' or 'Favorite Food'.");
					enter = key.nextLine();
				}
				if (enter.equalsIgnoreCase("Hometown")) {
					System.out.println(names[selection - 1] + "'s is from " + hometown[selection - 1] + ".");
				}
				if (enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println(names[selection - 1] + " favorite food is " + food[selection - 1] + ".");
				}

			} else if (selection == 3) {
				System.out.println("Student " + selection + " is " + names[selection - 1] + ". What would you like to know about "
						+ names[selection - 1] + "?\n(enter either 'Hometown' or 'Favorite Food'): ");
				enter = key.nextLine();
				while (!enter.equalsIgnoreCase("Hometown") && !enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println("Invalid entry. Please enter either 'Hometown' or 'Favorite Food'.");
					enter = key.nextLine();
				}
				if (enter.equalsIgnoreCase("Hometown")) {
					System.out.println(names[selection - 1] + "'s is from " + hometown[selection - 1] + ".");
				}
				if (enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println(names[selection - 1] + " favorite food is " + food[selection - 1] + ".");
				}

			} else if (selection == 4) {
				System.out.println("Student " + selection + " is " + names[selection - 1] + ". What would you like to know about "
						+ names[selection - 1] + "?\n(enter either 'Hometown' or 'Favorite Food'): ");
				enter = key.nextLine();
				while (!enter.equalsIgnoreCase("Hometown") && !enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println("Invalid entry. Please enter either 'Hometown' or 'Favorite Food'.");
					enter = key.nextLine();
				}
				if (enter.equalsIgnoreCase("Hometown")) {
					System.out.println(names[selection - 1] + "'s is from " + hometown[selection - 1] + ".");
				}
				if (enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println(names[selection - 1] + " favorite food is " + food[selection - 1] + ".");
				}

			} else if (selection == 5) {
				System.out.println("Student " + selection + " is " + names[selection - 1] + ". What would you like to know about "
						+ names[selection - 1] + "?\n(enter either 'Hometown' or 'Favorite Food'): ");
				enter = key.nextLine();
				while (!enter.equalsIgnoreCase("Hometown") && !enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println("Invalid entry. Please enter either 'Hometown' or 'Favorite Food'.");
					enter = key.nextLine();
				}
				if (enter.equalsIgnoreCase("Hometown")) {
					System.out.println(names[selection - 1] + "'s is from " + hometown[selection - 1] + ".");
				}
				if (enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println(names[selection - 1] + " favorite food is " + food[selection - 1] + ".");
				}

			} else if (selection == 6) {
				System.out.println("Student " + selection + " is " + names[selection - 1] + ". What would you like to know about "
						+ names[selection - 1] + "?\n(enter either 'Hometown' or 'Favorite Food'): ");
				enter = key.nextLine();
				while (!enter.equalsIgnoreCase("Hometown") && !enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println("Invalid entry. Please enter either 'Hometown' or 'Favorite Food'.");
					enter = key.nextLine();
				}
				if (enter.equalsIgnoreCase("Hometown")) {
					System.out.println(names[selection - 1] + "'s is from " + hometown[selection - 1] + ".");
				}
				if (enter.equalsIgnoreCase("Favorite Food")) {
					System.out.println(names[selection - 1] + " favorite food is " + food[selection - 1] + ".");
				}

			}
			System.out.println("Would you like to know more? (Type either 'yes' or 'no'");
			enter = key.nextLine();
			
			while (!enter.equalsIgnoreCase("Yes") && !enter.equalsIgnoreCase("No")) {
				System.out.println("Invalid input. Please enter either 'Yes' or 'No'.");
				enter = key.nextLine();
			}
			
			if (enter.equalsIgnoreCase("No")) {
				break;
			}
		} while (enter.equalsIgnoreCase("Yes"));

		System.out.println("Thanks for using the GC student info center. Goodbye!");
		
		key.close();
	}

}
