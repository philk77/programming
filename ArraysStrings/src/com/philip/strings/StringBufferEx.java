package com.philip.strings;

public class StringBufferEx {
	
	public String makeSentence(String[] strings) {
		StringBuffer strBuff = new StringBuffer();
		
		for (String s: strings) {
			strBuff.append(s);
		}
		
		return strBuff.toString();
	}
	
	
	public static void main(String[] str) {
		String[] strings = {"hello", "world", "philip"};
		StringBufferEx ex = new StringBufferEx();
		String result = ex.makeSentence(strings);
		System.out.println(result);
	}
}
