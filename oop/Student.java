
public class Student {
	//Attributes
	private String firstName;
	private String lastName;
	private String major;
	private int empID;
	private double gpa;
	
	public Student(String fn,String ln, String major, int empID, double gpa)
	{
		this.firstName = fn;
		this.lastName  = ln;
		this.major     = major;
		this.empID     = empID;
		this.gpa	   = gpa;
		System.out.println("Student has been created");
	}
	public int getEmpID() {
		return empID;
	}
	public String getFullName() {
		return firstName + " " +lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student: full name: "+getFullName()
		     +", major:"+this.major +", gpa: "+this.gpa
		     +", employee Id :"+getEmpID();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof Student) {
			Student other=(Student)obj;
			if (this.getFullName().equals(other.getFullName())) 
			{
				if(this.major.equals(other.major)) 
				{
					if(this.getEmpID()== other.getEmpID()) 
					{
						if (this.gpa -other.gpa< 0.000001 )//comparing doubles 
						{
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
