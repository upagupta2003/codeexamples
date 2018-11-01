package module.algos;

class ParaStack{
	
	static final int MAX = 1000; 
	Character[] s = new Character[MAX]; 
	int top;
	
	ParaStack(){
		top = -1;
	}
	
	public boolean isEmpty(){
		return(top<0);
	}
	
	public boolean push(char str){
		if(top>MAX-1){
			return false;
		}
		else{
			top++;
			s[top] = str;
			return true;
		}
	}
	
	public Character pop(){
		if(top<0){
			return null;
		}
		else{
			char str = s[top];
			top--;
			return str;
		}
	}
}

public class validParanthesis {
	
	public boolean isValid(String s){
		if(s == null || s.length() == 0){
			return true;
		}
		
		ParaStack p = new ParaStack();
		for(int i=0; i<s.length(); i++){
			switch(s.charAt(i)){
			case '(':
				p.push(')');
				break;
			case '{':
				p.push('}');
				break;
			case '[':
				p.push(']');
				break;
			default:
				if(p.isEmpty())
					return false;
				if(!p.isEmpty() && s.charAt(i) != p.pop())
					return false;
			}
			
		}
		
		return p.isEmpty();
		
	}

}
