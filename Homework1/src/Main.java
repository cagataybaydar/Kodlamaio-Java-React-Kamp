
public class Main {

	public static void main(String[] args) {
		Education education1 = new Education(1,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA+REACT)","Engin Demiro�");
		
		Education[] educations = {education1};
		
		for(Education education : educations) 
		{
			System.out.println(education.name);
		}

		EducationManager educationManager = new EducationManager();
		educationManager.searchButton(education1);
		educationManager.searchEducator(education1);
		
		
		
		

	}

}
