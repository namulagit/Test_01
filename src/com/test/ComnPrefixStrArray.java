package com.test;

public class ComnPrefixStrArray {

	public static String commonprefix(String[] s) {
		String prefix = "";

		if (s.length == 0)
			return "";

		prefix = s[0];

		for (int i = 1; i < s.length; i++) {

			while (s[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);

				System.out.println(prefix);
				if (prefix.equals(""))
					return "";
			}

		}
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strAyyay = { "giort", "gioytu", "giothm", "giortv" };
		 //System.out.println(commonprefix(strAyyay));
		commonprefix(strAyyay);
		String ss = "Naveen";
		// System.out.println(ss.indexOf("n"));

	}

}
