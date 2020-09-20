public class RepeatSeparator2 {
  public String repeatSeparator(String word, String sep, int count) {
    String result = "";

    if (count == 0) {
      return "";
    }

    for (int i = 0; i < count - 1; i++) {
      result += word + sep;
    }
    return result + word;
  }
}
