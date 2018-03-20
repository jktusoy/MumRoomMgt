package co.mum.roommgt.model;

/**
 * Student Class
 * Updated: 01/19/2018
 * 
 * @version 1.0 18 March 2018
 * @author Joseph Kelly Tusoy
 */
public class StudentVM {
	
	
	@Col(name = "name")
	public String name;
	
	@Col(name = "lastname")
	public String lastName;
	
	@Col(name = "email")
	public String email;
	
	@Col(name = "phone")
	public String phone;
	
	@Col(name = "sex")
	public String sex;
	
	@Col(name = "nationality")
	public String nationality;
	
	@Col(name = "roleTypeId")
	public String roleTypeId;
	
	@Col(name = "accountId")
	public String accountId;
	
	public StudentVM()
	{
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getRoleTypeId() {
		return roleTypeId;
	}
	public void setRoleTypeId(int roleTypeId) {
		this.roleTypeId = Integer.toString(roleTypeId);
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = Integer.toString(accountId);
	}

 
	
}
