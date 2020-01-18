package pl.wylezek.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigLoader {

    private static final ConfigLoader INSTANCE = new ConfigLoader();
    private Map<String, String> configMap = new HashMap<>();

    private ConfigLoader() {
        initConfigMap();
    }

    public static ConfigLoader getInstance() {
        return INSTANCE;
    }

    private void initConfigMap() {
        configMap.put("Poland", "Warsaw");
        configMap.put("Germany", "Berlin");
        configMap.put("Italy", "Rome");
    }

    public Map getConfigMap() {
        return configMap;
    }


}
