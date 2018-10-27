import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Directory {

	ArrayList<Student> studentlist = new ArrayList<Student>();

	public void readTxt(String filename) {

		try
		{	
			File f=new File(filename);

			Scanner scan = new Scanner(f);
			scan.nextLine();
			scan.useDelimiter(",\\s*|\r\n");

			while (scan.hasNext()) {

				String name = scan.next();
				String surname = scan.next();
				String age = scan.next();
				double height = scan.nextDouble();
				String tuition = scan.next();
				String date = scan.next();
				String phone = scan.next();

				Student student = new Student(name, surname, age, height, tuition, date, phone);
				studentlist.add(student);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printDir() {
		for (Student st : studentlist) {
			System.out.println(st);
		}
	}

	public void sortSurname() {
		Collections.sort(studentlist, Comparator.comparing(Student::getSurname));
	}

	public void sortAge() {
		Collections.sort(studentlist, Comparator.comparing(Student::getAge));
	}

	public void sortPhone() {
		Collections.sort(studentlist, Comparator.comparing(Student::getPhone));
	}

	public void searchStudent() {
		System.out.println("Please enter the student you want to search.");
		Scanner scan = new Scanner(System.in);
		String userinput = scan.next();
		for (Student student : studentlist) {
			if (userinput == student.getSurname()); {
				System.out.println(student);
				System.out.println();
				break;
			}
		}
	}

	public void editStudent() {
		System.out.println("Please enter the student you want to search.");
		Scanner scan = new Scanner(System.in);
		String userinput = scan.next();
		for (Student student : studentlist) {
			if (userinput == student.getSurname()); {
				System.out.println(student);
				System.out.println();
				System.out.println("Press 1 to edit conduct or press 2 to edit phone number.");
				int user1 = scan.nextInt();
				if (user1 == 1) {
					System.out.println("Please enter revised conduct.");
					String newconduct = scan.next();
					student.setConduct(newconduct);
					System.out.println(student);
					break;
				}
				else if (user1 == 2) {
					System.out.println("Please enter new phone number.");
					String newphone = scan.next();
					student.setPhone(newphone);
					System.out.println(student);
					break;
				}
			}
			System.out.println("The student does not exist.");
		}
	}
}