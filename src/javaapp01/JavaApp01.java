package javaapp01;

import java.util.List;
import java.util.ArrayList;

public class JavaApp01 {

    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        list.add("MARIA");
        list.add("Alex");
        list.add("Borge");
        
        for(String x: list){
            System.out.println(x);
        }
        
    }
    
}
