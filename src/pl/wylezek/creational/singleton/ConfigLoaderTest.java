package pl.wylezek.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigLoaderTest {


    @Test
    public void shouldReturnCorrectlyKeysFromMap() {
        assertEquals("Berlin", ConfigLoader.getInstance().getConfigMap().get("Germany"));
        assertEquals("Warsaw", ConfigLoader.getInstance().getConfigMap().get("Poland"));
        assertEquals("Rome", ConfigLoader.getInstance().getConfigMap().get("Italy"));
    }
}