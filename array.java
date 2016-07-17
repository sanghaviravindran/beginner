
        public class Hunter {
            public static void main(String[] args) {
                 
      int flag=0;
      int c;
        Scanner s=new Scanner(System.in);
                System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int[] b=new int[10];
                System.out.println("array elements");
        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
        }
           System.out.println("Enter the unique element");
         c=s.nextInt();
        
         for(int i=0;i<n;i++)
        {
            if((b[i]==c)&&(b[i]==i))
            {
                System.out.println("number in the position:"+i);
                flag=1;
                break;
            }
        }
       if(flag==0)
            System.out.println("number is not present in array");
        
    }
}
       
    