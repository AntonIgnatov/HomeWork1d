package net.bigmir.venzor;

import java.util.Arrays;

public class Network {
	static int[] netArr = { 4570000, 4570001, 4570002, 4570003 };

	public int leng() {
		int l = netArr.length;
		return l;
	}

	public static void add(int a) {
		int i = netArr.length + 1;
		netArr = Arrays.copyOf(netArr, i);
		netArr[i - 1] = a;
	}

	public static boolean test(int a) {
		boolean f = false;
		for (int i = 0; i < netArr.length; i++) {
			if (netArr[i] == a) {
				f = true;
				break;
			}
		}
		return f;
	}

	public static int getNom(int b) {
		int nom = -1;
		for (int j = 0; j < netArr.length; j++) {
			if (netArr[j] == b) {
				nom = j;
				break;
			}else{
				System.out.println(j);
			}
		}
		return nom;
	}

	public static String printArray() {
		String str = Arrays.toString(netArr);
		return str;
	}

}
