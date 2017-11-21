import java.io.IOException;
import java.io.PrintWriter;
public class Manager extends Employee implements EmployeeCompensation{
	private double stockDividend_=0;
	private double compensation_=0;
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
	
	//Setter and Getters
	//#######################
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
	public void ShowDividend(PrintWriter pw) {
		System.out.printf("Dividend is $%,.0f!\n",getStockDividend());
		pw.printf("Dividend is $%,.0f!\n",getStockDividend());
		
	}
	/**
	 * return string 
	 */
	public String toString() {
		return String.format ("This is a manager.ID is %d, hired since %d, and stock dividend is $%,.0f",getID(),getYearHired(),stockDividend_);
	}//end bracket of toString Method
	/**
	 * 
	 * @return string
	 */
	public String EmployeeInfo() {
		return String.format("%d\t%d\t\tManager\t$%,.0f\t\t$%,.0f\n",getID(),getYearHired(),getBaseSalary(),CalculateTotalCompensation());
	}
	/**
	 * return total compensation
	 */
	public double CalculateTotalCompensation() {
		compensation_=(getBaseSalary()+stockDividend_);
		return compensation_;
		
	}
	
	
	
	
}//end bracket of class