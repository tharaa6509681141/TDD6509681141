package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	boolean isFull();
	Object top();
	Object pop();

}
