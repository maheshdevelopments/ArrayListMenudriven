import java.util.*;
public class Example
{
    public static void main(String args[]) 
    {
        Employee e1 = new Employee(0,"Mahesh");
        Employee e2 = new Employee(1,"Kishor");
        Employee e3 = new Employee(2,"Vignesh");
        Employee e4 = new Employee(3,"Satheesh");
        Employee e5 = new Employee(4,"Arasan");
        Employee e6 = new Employee(5,"Inamul");
        ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);        
        al.add(e5);
        al.add(e6);
        Scanner input = new Scanner(System.in);
        int option;  
        do 
        {            
            System.out.println("\nMenuList");
            System.out.println("1: To view all employees in the list");
            System.out.println("2: To add an employee to the list");
            System.out.println("3: To update an employee to the list");
            System.out.println("4: To delete an employee to the list");
            option = input.nextInt();
            switch(option)
            {
                case 1:viewEmployee(al);
                        break;
                case 2:addEmployee(al);
                        break;
                case 3:updateEmployee(al);
                        break;
                case 4:deleteEmployee(al);
                        break;
                default:System.out.println("Invalid Input");
                         break;
            }
            System.out.println("Do you want to continue press 1 or otherwise press 2:");
            option=input.nextInt();
        }while(option==1); 
        input.close(); 
    }
    static void viewEmployee(ArrayList<Employee> al)
    {
		for (Employee emp : al)
        {            
            System.out.println("Employee Id : " + emp.getid() + " Name : "+ emp.getname());   
        }
    } 
    static void addEmployee(ArrayList<Employee> al)
    {
        Scanner an=new Scanner(System.in);
        Scanner ai=new Scanner(System.in);    
        System.out.println("Add Employee");
        System.out.println("Enter Id and Name:");
        int id = ai.nextInt();
        String name=an.next();
        al.add(new Employee(id,name));
        for (Employee emp : al)
        {            
            System.out.println("Employee Id : " + emp.getid() + " Name : "+ emp.getname());   
        }
    }
    static void deleteEmployee(ArrayList<Employee> al)
    {
        Scanner del=new Scanner(System.in);
        System.out.println("Enter id you want to delete:");
        int num=del.nextInt();
        al.remove(num);
        for (Employee emp : al)
        {            
            System.out.println("Employee Id : " + emp.getid() + " Name : "+ emp.getname());   
        }
    } 
    static void updateEmployee(ArrayList<Employee> al)
    {
        Scanner en=new Scanner(System.in); 
        Scanner eid=new Scanner(System.in);     
        System.out.println("To enter Id to Edit Employee");
        int id1 = eid.nextInt();
        for (Employee emp : al)
        {
            if(id1==emp.getid())
            {
                System.out.println("Edit your name:");
                String name=en.next();
                al.set(id1,new Employee(id1,name));
                for (Employee emp1 : al)
                {            
                    System.out.println("Employee Id : " + emp1.getid() + " Name : "+ emp1.getname());   
                }
            }
        }
    } 
}