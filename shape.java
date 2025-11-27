public  abstract class shape {
    int h,w;
    shape(int h,int w)
    {
        this.h=h;
        this.w=w;

    }

    abstract void area();
   final void show()
    {

        System.out.println("this is a shape");

    }

    
}
