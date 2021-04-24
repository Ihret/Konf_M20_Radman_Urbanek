package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeaTest {
    Tea tea;

    /**
     * creates a object of type Tea
     */
    @BeforeEach
    void setup() {
        tea = new Tea("trialtea", 0.5, 0.002, "garden");
    }

    @Test
    @DisplayName("Testing volume")
    public void testVolume() {
        // EXERCISE PHASE
        double actual = tea.getVolume();

        // VERIFY PHASE
        assertEquals(0.502, actual, 0.001);
    }

    @Test
    @DisplayName("Testing alcoholic")
    public void testAlcoholic() {
        // EXERCISE PHASE
        boolean alcoholic = false;
        double actual = tea.getAlcoholPercent();
        if (actual > 0) {
            alcoholic = true;
        }

        // VERIFY PHASE
        assertEquals(true, alcoholic);
    }

    @Test
    @DisplayName("Testing alcohol amount")
    public void testAlcoholAmount() {
        // EXERCISE PHASE
        double actual = tea.getAlcoholPercent();

        // VERIFY PHASE
        assertEquals(0.04, actual);
    }


}