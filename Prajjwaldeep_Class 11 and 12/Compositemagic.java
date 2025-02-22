import java.io.*;
 public class Compositemagic
 {
       boolean iscomposite(int n)
       {
          int count=0;
          for(int i=1;i<=n;i++)
          {
            if(n%i==0)
            count++;
          }
          if(count>2)
          return true;
          else
          return false;
       }
       int sumdig(int n)
       {
         int s=0;
         while(n>0)
         {
            s=s+n%10;
            n=n/10;
         }
         return s;
       }
       boolean ismagic(int n)
       {
        int a=sumdig(n);
        while(a>9)
        {
           a=sumdig(a);
        }
        if(a==1)
        return true;
        else 
        return false;
       }
       public static void main(String args[])throws IOException
       {
         Compositemagic ob=new Compositemagic();
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enetr the lowest limit(m):");
         int m=Integer.parseInt(br.readLine());
         System.out.print("Enetr the upper limit(n):");
         int n=Integer.parseInt(br.readLine());
         int c=0;
         if(m<n)
         {
            System.out.println("Composite magic no.s are:");
            for(int i=m;i<=n;i++)
            {
               if(ob.iscomposite(i)==true&&ob.ismagic(i)==true)
               {
                  if(c==0)
                  System.out.print(i);
                  else
                  System.out.print(","+i);
                  c++;
               }
            }
            System.out.println();
            System.out.println("freq:"+c);
         }
         else
         System.out.println("out of range");
       }
  }
