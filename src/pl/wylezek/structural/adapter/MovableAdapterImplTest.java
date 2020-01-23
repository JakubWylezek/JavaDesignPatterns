package pl.wylezek.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableAdapterImplTest {

    @Test
    void shouldCorrectlyConvertMPHtoKM() {
        Movable passat = new Passat();
        MovableAdapter passatAdapter = new MovableAdapterImpl(passat);

        assertEquals(passatAdapter.getSpeedInKm(), 431.30312);
    }

}
