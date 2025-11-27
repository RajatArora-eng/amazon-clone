public class Division {
    
    public static void main(String[] x) {
        try{
        int a=Integer.parseInt(x[0]);
        int b=Integer.parseInt(x[1]);

        int c=a/b;
        System.out.println("a/b = "  +  c);
        System.out.println("done");
        }
     
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("insuficient input");
        }
        catch(ArithmeticException ex){
            System.out.println("division by zero not possible");
        }
        catch(Exception ex)
        {
            System.out.println( ex.getMessage());
        }
        finally{
            System.out.println("bye ");
        }

    }
    
}
