 public class leapyear {
            public static void main(String[] args) {
                int n1,n2,i,rev=0;
              
                 System.out.println("Enter the number");
                  Scanner sc=new Scanner(System.in);
                  n1=sc.nextInt();
                 
           if((n1 % 400 == 0) || ((n1 % 4 == 0) && (n1 % 100 != 0)))
                System.out.println("Year " + n1 + " is a leap n1");
                else
               System.out.println("Year " + n1 + " is not a leap n1");
        }

        }