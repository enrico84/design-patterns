package creazionali.builder;

public class Employee {
	
	private final String name;
	private final String age;
	private final String department;
	
	private Employee(String name, String age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	
	// Classe Builder statica interna
	public static class Builder {
		
		private String name;
		private String age;
		private String department;
		
	    public Builder name(String name) {
	    	this.name = name;
	    	return this;
	    }
	    
	    public Builder age(String age) {
	    	this.age = age;
	    	return this;
	    }
	    
	    public Builder department(String department) {
	    	this.department = department;
	    	return this;
	    }
	    
	    public Employee build() {
	    	return new Employee(name, age, department);
	    }
	}
}
