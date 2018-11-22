package com.sample.list;

public class MyArrayList implements MyList {
         //private static final int Index = 0;
		private int arr[];
         private int rear,front;
           private final int Maxsize;
         public MyArrayList() {
			// TODO Auto-generated constructor stub
        	 arr=new int[10];
        	 rear=0;
        	 front=-1;
        	 Maxsize=10;
         }
	@Override
	public boolean add(int number) {
		if(isFull())
		{
			System.out.println("array is full");
		}
		else
			{ this.arr[rear++]=number;
			if(front==-1)
				front=0;
			return true;
			}
		
		return false;
		
	}

	@Override
	public int get(int Index) {
		if(isEmpty()){
			System.out.println("Array is empty");
		}
		else if(Index<0){
			System.out.println("Undefined index");
		}
		else if(Index>=Maxsize){
			System.out.println("Infinite Index");
		}
		else{
			return arr[Index];
		}
		return 0;
	}

	@Override
	public String getAll() {
		String element="[";
		for(int i=front;i<=rear;i++){
			element+=arr[i];
			if(i==rear){
				element+="]";
			}
			else
				element+=",";
			}
		return element;
	}

	@Override
	public boolean update(int Index, int number) {
		if(isEmpty()){
			System.out.println("Array is empty");
		}
		else if(Index<0){
			System.out.println("Undefined index");
		}
		else if(Index>=Maxsize){
			System.out.println("Infinite Index");
		}
		else{
			arr[Index]=number;
			return true;
		}
		return false;
	}

	@Override
	public int remove(int Index) {
		if(isEmpty()){
			System.out.println("Array is empty");
		}
	else if(Index<0){
			System.out.println("Undefined index");
		}
		else if(Index>=Maxsize){
			System.out.println("Infinite Index");
		}
		else{
			 arr[Index]=0;
		
		}
		return 0;
	}
     private boolean isFull(){
    	  if(rear==Maxsize)
       return true;
    	  return false;
     }
     private boolean isEmpty(){
    	 if(front==-1)
    		 return true;
    	 return false;
     }
}
