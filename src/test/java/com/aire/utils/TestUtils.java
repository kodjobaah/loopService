package com.aire.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class TestUtils {

  public static String getApplications() {
    ClassLoader classLoader = TestUtils.class.getClassLoader();
    File file = new File(classLoader.getResource("application.out").getFile());

    String application = null;
    //read file into stream, try-with-resources
    try (Stream<String> stream = Files.lines(file.toPath())) {

      application = stream.findFirst().get();

    } catch (IOException e) {
      e.printStackTrace();
    }
    return application;
  }
}
