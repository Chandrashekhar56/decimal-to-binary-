abstract class sum {
    public static void main(String[] args) 
    {
            int num=56,i=0;
            int []rem=new int[32];
            int binary;
            System.out.print("Binary number of "+num+" "+"is: ");
            while(num>0)
            {
                rem[i++]=num%2;
                num=num/2;
                
            }
            for(int j=i-1;j>=0;j--)
            {
                System.out.print(rem[j]);
            }
    }
}
