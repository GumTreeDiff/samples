public class B {
    private static int first;
    private static int second = 5;

    public B(){
        B.first = 21;
    }
    
    public int mult(){
        return B.first * B.second;
    }
}
