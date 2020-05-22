package uk.ac.liverpool.comp122.week1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import java.io.*;

public class TestHelloJava {

  @Test
  public void testHelloWorld() {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    HelloJava.main(null);

    // assertion
    assertEquals("Hello Java!\n", bos.toString());

    // undo the binding in System
    System.setOut(originalOut);
  }
}
