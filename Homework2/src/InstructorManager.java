
public class InstructorManager {
	public void login(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Ba�ar�l� bir �ekilde giri� yapt�.");
		
	}
	
	public void loginMultiple(Instructor[] instructors) {
		for(Instructor instructor : instructors) {
			login(instructor);
		}
	}
}
