package me.manabreak.pitesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTargetTest {

    @Test
    public void testAdd() {
        assertEquals(4, new TestTarget().add(2, 2));
    }

}