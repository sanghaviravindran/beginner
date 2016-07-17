
public class Beginner {
    public static void main(String[] args) {
        int n1,n2,arm,tot=0,a;
         System.out.println("Enter the number");
          Scanner sc=new Scanner(System.in);
          n1=sc.nextInt();
          a=n1;
   while(n1!=0)
        {
            n2=n1%10;
            arm=n2*n2*n2;
            tot+=arm;
            n1=n1/10;
            
        }
        if(tot==a)
            System.out.println("armstrong");  
        else  
            System.out.println("not an armstrong number");
    }
}
