public class Account{
	public static void main(String[] args){
		
		String str = "MADAM";
		
		int start = 0;//0,1,2
		int end = str.length()-1;//4,3,2
		boolean flag = true;
		
		while(end>start){
			if(str.charAt(start) != str.charAt(end)){
				flag = false;
				break;
			}
			start++;
			end--;
		}
		
		//Change in version1.0 branch
		
		if(flag){
			System.out.println("Palimdrom");
		}else{
			System.out.println("NOT-Palimdrom");
		}
	}
}

