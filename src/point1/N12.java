package point1;

public class N12 {
	//runtime
	public static void main(String args[])throws Exception{  
		  Runtime r=Runtime.getRuntime();  
		  System.out.println("total memory: "+r.totalMemory());  
		  System.out.println("free memory: "+r.freeMemory());  
		    
		  for(int i=0; i<10000; i++){  
		   new N12();  
		  }  
		  System.out.println("after creating 10000 instance, free memory: "+r.freeMemory());  
		  System.gc();  
		  System.out.println("after gc(), free memory: "+r.freeMemory());  
		 }  

}
