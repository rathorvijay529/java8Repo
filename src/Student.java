public class Student {
	private Integer id;
	private String name;
	private String lastName;
	private String departName;

	public Student() {
		super();
	}

	public Student(Integer id, String name, String lastName, String departName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.departName = departName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lastName="
				+ lastName + ", departName=" + departName + "]";
	}

}
