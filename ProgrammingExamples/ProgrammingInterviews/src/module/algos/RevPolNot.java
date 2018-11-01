package module.algos;

import module.datastruct.MyStack;

public class RevPolNot {
	
	public int evalRPN(String[] tokens){
		MyStack m = new MyStack();
		
		int a, b;
		
		for(String token: tokens){
			switch(token){
			case "+":
				m.push(m.pop()+m.pop());
				break;
			case "*":
				m.push(m.pop()*m.pop());
				break;
			case "-":
				a = m.pop();
				b = m.pop();
				m.push(b-a);
				break;
			case "/":
				a = m.pop();
				b = m.pop();
				m.push(b/a);
				break;
			default:
				m.push(Integer.parseInt(token));
			}
		}
		
		return (int) m.pop();
	}

}
