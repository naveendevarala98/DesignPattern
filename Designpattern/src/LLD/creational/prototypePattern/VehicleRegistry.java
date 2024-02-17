package LLD.creational.prototypePattern;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {

    private static Map<String, vehice> map = new HashMap<>();

    static {
        System.out.println("static");
        map.put("two",new TwoWheeler(2,true));
        map.put("four",new FourWheeler(4));
    }

    public vehice getInstance(String type) throws CloneNotSupportedException {
        return map.get(type).clone();
    }
}
