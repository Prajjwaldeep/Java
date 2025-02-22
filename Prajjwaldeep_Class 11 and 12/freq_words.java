import java.util.*;
class freq_words
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String st="",tm="";
        int l1=0,l2=0,space=1,i,a=0,j=0,tmp=0,pos=0,small=0,max=0;
        char ch;
        System.out.println("Enter the sentence");
        System.out.println("The words are to be separated with a single space");
        System.out.println("End the sentence with a full stop(.)");
        st=in.nextLine();
        l1=st.length();
        for(i=0;i<l1;i++)
        {
            if(st.charAt(i)==' ')
            space++;
        }
        String wr[]=new String[space];
        if(space>10)
        {
            System.out.println("The no. of words are more than 10"); 
        }
        else
        {
            System.out.println("The number of words are:"+space);
            for(i=0;i<l1;i++)
        {
            ch=st.charAt(i);
            if(ch==' '||ch=='.')
            {
            wr[j]=st.substring(a,i);//storing the words
            l2=wr[j].length();j++;
            max=Math.max(max,l2);
            a=l2+a+1;
        }
       
    }
    int c[]=new int[space];
    int ar[]=new int[space];
    System.out.print("WORDS");
    for(i=1;i<max-1;i++)
    System.out.print(" ");
    System.out.println("FREQUENCY");
    for(i=0;i<space;i++)
    {
        for(j=0;j<space;j++)
        {
            if(wr[i].equals(wr[j]))
            {
             c[i]++;//counting the word frequency
            }
       }
    }
   for(i=0;i<space;i++)
   {
      for(j=i+1;j<space;j++)
      {
          if(wr[i].equals(wr[j]))
          {
         c[j]=0;//puting 0 for repeating words
        }
    }
}
for(i=0;i<space;i++)
{
   small=c[i];
   pos=i;
   for(j=i+1;j<space;j++)
   {
       if(c[j]<small)
       {
           small=c[j];pos=j;
        }
    }
    tmp=c[i];tm=wr[i];
    c[i]=c[pos];wr[i]=wr[pos];
    c[pos]=tmp;wr[pos]=tm;
}
for(i=0;i<space;i++)
{
    if(c[i]!=0)//repeating words are omited
    {
     System.out.print(wr[i]);
     for(j=1;j<=max-wr[i].length()+7;j++)
     System.out.print(" ");
     System.out.println(c[i]);
}
}
}
}
}
