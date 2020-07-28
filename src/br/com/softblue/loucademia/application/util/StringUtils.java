package br.com.softblue.loucademia.application.util;

public class StringUtils {//=================================================
	
	
	//Metodo para verificar
	//se uma String está vazia.
	public static boolean isEmpty(String s) {
		if(s == null) {
		return true;
	}
	
	return s.trim().length() == 0;
	
	}
	
	
	public static String leftZeroes(int value, int finalSize) {
		
		return String.format("%0" + finalSize + "d", value);
	}
	
	
	public static void main(String[] args) {//**********************
		String str = null;
		int num =  123456;
		
		boolean b = StringUtils.isEmpty(str);
		System.out.println(b);
		
		System.out.println(StringUtils.leftZeroes(num, 8));
	}//**************************************************************
	
	
}//===========================================================================



