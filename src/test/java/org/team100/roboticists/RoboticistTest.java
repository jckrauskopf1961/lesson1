package org.team100.roboticists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoboticistTest {
    @Test
    void testChip() {
        Roboticist chip = new Chip();
        assertEquals(0, chip.getStudentId());
        assertEquals(Roboticist.type.MENTOR, chip.getType());
    }
}
