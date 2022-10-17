package example04;

import java.util.function.Predicate;

@FunctionalInterface
interface MyInterface {
  // could use a lambda here by assigning to a static field or something similar
  Predicate<String> predStr = (x) -> true;

  void myMethod(); // SAM - Single Abstract Method

  // void myOtherMethod(); can't add this if we want to retain the
  // "FunctionalInterface"
  static void myStaticMethod() {
  }

  default void myDefaultMethod() {
    helper();
  }

  private void helper() {
  }
}