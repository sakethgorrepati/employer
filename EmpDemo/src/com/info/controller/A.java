package com.info.controller;

	
    	public class A { 
    		
    		public A() {
    			this(10);
    		}
    		public A(int data)
    		{
    			this.data= data;
    			
    		}
    		public void display()
    		{
    			class Decrementer{
    				public void decrement() {
    					data--;
    					
    				}
    			}
    			Decrementer d= new Decrementer();
    			d.decrement();
    				System.out.println("data= "+ data);
    				
    		}
    		private int data;
    		
    		public static void main(String[] args) {
				int data=0;
				A a = new A();
				a.display();
				System.out.println("data = "+ data);
			}
    		
    		
    	
    		
    		
    		/*static int total =10;
    		public void call()
    		{
    			int total =5;
    			System.out.println(this.total);
    		}
    		public static void main(String[] args) {
				A a1 = new A();
				a1.call();
			}
    		*/
    	}		
    