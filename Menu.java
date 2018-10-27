import java.util.Scanner;

public class Menu {

	public void userMenu() {
		boolean flag;
		Directory dir = new Directory();
		dir.readTxt("C:\\Users\\thana\\eclipse-workspace\\Week4-Project\\bin\\week4\\Lab3_Names.txt");
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please press a number to make a selection.\n"
					+ "Press 1 to print student file.\n"
					+ "Press 2 to sort by Surname.\n"
					+ "Press 3 to sort by Age.\n"
					+ "Press 4 to sort by Phone number.\n"
					+ "Press 5 to search a student.\n"
					+ "Press 6 to search and edit a student in the student file.\n"
					+ "Press 7 to exit.");
			String userinput = scan.next();
			

			switch (userinput) {

			case "1":
				dir.printDir();
				break;

			case "2":
				dir.sortSurname();
				break;

			case "3":
				dir.sortAge();
				break;

			case "4":
				dir.sortPhone();
				break;

			case "5":
				dir.searchStudent();
				break;
				
			case "6":
				dir.editStudent();
				break;

			case "7":
				break;
			}
			System.out.println("Would you like to continue? Y/N");
			String cont = scan.next().toUpperCase();
			if (cont.equals("Y")) {
				flag = true;
			}
			else {
				System.out.println("Closing app.");
				break;
			}
		}
		while (flag);
	}
}