package lesson15;

import java.util.ResourceBundle;

public class TestBundle {

    public static void main(String[] args) {
        ResourceBundle bundle=ResourceBundle.getBundle("en");
        String str=bundle.getString("tab1");
        System.out.println(str);
    }
}
