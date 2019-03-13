package point1;

public class N11 {
	//garbage
	public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(String args[]){  
	  N11 s1=new N11();  
	  N11 s2=new N11();  
	  s1=null;  
	  s2=null;  
	  System.gc();  
	 }  

}
