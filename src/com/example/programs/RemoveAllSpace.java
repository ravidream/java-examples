package com.example.programs;

class RemoveAllSpace {
	public static void main(String args[]) {
		String str = "Precaution is better than safety";
		String noSpaceStr = str.replaceAll("\\s", " ");
		System.out.println(noSpaceStr);
		char[] strArray = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				stringBuffer.append(strArray[i]);
			}
		}
		String noSpaceStr2 = stringBuffer.toString();
		System.out.println(noSpaceStr2);
	}
}