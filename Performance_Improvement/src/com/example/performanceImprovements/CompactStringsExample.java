package com.example.performanceImprovements;

public class CompactStringsExample {
   public static void main(String[] args) {
      // Create a string that consists of ASCII characters only
      String asciiString = "Hello, world!";

      // Create a string that contains non-ASCII characters
      String nonAsciiString = "こんにちは、世界！";

      // Print the length and memory usage of each string
      System.out.println("Length of ASCII string: " + asciiString.length());
      System.out.println("Memory usage of ASCII string: " + memoryUsage(asciiString));

      System.out.println("Length of non-ASCII string: " + nonAsciiString.length());
      System.out.println("Memory usage of non-ASCII string: " + memoryUsage(nonAsciiString));
   }

   private static long memoryUsage(String s) {
      // Calculate the memory usage of a string in bytes
      return s.getBytes().length;
   }
}
