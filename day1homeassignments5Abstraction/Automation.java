package week3.day1homeassignments5Abstraction;

public class Automation extends MultipeLanguage implements TestTool {


	public void Java() {
		System.out.println("Java is a good language");
	}

	public void Selenium() {
		System.out.println("Selenium is a tool");
		
	}
	
	

	@Override
	public void ruby() {
		System.out.println("Ruby is a coding Language");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation auto=new Automation();
				
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();
	}
	}


