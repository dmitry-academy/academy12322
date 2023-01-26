package by.academy.lesson16.classwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task50 {

	private static final Random rand = new Random();

	public static void main(String[] args) {
		File outputFile = new File("io/binaryFile.txt");
		if (!outputFile.exists()) {
			try {
				outputFile.createNewFile();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		int sum = 0;
		try (FileOutputStream writer = new FileOutputStream(outputFile);
				FileInputStream reader = new FileInputStream(outputFile)) {
			for (int i = 0; i < 1; i++) {
				int n;
				System.out.println((n = rand.nextInt()));
				String binary = Integer.toBinaryString(n);
//				
//				;
//				if (binary.length() < 32) {
//					StringBuffer zeros = new StringBuffer("0");
//					for (int j = 0; j < 31 - binary.length(); j++) {
//						zeros.append('0');
//					}
//					binary = new String(zeros + binary);
//				}
				System.out.println(binary);
				System.out
						.println((Stream.generate(() -> "0").limit(32 - binary.length()).collect(Collectors.joining(""))
								+ binary));
				writer.write((Stream.generate(() -> "0").limit(32 - binary.length()).collect(Collectors.joining(""))
						+ binary).getBytes());
			}
			System.out.println();
			writer.flush();
			byte[] buffer = new byte[32];
			while (reader.read(buffer) != -1) {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < buffer.length; i++) {
					String s = Integer.toBinaryString(buffer[i]);
					sb.append(s);
				}
				System.out.println(sb);
//				System.out.println(Integer.parseInt(sb.toString(), 2));
//				if ('1' == buffer[0]) {
//					for (int i = 0; i < 32; i++) {
//						if (buffer[i] == '1') {
//							buffer[i] = '0';
//						} else {
//							buffer[i] = '1';
//						}
//					}
//					sum += 0 - (Integer.parseInt((new String(buffer)), 2) + 1);
//					System.out.println(0 - (Integer.parseInt((new String(buffer)), 2) + 1));
//				} else {
//					sum += Integer.parseInt(new String(buffer), 2);
//					System.out.println(Integer.parseInt(new String(buffer), 2));
//				}
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		System.out.println();
		System.out.println(sum / 20);

	}

}
