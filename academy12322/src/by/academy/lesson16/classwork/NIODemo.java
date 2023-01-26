package by.academy.lesson16.classwork;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

public class NIODemo {

	public static void main(String[] args) {
		String test = "this is a test string это тестовая строка !123";
		byte[] bytes = stringToBytesUTFNIO(test);
		String result = bytesToStringUTFNIO(bytes);

		
		System.out.println(result);
		byte[] testBytes = test.getBytes(StandardCharsets.UTF_16);
		
		System.out.println(bytesToStringUTFNIO(testBytes));

	}

	public static String bytesToStringUTFNIO(byte[] bytes) {
		CharBuffer cBuffer = ByteBuffer.wrap(bytes).asCharBuffer();
		return cBuffer.toString();
	}

	public static byte[] stringToBytesUTFNIO(String str) {
		char[] buffer = str.toCharArray();
		byte[] b = new byte[buffer.length << 1];
		CharBuffer cBuffer = ByteBuffer.wrap(b).asCharBuffer();
		for (int i = 0; i < buffer.length; i++)
			cBuffer.put(buffer[i]);
		return b;
	}
	
	 public static String convertToBits(char c) {
	        String stringValue = new String(new char[]{c});
	        byte[] bytes = stringValue.getBytes(StandardCharsets.UTF_8);
	        StringBuilder sb = new StringBuilder();
	        for (byte b : bytes) {
	            sb.append(Integer.toBinaryString(b & 0xFF)).append(' ');
	        }
	        return sb.toString();
	    }
}
