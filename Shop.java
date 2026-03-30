import java.util.Scanner;
interface Calc
{
    void calculate();
}
class Bill implements Calc\
{
    String pid,pname;
    int quantiy;
    double price,total,amount=0;
    Scanner sc= new Scanner(System.in); 
}  
public void getdata()
{
    
    System.out.println("Enter Product Details:");
    
}