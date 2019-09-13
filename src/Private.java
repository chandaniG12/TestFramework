
	
	 

 class abc{
	 
	 private void method(int x, int y)
	 {
		 System.out.println(x+y);
	 }
		 
//		 void method(int a)
//		 { 
//		    	 
//		    	 System.out.println(a);
//		     }  
		 
     
	 
	 }
 
 class xyz extends abc{
//	 
//	 private void method() {
//		 System.out.println("hello");
//		 
//	}
//	 
//	 private void method(int x){   
//		 
//		 System.out.println("hii");
//	 }  
//	 
 }
		
	//private void method(int a){  
	  
	


public  class Private {
	
	 
	 private void method() {
		 System.out.println("hello");
		 
	}
	 
	 private void method(int x){   
		 
		 System.out.println(x);
	 }  
	 
	
		public static void main(String[] args) 
		 {
			 
			Private s= new Private();
			s.method();
			s.method(10);
			
			 
		 }
}