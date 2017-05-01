/**
 * Create with IntelliJ IDEA
 * User: huoyajing
 * Date: 2017/5/1
 * Time: 8:33
 * To change this template use File | Settings | File Templates.
 */
public class NamingTest {
    public enum State {
        CREATED, UPDATE, DELETE
    }

    public void process(State state){
        switch (state){
            case CREATED:
                break;
            case UPDATE:
                break;
            case DELETE:
                break;
            default:
                break;
        }
    }


    public static void main(String[] args) {

    }
}
