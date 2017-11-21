public class JuniorEmployee extends Employee implements EmployeeCompensation {
	private double commission_=0;
	private double compensation_=0;
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
	 * @return compensation_
	 */
	public double getCompensation() {
		return compensation_;
	}//end bracket of compensation getter
	/**
	 * @param compensation
	 */
	public void setCompensation(double compensation) {
		compensation_=compensation;
	}//end bracket of compensation setter
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
	/**
	 * 
	 */
	public double CalculateTotalCompensation() {
		compensation_=(getBaseSalary()+getCommission());
		return compensation_;
		
	}
	
	//to String Method
	//###############################
	/**
	 * 
	 */
	public String toString() {
		return (getID()+"\t"+getYearHired()+"\t\tJunior\t$"+getBaseSalary()+"\t\t$"+CalculateTotalCompensation()+"\n"+ "This is a junior Employee.ID is " +getID()+", hired since "+ getYearHired()+", and annual bonus is $"+commission_);
				
		
	}//end bracket of toString 
	
	
	
}