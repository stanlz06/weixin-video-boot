package com.stanlz.utils;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;


/**
 * @Description: 对字符串进行md5加密
 */
public class MD5Utils {
	public static String getMD5Str(String strValue) throws Exception {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		String newstr = Base64.encodeBase64String(md5.digest(strValue.getBytes()));
		return newstr;
	}
}
