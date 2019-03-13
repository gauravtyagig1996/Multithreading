package point1;
//static syncronization with annonymus class
	class Aa1{  
		  
		 synchronized static  void printTable(int n){  
		   for(int i=1;i<=10;i++){  
		     System.out.println(n*i);  
		     try{  
		       Thread.sleep(400);  
		     }catch(Exception e){}  
		   }  
		 }  
		}  
		  
		public class N20 {  
		public static void main(String[] args) {  
		      
		    Thread ta1=new Thread(){  
		        public void run(){  
		            Aa1.printTable(1);  
		        }  
		    };  
		      
		    Thread ta2=new Thread(){  
		        public void run(){  
		            Aa1.printTable(10);  
		        }  
		    };  
		      
		    Thread ta3=new Thread(){  
		        public void run(){  
		            Aa1.printTable(100);  
		        }  
		    };  
		      
		    Thread ta4=new Thread(){  
		        public void run(){  
		            Aa1.printTable(1000);  
		        }  
		    };  
		    ta1.start();  
		    ta2.start();  
		    ta3.start();  
		    ta4.start();  
		      
		}  
		} 