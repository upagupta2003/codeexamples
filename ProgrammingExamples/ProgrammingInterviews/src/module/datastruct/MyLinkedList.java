package module.datastruct;

import java.util.HashSet;

class LinkNode{
	
	int data;
	LinkNode next = null;
	
	public LinkNode(int d){
		this.data = d;
	}
	
}

public class MyLinkedList {
	
	public LinkNode head;
	
	void appendToTail(int d){
		LinkNode end = new LinkNode(d);
		LinkNode pointer = head;
		while(pointer.next!=null){
			pointer = pointer.next;
		}
		pointer.next = end;
	}
	
	void deleteNode(int d){
		LinkNode pointer = head;
		
		if(pointer.data == d){
			pointer = pointer.next;   //return pointer.next if return a linklist
		}
		
		while(pointer.next != null){
			if(pointer.next.data == d){
				pointer.next = pointer.next.next;
				break; ////return pointer.next if return a linklist
			}
			pointer = pointer.next;
		}
	}
	
	void removeDups(){
		HashSet<Integer> s = new HashSet<Integer>();
		LinkNode pointer = head;
		LinkNode previous = null;
		
		while(pointer != null){
			int d = pointer.data;
			if(s.contains(d)){
				previous.next = pointer.next;
			}
			else{
				s.add(d);
				previous = pointer;
			}
			
			pointer = pointer.next;
		}
		
	}
	
	void removeDups2(){
		LinkNode pointer = head;
		LinkNode runner = head.next;
		
		while(pointer != null){
			while(runner != null){
				if(runner.data == pointer.data){
					pointer.next =  runner.next;
				}
				runner = runner.next;
			}
			pointer = pointer.next;
		}
	}
	
	int k2Last(int k){
		LinkNode pointer = head;
		LinkNode runner = head;
		
		for(int i=0; i<k; i++){
			runner = runner.next;
		}
		
		while(runner != null){
			pointer = pointer.next;
			runner = runner.next;
		}
		
		return pointer.data;
	}
	
	boolean delMiddleNode(LinkNode n){
		if(n == null || n.next == null){
			return false; // return failure
		}
		
		LinkNode next = n.next;
		
		n.data = next.data;
		n.next = next.next;
		return true;
	}
	
	LinkNode partition(int x){
		LinkNode after = null;
		LinkNode before = null;
		LinkNode pointer = head;
		LinkNode afterHead = null;
		LinkNode beforeHead = null;
		while(pointer != null){
			LinkNode a = new LinkNode(pointer.data);
			if(pointer.data < x){
				if(before == null){
					before = a;
					beforeHead = a;
				}else{
					before.next = a;
					before = before.next;
				}
			} else{
				if(after == null){
					after = a;
					afterHead = a;
				}else{
					after.next = a;
					after = after.next;
				}
			}
		}
		
		before.next = afterHead;
		return beforeHead;
	}
	
	LinkNode sumLinkList(LinkNode a, LinkNode b){
		LinkNode sum = null;
		int i=0;
		while(a != null || b != null){
			int digit = (int) Math.pow(10, i);
			int res = (a.data + b.data)*digit;
			if(sum == null){
				sum = new LinkNode(res);
			}else{
				LinkNode resNode = new LinkNode(res);
				sum.next = resNode;
				sum = sum.next;
			}
			a = a.next;
			b = b.next;
		}
		
		while(a != null){
			sum.next = a;
			sum = sum.next;
			a = a.next;
		}
		
		while(b != null){
			sum.next = b;
			sum = sum.next;
			b = b.next;
		}
		
		return sum;
	}
}
