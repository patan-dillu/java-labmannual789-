interface StackADT <T> {
	

	

	    
	    public  <T> T pop();
	

	    public  void push( T t);
	

	    public <T> T peek();
	

	    public boolean isEmpty();
	

	    public boolean isFull();
	

	

	

	}
	

	

	
	    public class Stacks <T> implements  StackADT {
	

	    
	    private T [ ] data;
	    private int capacity = 30;
	    private int stackTop;
	

	

	    
	

	    public Stacks(T []t){
	        data = t;
	        stackTop = -1;
	    }
	

	

	    public void push( T t){
	        if(stackTop+1 == data.length){
	            System.out.println("Stack is Full You can't add more data");
	        }
	        else{
	            data[++stackTop] = t;
	        }
	    }
	

	    public T pop(){
	        T poped = data[stackTop];
	        data[stackTop] = null; //Just make it 0(1)
	        stackTop--;
	        return poped;
	    }
	

	    public  T peek(){
	        return data[stackTop];
	    }
	

	    public boolean isEmpty(){
	        return stackTop == -1 ? true:false;
	    }
	

	    public boolean isFull(){
	        return stackTop+1 == data.length ? true : false;
	    }
	

	    public static void main(String[] args) {
	        String [] ary = {""};
	        Stacks Name = new Stacks <String>(ary);
	        Name.push("Simon");
	        Name.push("Alex");
	        Name.push("Abel");
	        System.out.println(Name.isEmpty());
	        System.out.println(Name.isFull());
	    }
	

	}


	


	  

