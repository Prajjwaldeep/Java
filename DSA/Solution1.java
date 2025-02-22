class Solution1 {
    public static void lengthOfLastWord(String s) {
        s=s.trim()+" ";
        int i,l=s.length();
        String nstr="";
        char ch;
        int last=0;
        char arr[]={' '};
        for(i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                nstr=nstr+ch;
            }
            else
            {
                arr=nstr.toCharArray();
                last=arr.length;
                nstr="";
            }
        }
        System.out.println(last);
    }
}