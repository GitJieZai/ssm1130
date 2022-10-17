import java.util.HashMap;

/**
 * @author lyj
 * @create 2022-10-17-22:12
 */
public class DeBugTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","tom");
        map.put("school","qinghua");
        map.put("age","12");
        String age = map.get("age");
        System.out.println("age:"+age);


    }

}
