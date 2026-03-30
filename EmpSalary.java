import java.util.Scanner;
public class EmpSalary 
{
    int empid,TA,DA,HRA,Tax,basic,Netsal;
    String name;
    void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Employee name,id,TA,DA,HRA,Tax,basic salary ");
        name=scan.nextLine();
        empid=scan.nextInt();
        TA=scan.nextInt();
        DA=scan.nextInt();
        HRA=scan.nextInt();
        Tax=scan.nextInt();
        basic=scan.nextInt();
    }
    void calc()
    {
        Netsal=(basic+TA+DA+HRA)-Tax;
        System.out.println("Netsalary:"+Netsal);
    }
    public static void main(String[] args) 
    {
        EmpSalary e =new EmpSalary();
        e.getData();
        System.out.println("EMPLOYEE DETAILS..");
        System.out.println("\n___________\n");
        System.out.println("Employeeid:"+e.empid);
        System.out.println("Employee name:"+e.name);
        e.calc();

        }  
    }