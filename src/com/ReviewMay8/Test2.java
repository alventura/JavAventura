package com.ReviewMay8;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
	public static void main(String []args){
    Map<Integer,Marketing>list=new HashMap();
    list.put(1,new Marketing("Bob", "Flower",300));
    list.put(2,new Marketing("Moss", "Phone",1300));
    list.put(3,new Marketing("Alvaro", "Phones",11300));
    list.put(4,new Marketing("Fox", "Flower",10300));
    
    for(Marketing obj:list.values()) {
        obj.print();
    }
}
}