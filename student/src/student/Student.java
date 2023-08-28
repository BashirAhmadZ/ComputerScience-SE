package student;

public class Student {
	private int id;
	private String name, fName, course, dept, gender;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public Student() {
		
	}

	public Student(int id, String name, String fName, 
			String course, String dept, String gender) {
		
		this.id = id;
		this.name = name;
		this.fName = fName;
		this.course = course;
		this.dept = dept;
		this.gender = gender;
	}
	
	public void activity(int id) {
		if(id< 50) 
			System.out.println("You got top marks in Kankor Examination!");
		else {
			System.out.println("You are a best Student!");
		}
	}
	
	public String result(int id, int mark) {
		String reslt;
		
		if (mark>54) {
			System.out.println("Your are Passed the exam successfuly!");
			reslt = "success";
		}else { 
			System.out.println("Sorry!, You are Faild");
			reslt = "faild";
		}
		return reslt;
	}
	
	public void information(Student s) {
		System.out.println("Sudent Id = "+s.getId());
		System.out.println("Student Name = "+s.getName());
		System.out.println("Student Father Name = "+s.getfName());
		System.out.println("Sudent Course = "+s.getCourse());
		System.out.println("Sudent department = "+s.getDept());
		System.out.println("Sudent Gender = "+s.getGender());
	}
}
