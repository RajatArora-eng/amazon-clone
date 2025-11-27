public class Mymainthread {
    public static void main(String[] args) {
        Thread main=Thread.currentThread("child");
        Mychildthread child =new Mychildthread();
        System.out.println("status of main"+ main.isAlive());
        System.out.println(" of child"+child.isAlive());
        System.out.println("name of main"+main.getName());
        System.out.println("name of child"+child.getName());
        main.setName("parent");
        System.out.println("priroity of main "+ main.getPriority());
        System.out.println("priority of child"+child.getPriority());

        System.out.println("status of main"+main.isAlive());
        try{
            
        }
    
        
    }
    
}
