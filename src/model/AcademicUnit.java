package model;

public class AcademicUnit {
	private String name;
	private int code;
	private String principal;
	
	private AcademicUnit left;
	private AcademicUnit right;
	
	public AcademicUnit(String name, int code, String principal) {
		this.name = name;
		this.code = code;
		this.principal = principal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public AcademicUnit getLeft() {
		return left;
	}
	public void setLeft(AcademicUnit left) {
		this.left = left;
	}
	public AcademicUnit getRight() {
		return right;
	}
	public void setRight(AcademicUnit right) {
		this.right = right;
	}
		
}
