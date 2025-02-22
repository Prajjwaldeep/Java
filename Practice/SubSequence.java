class SubSequence{
	
	public static boolean checkSubsequence(String str,String substr){
		int n = str.length();
		int m = substr.length();
		int j=0;
		for(int i=0;i<n & j<m;i++){
			if(str.charAt(i)==substr.charAt(j)){
				j++;
			}
		}
		return j==m;
	}


	public static void main(String args[]){
		String str = "ahbgdc";
		String substr = "axc";
		System.out.println(checkSubsequence(str,substr));

	}
}
