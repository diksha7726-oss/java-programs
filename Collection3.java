import java.util.ArrayList;
public class Collection3 {
    public static void main(String[] args){
        ArrayList<String> fruit=new ArrayList<String>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Pomegranate");
        fruit.add("Orange");
        fruit.remove(2);
        for(String f:fruit){
            System.out.println(f);
        }
    }
    
}
