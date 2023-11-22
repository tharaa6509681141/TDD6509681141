package core;
import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object> elms;
	private Object[] elm = new Object[10];
	
	public Stack() {
		elms = new ArrayList<>();
	}
	@Override
	public boolean isEmpty() {
		if (elms.size() != 0) {
			return false;
		}else {
			return true;
		}
		//return true;
	}

	@Override
	public int getSize() {
		if (elms != null) {
			return elms.size();
		}
		else {
			return 0;
		}
	}
	
	public void push(Object element) {
		elms.add(element);
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return elms.get(elms.size() - 1);
	}
	/*public static void main(String[] args) {
		
	}*/
	@Override
	public Object pop() {
		Object ob = top();
		elms.remove(getSize()-1);
		return ob;
	}

}
