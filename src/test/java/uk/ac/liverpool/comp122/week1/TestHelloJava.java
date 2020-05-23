package uk.ac.liverpool.comp122.week1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
//import org.junit.jupiter.api.Tag;
import edu.illinois.cs.cs125.gradlegrader.annotations.Graded;
import edu.illinois.cs.cs125.gradlegrader.annotations.Tag;

import java.io.*;

public class TestHelloJava {

  @Test
  @Timeout(300)  // JUnit5 !
  //@Tag("slow")  // JUnit5 Tag
  @Graded(points = 10)
  @Tag(name = "difficulty", value = "simple")  // GradleGrader Tag
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
