
    public class primeint {
        public static void main(String[] args) {
            int n1,n2,arm,tot=0,a,i,j,flag;
             System.out.println("Enter the number");
              Scanner sc=new Scanner(System.in);
              n1=sc.nextInt();
              n2=sc.nextInt();
              a=n1;
           while (n1 < n2)
    {
        flag=0;

        for(i=2; i<=n1/2; ++i)
        {
            if(n1%i == 0)
            {
                flag=1;
                break;
            }
        }

        if (flag == 0)
            System.out.println(n1);

        ++n1;
    }

   

        }
        }
    
    