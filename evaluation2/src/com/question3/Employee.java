package com.question3;

public class Employee {
	
	    private Integer empId;
	    private String empName;
	    private Integer salary;
	    private String address;


	    public Employee(Integer empId, String empName, Integer salary,String address) {
	        this.empId = empId;
	        this.empName = empName;
	        this.salary = salary;
	        this.address=address;
	    }

	    public Integer getEmpId() {
	        return empId;
	    }

	    public void setEmpId(Integer empId) {
	        this.empId = empId;
	    }

	    public String getaddress() {
	        return address;
	    }

	    public void setaddress(String address) {
	        this.address = address;
	    }

	    public Integer getSalary() {
	        return salary;
	    }

	    public void setSalary(Integer salary) {
	        this.salary = salary;
	    }
	    public String getEmpAddress() {
	        return empName;
	    }

	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
					+ "]";
		}

	   
	}