package ListToMap;
//java program which will convert List<Employee> to  Map<String, Employee>. Also write a function which will accept employeeId and return Employee object from Map
import java.util.*;
import java.util.stream.Collectors;

public class ConvertListToMapOfEmployee
{
    //function which will accept employeeId and return Employee object from Map
    public static void employeeObject(List<Employee> employeeList,Map<String, Employee> mapOfEmployees)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\nEnter the employee id:");
        int id=sc.nextInt();
        String name = null;
        for(Employee emp : employeeList){
            if(emp.getEmpId()==id)
                name=emp.getEmpName();
        }
        Employee val = (Employee)mapOfEmployees.get(name);
        System.out.println("Value for key "+name+" is: " + val);

    }
    public static void main(String[] args) {

        // create ArrayList
        List<Employee> employeeList = new ArrayList<Employee>();

        // add employee objects to list
        employeeList.add(new Employee(1001, "Sanjana",18, "Consultant"));
        employeeList.add(new Employee(1002, "Akash",20, "Enginner"));
        employeeList.add(new Employee(1003, "Pushpa",23, "Developer"));

        // printing to console - List of Employee
        System.out.println("List of Employee : \n");

        // print to console using for-each
        employeeList.forEach((employee) -> System.out.println(employee));

        // convert List<Employee>
        // to Map<empName, employee> using Streams
        Map<String, Employee> mapOfEmployees = employeeList.stream().collect(Collectors.toMap(e -> e.getEmpName(),e -> e));

        // printing to console - Map of Employee
        System.out.println("\n\nMap of Employee : \n");

        // print to console using  for-each
        mapOfEmployees.forEach((key, value) -> System.out.println("Key: " + key + "\tValue: "+ value));
        //call to the function
        employeeObject(employeeList,mapOfEmployees);
    }
}
