package cn.edu.sdut.softlab.model;

public class Wupin { // POJO类
	private String id;
	private String name;
	
	public Wupin(String id,String name) {
		this.id = id;
		this.name = name;
		
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

	

}