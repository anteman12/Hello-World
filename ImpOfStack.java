public class ImpOfStack {
 int data;
 int capacity = 2;
	int stack[] = new int[5];
int top = 0;
public void push(int data) {
	if(size()==capacity) 
		expand();
	
		stack[top]=data;
		top++;
	
}

//expanding the size of array 

public void expand() {
	int length = size();
	int newStack[] = new int[capacity*2];
	System.arraycopy(stack, 0, newStack, 0, length);
	stack = newStack;
	capacity *= 2;
	
}
public int pop() 
{
	if(isEmpty())
	{
		System.out.println("stack is empty");
	}
	else {
		top--;
		data = stack[top];
		stack[top]=0;
		//shrink();
	}
	return data;
	}
//private void shrink() {
	//int length = size();
	//if(length<=(capacity/2)/2)
	//	capacity = capacity/2;
	
	//int newStack[] = new int[capacity];
	//System.arraycopy(stack, 0, newStack, 0, length);
	//stack = newStack;
//}
public int peek() {
	int data;
	data = stack[top-1];
	return data;
	
}
	public int size() {
		return top;
	}

private boolean isEmpty() {
	return top<=0;
}
public void show() {
	for(int n : stack) {
		System.out.print(n +" ");
	}
	System.out.println();
}
}
