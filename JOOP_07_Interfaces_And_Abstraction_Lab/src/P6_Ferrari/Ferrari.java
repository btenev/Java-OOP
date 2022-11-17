package P6_Ferrari;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ferrari implements Car{
    private String driverName;
    private String model;

    public Ferrari(String driverName) {
        this.driverName = driverName;
        this.model = "488-Spider";
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s"
                , this.model, brakes(), gas(), this.driverName);
    }
    Map<String, Integer> example = new LinkedHashMap<>();
    //+	brakes() : String
    //+	gas() : String
    //+	toString(): String
}
