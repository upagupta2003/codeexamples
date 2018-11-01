package module.datastruct;

public class MyStack {
	
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty(){
		return(top<0);
	}
	
	public MyStack(){
		top=-1;
	}
	
	public boolean push(int x){
		if(top >= MAX-1){
			return false;	
		}
		else{
			top++;
			a[top] = x;
			return true;
		}
	}
	
	public int pop(){
		if(top < 0){
			return 0;
		}
		else{
			int x = a[top];
			top--;
			return x;
		}
	}

}
