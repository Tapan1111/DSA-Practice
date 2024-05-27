package com.tapan.dsa.Greedy;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5Decrypt {
	public static class MD5Encrypt {
		public static void main(String[] args) {
			boolean[] chk = { false };
			String hash = "779bfe80d32b6459cccbd12d4bdbbf95"; // this is the hash key for "tapanbehera"
			hash = hash.toLowerCase();

			// Generate possible character set including digits, uppercase, and lowercase
			// alphabets
			String charset = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

			// Adjust the length of possible values to match the length of "tapanbehera"
			int length = 12;
			generateCombinations(charset, "", length, hash, chk);

			if (!chk[0]) {
				System.out.println("No match found.");
			}
		}

		// Recursive method to generate all possible combinations
		public static void generateCombinations(String charset, String prefix, int length, String hashKey,
				boolean[] found) {
			if (length == 0) {
				md5Enc(prefix, hashKey, found);
				if (found[0]) {
					return;
				}
			} else {
				for (int i = 0; i < charset.length(); i++) {
					generateCombinations(charset, prefix + charset.charAt(i), length - 1, hashKey, found);
					if (found[0]) {
						return;
					}
				}
			}
		}

		public static void md5Enc(String sessionid, String hashKey, boolean[] found) {
			byte[] defaultBytes = sessionid.getBytes();
			try {
				MessageDigest algorithm = MessageDigest.getInstance("MD5");
				algorithm.reset();
				algorithm.update(defaultBytes);
				byte messageDigest[] = algorithm.digest();

				StringBuffer hexString = new StringBuffer();
				for (int i = 0; i < messageDigest.length; i++) {
					String hex = Integer.toHexString(0xFF & messageDigest[i]);
					if (hex.length() == 1) {
						hexString.append('0');
					}
					hexString.append(hex);
				}

				String generatedKey = hexString.toString();

				if (generatedKey.equals(hashKey)) {
					System.out.println("The original value of the MD5 Hash " + hashKey + " is : " + sessionid);
					found[0] = true;
				}
			} catch (NoSuchAlgorithmException nsae) {
				nsae.printStackTrace();
			}
		}
	}
}