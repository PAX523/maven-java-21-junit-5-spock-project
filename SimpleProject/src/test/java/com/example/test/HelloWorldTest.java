package com.example.test;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void testUsingJavaNewFeature() {
        SequencedSet<String> alphabet = new LinkedHashSet<>();

        alphabet.add("A");

        assertEquals("A", alphabet.getFirst());
    }
}
