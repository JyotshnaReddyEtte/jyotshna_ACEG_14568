import java.util.Date;

/**
 * Class that stores information about the concrete student
 * 
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {

	/**
	 * student id
		
	 */
	private int id;
	student[1]= new student();
	student[1].id= 14AG1A0568;
	
	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;
	student[1]= new name;
	student[1].fullName= "David Luis";
	
	

	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;
	student[1].Date= "1996-10-20";

	/**
	 * student average mark
	 */{
	private double avgMark;
	int n=3, avgMark=0;
	int a[]= new int[n];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	for(int i=0;i<n;i++)
	avgMark=avgMarkk+a[i];
	System.out.println(" average of("+a[o]+", "+ a[1]+" , "+a[2]+" is=" +avgMark/n);

	}
	

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
