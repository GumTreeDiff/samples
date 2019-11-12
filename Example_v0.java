public class A {
    private static int X;
    private static int Y = 5;

    public A(){
        A.X = 5;
    }
    
    public int test(){
        return A.X * A.Y;
    }

    public int fcn(){
        return A.X * A.Y;
    }
}
