public class Manager extends Employee implements EmployeeCompensation{
	private double stockDividend_=0;
	
	//Constructor
	//#####################
	/**
	 * @param stockDividend
	 */
	public Manager(int ID, int yearHired, double baseSalary,double stockDividend) {
		setID(ID);
		setYearHired(yearHired);
		setBaseSalary(baseSalary);
		stockDividend_=stockDividend;
	}
	/**
	 * 
	 */
	public Manager() {
		stockDividend_=0;
	}//end bracket of constructor
	
	//Setter and Getter
	//#######################
	/**
	 * @return the stockDividend_
	 */
	public double getStockDividend() {
		return stockDividend_;
	}//end bracket of stockDividend getter

	/**
	 * @param stockDividend_ the stockDividend_ to set
	 */
	public void setStockDividend(double stockDividend) {
		
		stockDividend_ = stockDividend;
	}//end bracket of stockDividend setter
	/**
	 * 
	 */
	public void ShowDividend() {
		System.out.print("Dividend is "+ stockDividend_);
	}
	/**
	 * return string 
	 */
	public String toString() {
		return (getID()+"\t"+getYearHired()+"\t"+ stockDividend_+ "\nThis is a manager.ID is " +getID()+",hired since "+ getYearHired()+" and annual bonus is $"+stockDividend_);
	}
	/**
	 * return total compensation
	 */
	public double CalcualteTotalCompensation() {
		return(getBaseSalary()+stockDividend_);
		
	}
	
	
	
	
}//end bracket of class