public abstract class Employee{
	protected int ID_=0;
	protected int yearHired_=0;
	protected double baseSalary_=0;
	protected double totalCompensation_=0;
	//Constructor
	/**
	 * @param ID
	 * @param yearHired
	 * @param baseSalary
	 * @param totalCompensation
	 */
	public Employee(int ID,int yearHired,double baseSalary,double totalCompensation){
		ID_=ID;
		yearHired_=yearHired;
		baseSalary_=baseSalary;
		totalCompensation_=totalCompensation;
		
	}//end bracket of constructor
	/**
	 * 
	 */
	public Employee() {
		ID_=0;
		yearHired_=0;
		baseSalary_=0;
		totalCompensation_=0;
		
	}
	
	//Setters and Getters
	//##########################################
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID_;
	}//end bracket of ID getter
	/**
	 * @param iD t
	 */
	public void setID(int ID) {
		ID_ = ID;
	}//end bracket of ID setter
	/**
	 * @return the yearHired
	 */
	public int getYearHired() {
		return yearHired_;
	}//end bracket of yearHired getter 
	/**
	 * @param yearHired 
	 */
	public void setYearHired(int yearHired) {
		yearHired_ = yearHired;
	}//end bracket of yearHired setter 
	/**
	 * @return the baseSalary
	 */
	public double getBaseSalary() {
		return baseSalary_;
	}//end bracket of baseSalary getter
	/**
	 * @param baseSalary 
	 */
	public void setBaseSalary(double baseSalary) {
		baseSalary_ = baseSalary;
	}//end bracket of baseSalary setter
	/**
	 * @return the totalCompensation
	 */
	public double getTotalCompensation() {
		return totalCompensation_;
	}//end bracket of totalCompensation getter
	/**
	 * @param totalCompensation 
	 */
	public void setTotalCompensation(double totalCompensation) {
		totalCompensation_ = totalCompensation;
	}//end bracket of totalCompensation setter
	//toString() method
	/**
	 * 
	 */
	public String toString() {
		return ID_+"\t"+yearHired_+"\t"+baseSalary_+"\t"+totalCompensation_;
	}//end bracket of to sTring Method
	
	
}//end bracket of class