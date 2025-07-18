public class capitalizeString {
  public static String Capitalize(String str, int size) {
    StringBuffer sb = new StringBuffer(str);

    for (int i = 0; i < size; i++) {
      if (i == 0 || i == (size - 1) && (int) str.charAt(i) >= 97) 
        sb.setCharAt(i, (char)((int) str.charAt(i) - 32));
      } else if (str.charAt(i) == ' ') 
      {
        if (((int) str.charAt(i - 1) - 32) >= 65) 
          sb.setCharAt(i - 1, (char)((int) str.charAt(i - 1) - 32));

        if (((int) str.charAt(i + 1) - 32) >= 65) 
          sb.setCharAt(i + 1, (char)((int) str.charAt(i + 1) - 32));
      }
    }

    return sb.toString();
  }
  public static void main(String args[]) {
    String str = "take u forward is awesome";
    int size = str.length();

    System.out.println("String after capitalizing the first and last letter of each 
    word of the string: ");
    System.out.println(Capitalize(str, size));
  }
}
