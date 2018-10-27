public class Student {
	
	private String name;
	private String surname;
	private String age;
	private String height;
	private String tuition;
	private String date;
	private String phone;
	private String conduct;
	
	public Student() {}
	
	public Student(String name, String surname, String age, String height, 
			String tuition, String date, String phone) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.height = height;
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

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
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
	
	public boolean equals(Object other) {
		if (other == this) return true;
		if (other == null) return false;
		if (getClass() != other.getClass()) return false;
		Student student = (Student) other;
		return (
			name == student.name ||
			(name != null && name.equals(student.name))) &&
			(surname == student.surname ||
			(surname != null && surname.equals(student.surname))) && 
			(age == student.age ||
			(age != null && age.equals(student.age))) &&
			(height == student.height || 
			(height != null && height.equals(student.height))) &&
			(tuition == student.tuition ||
			(tuition != null && tuition.equals(student.tuition))) &&
			(date == student.date ||
			(date != null && date.equals(student.date))) &&
			(phone == student.phone ||
			(phone != null && phone.equals(student.phone))) &&
			(conduct == student.conduct ||
			(conduct != null && conduct.equals(student.conduct)));
	}

	@Override
	public String toString() {
		return "Student [name = " + name + ", surname = " + surname + ", age = " + age + ", height = " + height + ", tuition = "
				+ tuition + ", date = " + date + ", phone = " + phone + ", conduct = " + conduct + "]";
	}
}
