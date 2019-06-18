public class ChainSyntaxTest {

    public void foo() {
    
    StringBuffer buffer = new StringBuffer();
    
    String string = buffer
        .append("a")
        .append("c")
        .toString();

    }

}