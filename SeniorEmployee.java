public class SeniorEmployee extends Employee implements EmployeeCompensation{
	private double annualBonus_=0;
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
	//###################3
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
	 * 
	 */
	public String toString() {
		return (getID()+"\t"+getYearHired()+"\t\tSenior\t$"+getBaseSalary()+"\t\t$"+annualBonus_ +"\n"+ "This is a senior Employee.ID is " +getID()+", hired since "+ getYearHired()+" and annual bonus is $"+annualBonus_);
	}//end bracket of toString Method
	/**
	 * 
	 */
	public double CalcualteTotalCompensation() {
		return (getBaseSalary()+annualBonus_);
		
	}//end bracket of CalcualteTotalCompensation
	
	
	
}//end bracket of class