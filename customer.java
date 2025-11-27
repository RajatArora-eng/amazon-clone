class customer 
 { 
 
public static void main(String[] args) { 
bankk obj=new bankk(5000); 

Thread t1=new Thread(obj); 
t1.setName("Raju"); 
Thread t2=new Thread(obj); 
t2.setName("Sunita"); 


//bankk obj2=new bankk (5000); 
Thread t3=new Thread(obj); 
Thread t4=new Thread(obj); 
 
t3.setName("Rahul"); 
t4.setName("Anita"); 
t1.start(); t2.start(); 
t3.start(); t4.start();
 
} 

 } 