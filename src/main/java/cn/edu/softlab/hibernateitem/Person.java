package cn.edu.softlab.hibernateitem;

public class Person { // POJO类
	
	private String id;
	
	private String name;
	private String password;
	private String sex;
	private String email;
	
	public Person(String id,String name,String password,String sex,String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void printlnItem() {
		System.out.println("gaoziqiang!");
	}

}