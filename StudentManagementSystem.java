interface StudentServices{
	void addStudent(Student s);
	void updateStudent(int id,String name,int age,String course);
	void deleteStudent(int id);
	Student getStudent(int id);
	void getAllStudents();
	
}

class Student{
	private int id;
	private String name;
	private int age;
	private String course;
	
	Student(int id,String name,int age,String course){
		this.id = id;
		this.name = name;
		this.age = age;
		this.course=course;
		}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
}

class ServiceImplement implements StudentServices{

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(int id, String name, int age, String course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getAllStudents() {
		// TODO Auto-generated method stub
		
	}	
}



public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
