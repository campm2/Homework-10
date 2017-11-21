/* ========================================================================== */
/* PROGRAM: File Analysis
    AUTHOR: Megan Camp
    COURSE NUMBER: CIS 210
    COURSE SECTION NUMBER: 02
    INSTRUCTOR NAME: Dr.Tian
    PROJECT NUMBER: 10
    DUE DATE: 11/30/2017
SUMMARY
-Design an abstract Employee class that has the following members: 
o A field for the ID of the employee (an integer) 
o A field for the year that the employee was hired (an integer) 
o A field for the base salary of the employee (double)
o A field for the total compensation of the employee (double) 
o A constructor and appropriate getters and setters 
o A toString() method that displays the employee’s name, the year in which the employee was hired, his or her base salary, and total compensation.  

- Design a JuniorEmployee class that extends the Employee class. The JuniorEmployee class should have the following members: o A field for commission (double).   
o A constructor and appropriate setters and getters.
 o A toString() method that overrides the toString() method in the base class. 
 The JuniorEmployee class’s toString() method should display only the employee’s ID, the year he or she was hired, and the commission.  
 
 -Design a SeniorEmployee class that extends the Employee class. The SeniorEmployee class should have the following members: 
 o A field for the annual bonus (double). 
 o A constructor and appropriate setters and getters. 
o A toString() method that overrides the toString() method in the base class. 
The SeniorEmployee class’s toString() method should display only the employee’s ID, the year he or she was hired, and the employee’s annual bonus.  

-Design a Manager class that extends the Employee class. The Manager class should have the following members: 
o A field for stock dividend (double) 
o A constructor and appropriate setters and getters 
o A ShowDividend() method that displays the amount of dividend. 
o A toString() method that overrides the toString() method in the base class. 
The Manager class’s toString() method should display only the employee’s ID, the year he or she was hired, and the employee’s dividend.
  
-Design an Interface named EmployeeCompensation.
 It has one methods: CalculateTotalCompensation() which returns the total compensation. 
 JuniorEmployee, SeniorEmployee, and Manager classes MUST implement this Interface. 
  o JuniorEmployee’s total compensation is baseSalary + commission
  o SeniorEmployee’s total compensation is baseSalary + annualBonus  
  o Manager’s total compensation is baseSalary + dividend       
    Demonstrate/test the classes in a program that has one Employee array. 
    The program reads various employees’ data from an existing file named “Employees.txt” and create appropriate (JuniorEmployee/SeniorEmployee/Manager) objects based the type information of an employee. 
    For example, if an employee’s type is Junior, the program should create a JuniorEmployee object.
     Then, insert various JuniorEmployee, SeniorEmployee, and Manager objects to the array elements.  
     1. The program uses selection sort algorithm to sort the array based on an Employee’s ID in ascending order. 
     2. The program steps through the array, calling each object’s toString() method. 
     3. The program steps through the array, calling the ShowDividend() method from every Manager object.
      Your program MUST be able to distinguish every Manager object from all of those Employee object in the array. 


INPUT
The input is from an existing file named “Employees.txt”.
 Note, if the file does not exist, your program MUST display an error message and terminate gracefully.  


OUTPUT
Your program should display the following on the console and to a file named employeeOutput.txt: 
 Each employee’s ID, title (Senior, Junior, Manager), yearHired, and total compensation (base salary + commission/annual bonus/dividend), along with the content of its toString() method. 
 They should be displayed in ascending order. 
 -For every manager, display his or her dividend using ShowDividend() method.   
 Sample output:   ID     YEAR_HIRED      TITLE      BASE_SALARY   COMPENSATION    
 11         1999                    Senior           $50,000        $60,000 
 This is a senior employee. ID is 11, hired since 1999, and annual bonus is $10,000.  
 12         2000                    Junior           $50,000         $55,000
 This is a junior employee. ID is 12, hired since 2000, and commission is $5,000.  
 13         1980                    Manager       $80,000            $100,000 
 This is a manager. ID is 13, hired since 1980, and stock dividend is $20,000.  
 14         2012                    Junior           $50,000          $51,000 
 This is a junior employee. ID is 14, hired since 2012, and commission is $1,000.    
 Employee 13 is a manager. Dividend is $20,000!  Good bye!  

ASSUMPTIONS

/* MAIN FUNCTION */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class MainProgram{
	public static void main(String[] args) throws IOException{
		Scanner keyboard= new Scanner(System.in);
		// to get the name of the file
		System.out.print("Enter the name of the input file: ");
		String inputFileName=keyboard.nextLine();
		File file=new File(inputFileName);
		if(file.exists()) {
			PrintWriter output=new PrintWriter("employeeOutput.txt");
			ArrayList<Employee> employeeArray=new ArrayList<Employee>();
			ArrayList<Employee> employeeArraySorted=new ArrayList<Employee>();
			employeeArray=ReadInputData(inputFileName);
			employeeArraySorted=SelectionSort(employeeArray);
			
			//Go through the array and call toStringMethods
			System.out.println("ID\tYEAR_HIRED\tTITLE\tBASE_SALARY\tCOMPENSATION");
			output.println("ID\tYEAR_HIRED\tTITLE\tBASE_SALARY\tCOMPENSATION");
			for(int i=0;i<employeeArraySorted.size();i++) {
				
				if(employeeArraySorted.get(i) instanceof  JuniorEmployee) {
					String juniorInfo=employeeArraySorted.get(i).EmployeeInfo();
					System.out.println(juniorInfo);
					output.println(juniorInfo);
					String junior=employeeArraySorted.get(i).toString();
					System.out.println(junior);
					output.println(junior);
					
				}//end bracket of if
				else if(employeeArraySorted.get(i) instanceof SeniorEmployee) {
					String seniorInfo=employeeArraySorted.get(i).EmployeeInfo();
					System.out.println(seniorInfo);
					output.println(seniorInfo);
					String senior=employeeArraySorted.get(i).toString();
					System.out.println(senior);
					output.println(senior);
				}//end bracket of else if
				else if(employeeArraySorted.get(i) instanceof Manager) {
					String managerInfo=employeeArraySorted.get(i).EmployeeInfo();
					System.out.println(managerInfo);
					output.println(managerInfo);
					String manager=employeeArraySorted.get(i).toString();
					System.out.println(manager);
					output.println(manager);
				}//end bracket of second else if
				
			}//end bracket for the for loop
			System.out.println("----------------------------------------------------------------------------------");
			output.println("----------------------------------------------------------------------------------");
			PrintManagerDividend(employeeArraySorted,output);
			System.out.print("Goodbye!");
			output.print("Goodbye!");
			output.close();
			
		}//end bracket of the if
		else {
			System.out.println("Error: File does not exist");
			
		}//end of outside else
		keyboard.close();
		
		
	}//end bracket of the main
	/**
	 * @param employeeArray
	 */
	public static void PrintManagerDividend(ArrayList<Employee> employeeArray, PrintWriter pw) {
		//Go through the array and call ShowDividend Method from every manager object
		for(int j=0;j<employeeArray.size();j++) {
			if(employeeArray.get(j) instanceof Manager) {
				System.out.print("Employee "+ employeeArray.get(j).getID()+" is a manager. ");
				pw.print("Employee "+ employeeArray.get(j).getID()+" is a manager. ");
				((Manager) employeeArray.get(j)).ShowDividend(pw);
				
			}
			
		}//end bracket of second for loop
		
		
	}//end bracket of PrintManagerDividend()
	/**
	 * @param filename
	 * @return ArrayList
	 * @throws IOException
	 */
	public static ArrayList<Employee> ReadInputData(String filename) throws IOException{
		ArrayList<Employee> ArrayList=new ArrayList<Employee>();
		
		int ID=0;
		int yearHired=0;
		double baseSalary=0;
		double compensation=0;
		String title=" ";
		String fileInput ="";
		
		File file=new File(filename);
		Scanner inputFile=new Scanner(file);
		inputFile.nextLine();
		while(inputFile.hasNextLine()) {
			if((inputFile!=null)) {
				fileInput=inputFile.nextLine();
				//fileInput.trim();
				if((fileInput!=null) && fileInput.length()>0) {
					//Split the file 
					String [] splitFile=fileInput.split(",");
					
					ID=(Integer.parseInt(splitFile[0].trim()));
					yearHired=(Integer.parseInt(splitFile[1].trim()));
					title=splitFile[2].trim();
					baseSalary=(Double.parseDouble(splitFile[3].trim()));
					compensation=(Double.parseDouble(splitFile[4].trim()));
					//Add contents of the file to respective objects
					if(title.equals("Junior")) {
						ArrayList.add(new JuniorEmployee(ID,yearHired,baseSalary,compensation));
					}//end bracket of else if 
					else if(title.equals("Senior")) {
						ArrayList.add(new SeniorEmployee(ID,yearHired,baseSalary,compensation));
					}//end bracket of else if
					else if(title.equals("Manager")) {
						ArrayList.add(new Manager(ID,yearHired,baseSalary,compensation));
					}//end bracket of else if
					
				}//end bracket of if
				
			}//end bracket of outside if	
		}//end of while loop
		inputFile.close();
		return ArrayList;
	}//end bracket  of method
	public static ArrayList<Employee> SelectionSort(ArrayList<Employee> employeeArray) {
		int minIndex,minValue;
		for(int startScan=0;startScan<employeeArray.size()-1;startScan++) {
			minIndex=startScan;
			minValue=employeeArray.get(startScan).getID();
			for(int index=startScan+1;index<employeeArray.size();index++) {
				if(employeeArray.get(index).getID()<minValue) {
					minValue=employeeArray.get(index).getID();
					minIndex=index;
				}//end bracket of if

			}//end bracket of inside for loop
			Employee temp=employeeArray.get(minIndex);
			employeeArray.set(minIndex, employeeArray.get(startScan));
			employeeArray.set(startScan,temp);
			//employeeArray.set(startScan, employeeArray.get(minValue));
			//temp=employeeArray.get(minIndex).getID();
			//temp=employeeArray.get(startScan).getID();
			//minValue=employeeArray.get(startScan).getID();
			
		}//end bracket of outside for loop
		return employeeArray;
		
	}//end bracket of selection sort
	
}//end bracket of main class