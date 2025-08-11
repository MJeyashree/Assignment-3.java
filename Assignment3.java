										  /* Day-3 Assignment Questions:
	
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



/* 5..Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 
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
	

/* 6.6.Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class.
Your class should store character data internally (e.g., using a char[] or String as input) and should provide the
following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class. */
		
class MyString {
    private char[] data;

    // Constructor from String
    public MyString(String input) {
        data = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            data[i] = input.charAt(i);
        }
    }

    // Constructor from char array
    public MyString(char[] input) {
        data = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            data[i] = input[i];
        }
    }

    // 1. length()
    public int length() {
        return data.length;
    }

    // 2. charAt()
    public char charAt(int index) {
        if (index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    // 3. equals()
    public boolean equals(MyString other) {
        if (this.length() != other.length()) return false;
        for (int i = 0; i < data.length; i++) {
            if (this.data[i] != other.data[i]) return false;
        }
        return true;
    }

    // 4. toUpperCase()
    public MyString toUpperCase() {
        char[] upper = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 'a' && data[i] <= 'z') {
                upper[i] = (char) (data[i] - 32);
            } else {
                upper[i] = data[i];
            }
        }
        return new MyString(upper);
    }

    // 5. toLowerCase()
    public MyString toLowerCase() {
        char[] lower = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 'A' && data[i] <= 'Z') {
                lower[i] = (char) (data[i] + 32);
            } else {
                lower[i] = data[i];
            }
        }
        return new MyString(lower);
    }

    // 6. substring()
    public MyString substring(int start, int end) {
        if (start < 0 || end > data.length || start > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        char[] sub = new char[end - start];
        for (int i = 0; i < sub.length; i++) {
            sub[i] = data[start + i];
        }
        return new MyString(sub);
    }

    // 7. concat()
    public MyString concat(MyString other) {
        char[] combined = new char[this.length() + other.length()];
        for (int i = 0; i < this.length(); i++) {
            combined[i] = this.data[i];
        }
        for (int i = 0; i < other.length(); i++) {
            combined[this.length() + i] = other.data[i];
        }
        return new MyString(combined);
    }

    // 8. contains()
    public boolean contains(MyString sub) {
        for (int i = 0; i <= this.length() - sub.length(); i++) {
            boolean found = true;
            for (int j = 0; j < sub.length(); j++) {
                if (this.data[i + j] != sub.data[j]) {
                    found = false;
                    break;
                }
            }
            if (found) return true;
        }
        return false;
    }

    // 9. indexOf()
    public int indexOf(char ch) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == ch) return i;
        }
        return -1;
    }

    // 10. replace()
    public MyString replace(char oldChar, char newChar) {
        char[] replaced = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            replaced[i] = (data[i] == oldChar) ? newChar : data[i];
        }
        return new MyString(replaced);
    }

    // Convert to normal String for printing
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char c : data) {
            sb.append(c);
        }
        return sb.toString();
    }
}

class StrWithOutInBuilt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        MyString str = new MyString(sc.nextLine());

            System.out.println("\nChoose the options of the list :");
            System.out.println("1 int length()");
            System.out.println("2 specified index()");
            System.out.println("3 obj are equal");
            System.out.println("4 Uppercase()");
            System.out.println("5 lowercase()");
            System.out.println("6 Substring()");
            System.out.println("7 Concat()");
            System.out.println("8 Boolean contains()");
            System.out.println("9 Index of first()");
            System.out.println("10 Replace all occurrences()");
            System.out.println("0 Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Length: " + str.length());
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Character at index " + idx + ": " + str.charAt(idx));
                    break;
                case 3:
                    System.out.print("Enter another string: ");
                    MyString other = new MyString(sc.nextLine());
                    System.out.println("Equal? " + str.equals(other));
                    break;
                case 4:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;
                case 5:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;
                case 6:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Substring: " + str.substring(start, end));
                    break;
                case 7:
                    System.out.print("Enter another string: ");
                    MyString concatStr = new MyString(sc.nextLine());
                    System.out.println("Concatenated: " + str.concat(concatStr));
                    break;
                case 8:
                    System.out.print("Enter substring: ");
                    MyString sub = new MyString(sc.nextLine());
                    System.out.println("Contains? " + str.contains(sub));
                    break;
                case 9:
                    System.out.print("Enter character: ");
                    char ch = sc.nextLine().charAt(0);
                    System.out.println("Index of first occurrence: " + str.indexOf(ch));
                    break;
                case 10:
                    System.out.print("Enter old character: ");
                    char oldChar = sc.nextLine().charAt(0);
                    System.out.print("Enter new character: ");
                    char newChar = sc.nextLine().charAt(0);
                    System.out.println("Replaced: " + str.replace(oldChar, newChar));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
    }
}


/*   OUTPUT

Choose the options of the list :
1 int length()
2 specified index()
3 obj are equal
4 Uppercase()
5 lowercase()
6 Substring()
7 Concat()
8 Boolean contains()
9 Index of first()
10 Replace all occurrences()
0 Exit
1
Length: 10 */

