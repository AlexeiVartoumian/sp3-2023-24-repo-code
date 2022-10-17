package enums;

class Main {
  // private final static int CONSTANT = 30;

  enum Constants {
    MIN, NORMAL, MAX
  }

  enum Colors {
    RED, BLUE, YELLOW
  }

  // Differences between classes and enums

  /*
   * 
   * The main difference is that enum constants
   * are public, static and final
   */

  public static void main(String[] args) {
    System.out.println(Constants.MIN);
    Constants con = Constants.NORMAL;
    switch (con) {
      case MIN:
        System.out.println("Min");
        break;
      case NORMAL:
        // fall through
      case MAX:
        System.out.println("Normal or Max");
        break;
      default:
        System.out.println("Error!");
        break;
    }
  }
}