package com.java8features;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequencyCount {

	public static void main(String[] args) {
		String str = "apple";

        Map<Character, Long> frequency = str.chars()
                                            .mapToObj(c -> (char) c)
                                            .collect(Collectors.groupingBy(
                                                     c->c,
                                                     Collectors.counting()
                                                     ));

        System.out.println(frequency);

	}

}
