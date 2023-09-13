package creazionali.builder;

public class BuilderExample {
	
	public void builderUse() {
		Employee.Builder builder = new Employee.Builder();
		
		Employee employee = builder
				.name("Enrico")
				.age("26")
				.department("Professional Services")
				.build();
		
		System.out.println(employee.toString());
	}

}
