package stringclasses;

import java.util.Arrays;
import java.util.List;

public class lowertouppercase {

  public static void main(final String[] args) {
    List<String> friends = Arrays.asList("Newyork", "Chicago", "Philly",
        "Miami", "San francisco", "Portland");

    friends.stream().map(name -> name.toUpperCase())
        .forEach(name -> System.out.print(name + " "));

  }

}