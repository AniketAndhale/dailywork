package aniket12;

public class GenericDemo<T> {
	private T t;
	public T get(){
		return this.t;
	}
	public void get(T t1)
	{
		this.t=t1;
	}
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String[] args) {
		
	
			GenericDemo<String> type = new GenericDemo<>();
			type.set("Aniket"); //valid
			String n = type.get();
			
			GenericDemo type1 = new GenericDemo(); 
			type1.set("Aniket"); 
			type1.set(10); 
			
			GenericDemo<Integer> typee = new GenericDemo<>();
	}

}
