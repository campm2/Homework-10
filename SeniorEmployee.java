public class SeniorEmployee extends Employee implements EmployeeCompensation{
	private double annualBonus_=0;
	private double compensation_=0;
	//Constructor
	//################
	/**
	 * @param annualBonus
	 */
	public SeniorEmployee(int ID, int yearHired, double baseSalary,double annualBonus) {
		setID(ID);
		setYearHired(yearHired);
		setBaseSalary(baseSalary);
		annualBonus_=annualBonus;
	}
	/**
	 * 
	 */
	public SeniorEmployee() {
		annualBonus_=0;
	}//end bracket of constructor
	//Setter and Getter
	//###################
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
	 * @return the annualBonus_
	 */
	public double getAnnualBonus() {
		return annualBonus_;
	}//end bracket of annualBonus getter
	/**
	 * @param annualBonus_ the annualBonus_ to set
	 */
	public void setAnnualBonus(double annualBonus) {
		annualBonus_ = annualBonus;
	}//end bracket of annualBonus setter
	
	//toString method
	/**
	 * @return string
	 */
	public String toString() {
		return String.format ("This is a senior Employee.ID is %d, hired since %d, and annual bonus is $%,.0f",getID(),getYearHired(),annualBonus_);
	}//end bracket of toString Method
	/**
	 * @return String
	 */
	public String EmployeeInfo() {
		return String.format("%d\t%d\t\tSenior\t$%,.0f\t\t$%,.0f\n",getID(),getYearHired(),getBaseSalary(),CalculateTotalCompensation());
	}
	/**
	 * @return compensation_
	 */
	public double CalculateTotalCompensation() {
		
		compensation_=(getBaseSalary()+getAnnualBonus());
		return compensation_;
		
	}//end bracket of CalcualteTotalCompensation
	
	
	
}//end bracket of class