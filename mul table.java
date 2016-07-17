public class Multiplication {
    public static void main(String args[]){
        int mul,n,i;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table to be print");
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            mul=i*n;
            System.out.println(n+"*"+i+"="+mul);
            
        }
                
    }
}
