public class JuniorEmployee extends Employee implements EmployeeCompensation {
	private double commission_=0;
	
	// constructor
	/**
	 
	 * @param commission
	 */
	public JuniorEmployee(int ID,int yearHired,double baseSalary,double commission) {
		setID(ID);
		setYearHired(yearHired);
		setBaseSalary(baseSalary);
		commission_=commission;
	}
	/**
	 * 
	 */
	public JuniorEmployee(){
		
		commission_=0;
	}//end bracket of constructor
	//Setter and Getter
	//############################
	/**
	 * @return the commission_
	 */
	public double getCommission() {
		return commission_;
	}//end bracket of commission getter

	/**
	 * @param commission_ 
	 */
	public void setCommission(double commission) {
		commission_ = commission;
	}//end bracket of commission setter
	
	//to String Method
	//###############################
	/**
	 * 
	 */
	public String toString() {
		return (getID()+"\t"+getYearHired()+"\t"+ commission_ +"\n"+ "This is a junior Employee.ID is " +getID()+",hired since "+ getYearHired()+" and annual bonus is $"+commission_);
				
		
	}//end bracket of toString 
	/**
	 * 
	 */
	public double CalcualteTotalCompensation() {
		return(getBaseSalary()+commission_);
		
	}
	
	
}