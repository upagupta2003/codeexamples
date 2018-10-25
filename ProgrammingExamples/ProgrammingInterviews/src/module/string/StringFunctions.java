package module.string;

public class StringFunctions {
	
	boolean isUnique(String t){
		if(t.length() > 256 ){
			return false; //string with unique chars can be at most 256 chars.
		}
		boolean[] bits = new boolean[256];
		for(int i=0; i<t.length() ; i++){
			int val = t.charAt(i);
			if(bits[val]){
				return false; //character already presented
			}
			bits[val] = true;
		}
		return true;
	}
	
	boolean checkPermutation(String s, String t){
		if(s.length() != t.length()){
			return false; //s and t are not of equal lengths
		}
		
		int[] vals = new int[256];
		for (char c: s.toCharArray()){
			vals[c]++;
		}
		
		for(int i = 0; i<t.length() ; i++){
			int v = (int) s.charAt(i);
			vals[v]--;
			if(vals[v] < 0){
				return false;
			}
		}	
		return true;
	}
	
	char[] urlify(char[] s, int len){
		
		//count spaces
		int spaceCount = 0;
		for(int i=0; i<len; i++){
			if(s[i] == ' '){
				spaceCount++;
			}
		}
		
		int newLen = len + spaceCount*2;
		char[] url = new char[newLen];
		int j=0;
		for(int i=0; i<len; i++){
			if(s[i] == ' '){
				url[j]='%'; url[j+1]='2' ; url[j+2]='0';
				j=j+3;
			} else{
				url[j] = s[i];
				j++;
			}
		}
		
		return(url);
	}
	
	boolean palindrome(String s){
		int[] vals = new int[256];
		for(char c : s.toCharArray()){
			vals[c]++;
		}
		int oddCount = 0;
		for (int i = 0 ; i< vals.length ; i++){
			if(vals[i] % 2 != 0){
				oddCount++;
			}
		}
		
		if(oddCount > 1){
			return false;
		}
		return true;
	}
	
}
