public class Palindrome {
    public static void main(String args[]){
        
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=new StringBuffer(s1).reverse().toString();
        if(s1.equals(s2))
        {
            System.out.println("Palindrome");
            
        }
        else
            System.out.println("not a palindrome");
        
    }

}