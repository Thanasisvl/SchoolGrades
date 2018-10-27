public class Student {
	
	private String name;
	private String surname;
	private String age;
	private double height;
	private String tuition;
	private String date;
	private String phone;
	private String conduct;
	
	public Student() {}
	
	public Student(String name, String surname, String age, double height, 
			String tuition, String date, String phone) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.tuition = tuition;
		this.date = date;
		this.phone = phone;
		this.conduct = "Good";
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getTuition() {
		return tuition;
	}

	public void setTuition(String tuition) {
		this.tuition = tuition;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getConduct() {
		return conduct;
	}

	public void setConduct(String conduct) {
		this.conduct = conduct;
	}

	@Override
	public String toString() {
		return "Student [name = " + name + ", surname = " + surname + ", age = " + age + ", height = " + height + ", tuition = "
				+ tuition + ", date = " + date + ", phone = " + phone + ", conduct = " + conduct + "]";
	}
}
