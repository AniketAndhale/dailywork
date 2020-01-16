package aniket12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class Sorta {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>(Arrays.asList(12,45,85,52));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}

