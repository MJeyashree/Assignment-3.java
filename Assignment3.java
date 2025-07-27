										  /* Day-3 Assignment Questions:
1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.
3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.
5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
‌
6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/
	
/* 1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name 
as "John" by creating an object of the class Student.*/
	
class Student{
	String name;
	int roll_no;
    public static void main(String[] args){
		Student details = new Student();
		String name=details.name="John";
		System.out.println("Name of the Student : " + name);
		int age=details.roll_no=2;
        System.out.println("Roll Number of the Student : " + age);
    }
}
	
/*2.Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" 
and "John" respectively.*/

class StudentInfo{
	String name;
	int roll_no;
	int phone_no;
	String address;
	public StudentInfo(String name, int roll_no, int phone_no, String address){
		this.name=name;
	    this.roll_no=roll_no;
	    this.phone_no=phone_no;
	    this.address=address;
    }
    void display(){
		System.out.println("The Name of the Student : " + name);
	    System.out.println("The Roll Number of the Student : " + roll_no);
	    System.out.println("The Phone Number of the Student : " + phone_no);
	    System.out.println("The Address of the Student : " + address);
    }
}
class StudentMain{
	public static void main(String[] args){
		StudentInfo stud1=new StudentInfo("Sam",533123,93608,"T.Nagar");
		StudentInfo stud2=new StudentInfo("John",533111,90684,"Anna.Nagar");
		stud1.display();
	    stud2.display();
	}
	
}
		
/*3.Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, 
designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the 
   fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees. */

class EmployeeSalary{
	private String employeeName;
	private int employeeID;
	private String designation;
	private double salary;
	public EmployeeSalary(){
		System.out.println("No-Argument Constructor Object has been Created");
		this.employeeName="Unknown";
		this.employeeID=0;
		this.designation="Un-Emploied";
		this.salary=0.0;
    }
	public EmployeeSalary(String employeeName,int employeeID,String designation,double salary){
		this.employeeName=employeeName;
		this.employeeID=employeeID;
		this.designation=designation;
		this.salary=salary;
	}
	public EmployeeSalary(EmployeeSalary emp){
		this.employeeName=emp.employeeName;
		this.employeeID=emp.employeeID;
		this.designation=emp.designation;
		this.salary=emp.salary;
    }
	void display(){
		System.out.println("\tEmployee Name : " + employeeName);
		System.out.println("\tEmployee ID : " + employeeID);
		System.out.println("\tEmployee Designation : " + designation);
        System.out.println("\tEmployee's Salary : " + salary);
	}
}
class MainEmp{
	public static void main(String[] args){
		EmployeeSalary emp1=new EmployeeSalary();
        EmployeeSalary emp2=new EmployeeSalary("Jeya",123111,"Full-Stack Developer",45823);
        EmployeeSalary emp3=new EmployeeSalary(emp2);
		System.out.println("\t\t *****************");
		System.out.println("\t\t Employee1 Details");
		System.out.println("\t\t *****************");
		emp1.display();
		System.out.println("\t\t *****************");
		System.out.println("\t\t Employee2 Details");
		System.out.println("\t\t *****************");
		emp2.display();
		System.out.println("\t\t *****************");
		System.out.println("\t\t Employee3 Details");
		System.out.println("\t\t *****************");
		emp3.display();
    }
}	
	

/*4.Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can 
internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.*/	
	
class Vehicle{
	private int vehicleID;
	private String brandName;
	private double price;
	private static int vehicleCount;
	public Vehicle(int vehicleID,String brandName,double price){
		this.vehicleID=vehicleID;
		this.brandName=brandName;
		this.price=price;
		vehicleCount++;
	}
	public void displayDetails(){
		System.out.println("Vehicle ID : " + vehicleID);
		System.out.println("Brand Name : " + brandName);
	    System.out.println("Price : " + price);
	}
	public static int getVehicleCount(){
		return vehicleCount;
	}
}
class VehicleMain{
	public static void main(String[] args){
		Vehicle v1=new Vehicle(2304,"Activa",98900);
		Vehicle v2=new Vehicle(2710,"Pulzar",150000);
		Vehicle v3=new Vehicle(1123,"TVS",90000);
		System.out.println("\n\t The No.of Vehicle Count's are : " + Vehicle.getVehicleCount());
		System.out.println("\t *********************************");
		v1.displayDetails();
		System.out.println("\t *********************************");
		v2.displayDetails();
		System.out.println("\t *********************************");
		v3.displayDetails();
	}
}

/*5.Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object 
containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated.
 
class Store{
	static String storeName:
	static String storeLocation;
	private Product[] things=new Product[100];
	private int productCount=0;
	public static void setStoreDetails(String name,String location){
        storeName=name;
        storeLocation=location;
    }
    public static void displayStoreDetails(){
		System.out.println("Store Name : " + storeName);
		System.out.println("Store Location : " + storeLocation);
	}
	public void addProduct(Product product){
		if(productCount < things.length){
			things[productCount++]=product;
	    }else{
			System.out.println(Can't Add More Products");
		}
	}
*/

/* 6.Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 
'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/
		
class LaboursDetail{
    String name;
	int yearOfJoining;
	//double salary;
	String address;
	public LaboursDetail(String name,int yearOfJoining,/*double salary*/String address){
		this.name=name;
		this.yearOfJoining=yearOfJoining;
		//this.salary=salary;
		this.address=address;
	}
}
class LaboursMain{
	public static void main(String[] args){
		LaboursDetail Labour1 = new LaboursDetail("Robert",1994,"64C- WallsStreat");
		LaboursDetail Labour2 =new LaboursDetail("Sam",2000,"68D- WallsStreat");
		LaboursDetail Labour3 =new LaboursDetail("Robert",1999,"26B- WallsStreat");
	    System.out.printf("%-10s %-15s %-20s\n","name","YearofJoining","Address");
	    System.out.printf("%-10s %-15s %-20s\n",Labour1.name,Labour1.yearOfJoining,Labour1.address);
		System.out.printf("%-10s %-15s %-20s\n",Labour2.name,Labour2.yearOfJoining,Labour2.address);
		System.out.printf("%-10s %-15s %-20s\n",Labour3.name,Labour3.yearOfJoining,Labour3.address);
	}
}
	


		