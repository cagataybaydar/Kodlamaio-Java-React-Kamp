
public class StudentManager {
	public void register(Student student) {
		System.out.println("��renci kay�t olmu�tur : " + student.getEmail());
	}
	
	
	public void registerMultiple(Student[] students) {
		for(Student student : students) {
			register(student);
		}
	}
}
