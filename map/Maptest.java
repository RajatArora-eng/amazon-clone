package map;

import java.util.HashMap;


public class Maptest {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("101","atul");
        map.put("102","akal");
        map.put("103","eleven");
        map.put("104","himesh");

        System.out.println(map.size());
        System.out.println(map.get("104"));
        map.forEach((k,v)->System.out.println(k+"="+v));
        System.out.println(map.containsKey("101"));
        System.out.println(map.containsKey("402"));
        System.out.println(map.get("201"));
        System.out.println(map.getOrDefault("201", "not found"));


        map.putIfAbsent("101", "sunita");
        map.putIfAbsent("105", "sunita");
        System.out.println(map);
        



    }
    
}
