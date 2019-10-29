package dataService.dataHelper.impl;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/* 注意：这个类暂时不用  */

/*数据保护类接口实现*/
public class SecurityHelper {
	
	public static String encode(String data) throws UnsupportedEncodingException{
		String encodeStr =java.net.URLEncoder.encode(data) ;
		byte encodeByte[]=encodeStr.getBytes("UTF-8");
		//将字符串转换成byte类型数组，实质是各个字符的二进制形式
		
		BigInteger bigInt=new BigInteger(encodeByte);//二进制串转换为一个大整数
		return bigInt.toString();
	}
	
	public static String decode(String data) throws UnsupportedEncodingException{
		BigInteger bigInt = new BigInteger(data);
		byte[] bigByte=bigInt.toByteArray();	//bigInt为密文的BigInteger类型
		String str=(new String(bigByte,"UTF-8"));
		String decodeStr=java.net.URLDecoder.decode(str,"UTF-8"); 
		return decodeStr;
	}
	/*
	public static void main(String[] args) throws UnsupportedEncodingException{
		String strToEncode = "BigDog2;00000000;N00003;0";

		String encode = SecurityHelper.encode(strToEncode);
		System.out.println(encode);
		
		String decode = SecurityHelper.decode(encode);
		System.out.println(decode);
	}
	*/
}

 

