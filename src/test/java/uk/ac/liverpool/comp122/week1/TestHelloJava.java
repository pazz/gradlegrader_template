package uk.ac.liverpool.comp122.week1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import edu.illinois.cs.cs125.gradlegrader.annotations.Graded;
//import com.github.cs125-illinois.gradlegrader.annotations.Graded;

import java.io.*;

public class TestHelloJava {

  //@Test(timeout = 300)
  @Graded(points = 10)
  //@Tag(name = "difficulty", value = "simple")
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
