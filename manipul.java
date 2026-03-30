import java.util.Scanner;
public class manipul
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String str1=sc.nextLine();
         System.out.println("length of string="+str1.length());
        System.out.println("character of second position="+str1.charAt(1));
        System.out.println("string ends with e:"+str1.endsWith("e"));
        System.out.println("replace 'pp' with 'nk':"+str1.replaceAll("pp","nk"));
        System.out.println("lowercase:"+str1.toLowerCase());
        System.out.println("uppercase:"+str1.toUpperCase());
        System.out.println("Index of 'e':"+str1.indexOf('e'));
        System.out.println("substring from index 2:"+str1.substring(2));
        System.out.println("enter second string");
        String str2=sc.nextLine();
        System.out.println("string 1 concatenated with string 2:"+str1.concat(str2));
    }

}

