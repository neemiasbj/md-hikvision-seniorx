<<<<<<< HEAD
 package br.com.thidi.middleware.resource;
 
 import com.google.gson.Gson;
 import com.google.gson.GsonBuilder;
 import java.math.BigInteger;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.Iterator;
 import java.util.List;
 
 public class Utils
 {
   private static DateFormat df_webhookFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
   private static DateFormat format_HHmmDDMM = new SimpleDateFormat("HHmmddMM");
   private static Gson gson = new Gson();
   
   public static String bytesToHex(byte[] bytes) {
     StringBuilder hexString = new StringBuilder(2 * bytes.length); byte b; int i;
     byte[] arrayOfByte;
     for (i = (arrayOfByte = bytes).length, b = 0; b < i; ) { byte b1 = arrayOfByte[b];
       String hex = Integer.toHexString(0xFF & b1);
       if (hex.length() == 1) {
         hexString.append('0');
       }
       hexString.append(hex);
       b++; }
     
     return hexString.toString();
   }
   
   public static String hexToString(String hex) {
     StringBuilder output = new StringBuilder();
     
     for (int i = 0; i < hex.length(); i += 2) {
       String pair = hex.substring(i, i + 2);
       int decimal = Integer.parseInt(pair, 16);
       output.append((char)decimal);
     } 
     
     return output.toString();
   }
   
   public static ArrayList<Byte> convertPairStringSizedToBCD(String bcdString) {
     ArrayList<Byte> binBcd = new ArrayList<>(bcdString.length() / 2);
     for (int i = 0; i < binBcd.size(); i++) {
       String sByte = bcdString.substring(i * 2, i * 2 + 2);
       binBcd.add(Byte.valueOf(Byte.parseByte(sByte, 16)));
     } 
     return binBcd;
   }
   
   public static byte convertDecimalStringToBCD(String decimalString) {
     return (byte)Integer.parseInt(decimalString.substring(0, 2), 16);
   }
   
   public static Byte convertByteToByteBCD(byte b) {
     return Byte.valueOf((byte)(b / 10 * 16 + b % 10));
   }
 
 
   
   public static byte[] convertByteArrayToBCD(byte[] byteArray, int offSetDestino, int offSetOrigem, int qtdeDestino) {
     byte[] destino = new byte[byteArray.length / 2];
     
     for (int i = 0; i < qtdeDestino; i++) {
       byte k = (byte)(convertASCIIToHex(byteArray[i * 2]) * 16);
       byte x = convertASCIIToHex(byteArray[i * 2 + 1]);
       byte z = (byte)(k + x);
       destino[i] = z;
     } 
     
     return destino;
   }
   
   private static byte convertASCIIToHex(byte arg) {
     if (arg >= 48 && arg <= 57)
       return (byte)(arg - 48); 
     if (arg >= 65 && arg <= 70)
       return (byte)(arg - 55); 
     return 0;
   }
   
   public static byte byteToBCD(byte arg1, byte arg2) {
     return (byte)((arg1 - 48) * 16 + arg2 - 48);
   }
 
 
 
 
 
 
 
   
   public static String convertBCDToString(byte bcd) {
     StringBuilder sb = new StringBuilder();
     
     byte high = (byte)(bcd & 0xF0);
     high = (byte)(high >>> 4);
     high = (byte)(high & 0xF);
     byte low = (byte)(bcd & 0xF);
     
     sb.append(high);
     sb.append(low);
     
     return sb.toString();
   }
 
 
 
 
 
 
   
   public static Integer convertBCDToInteger(byte bcd) {
     return Integer.valueOf(convertBCDToString(bcd));
   }
 
 
 
 
 
 
 
 
   
   public static byte[] convertDecimalToBCD(long num) {
     if (num < 0L) {
       throw new IllegalArgumentException("The method decimalToBcd doesn't support negative numbers. Invalid argument: " + num);
     }
     int digits = 0;
     
     long temp = num;
     while (temp != 0L) {
       digits++;
       temp /= 10L;
     } 
     
     int byteLen = (digits % 2 == 0) ? (digits / 2) : ((digits + 1) / 2);
     
     byte[] bcd = new byte[byteLen];
     int i;
     for (i = 0; i < digits; i++) {
       byte tmp = (byte)(int)(num % 10L);
       
       if (i % 2 == 0) {
         bcd[i / 2] = tmp;
       } else {
         bcd[i / 2] = (byte)(bcd[i / 2] | (byte)(tmp << 4));
       } 
       
       num /= 10L;
     } 
     
     for (i = 0; i < byteLen / 2; i++) {
       byte tmp = bcd[i];
       bcd[i] = bcd[byteLen - i - 1];
       bcd[byteLen - i - 1] = tmp;
     } 
     
     return bcd;
   }
   
   public static String convertByteArrayToString(byte[] byteArray, char separator) {
     String hexString = ""; byte b;
     int i;
     byte[] arrayOfByte;
     for (i = (arrayOfByte = byteArray).length, b = 0; b < i; ) { byte b1 = arrayOfByte[b];
       hexString = String.valueOf(hexString) + String.format("%02X%1", new Object[] { Byte.valueOf(b1) }) + separator; b++; }
     
     return hexString;
   }
   
   public static String convertByteArrayToString(byte[] byteArray) {
     String hexString = ""; byte b;
     int i;
     byte[] arrayOfByte;
     for (i = (arrayOfByte = byteArray).length, b = 0; b < i; ) { byte b1 = arrayOfByte[b];
       hexString = String.valueOf(hexString) + String.format("%02X", new Object[] { Byte.valueOf(b1) }); b++; }
     
     return hexString;
   }
   
   public static String convertByteToBitString(byte b) {
     return String.format("%8s", new Object[] { Integer.toBinaryString(b & 0xFF) }).replace(' ', '0');
   }
   
   public static Integer convertByteToIntBCD(byte b) {
     assert b >= 0 && b <= 99;
     return Integer.valueOf(b / 10 << 4 | b % 10);
   }
   
   public static byte[] convertByteListToByteArray(List<Byte> bytesList) {
     byte[] bytes = new byte[bytesList.size()];
     for (int i = 0; i < bytesList.size(); i++) {
       bytes[i] = ((Byte)bytesList.get(i)).byteValue();
     }
     return bytes;
   }
   
   public static String padStart(String stringToFill, int sizeToFill, char charToFill) {
     if (stringToFill.length() >= sizeToFill) {
       return stringToFill;
     }
     String temp = stringToFill;
     for (int i = stringToFill.length(); i < sizeToFill; i++) {
       temp = String.valueOf(charToFill) + temp;
     }
     return temp;
   }
   
   public static String padEnd(String stringToFill, int sizeToFill, char charToFill) {
     if (stringToFill.length() >= sizeToFill) {
       return stringToFill;
     }
     String temp = stringToFill;
     for (int i = stringToFill.length(); i < sizeToFill; i++) {
       temp = String.valueOf(temp) + charToFill;
     }
     return temp;
   }
   
   public static byte[] convertHexStringToByteArray(String s) {
     int it = Integer.parseInt(s, 16);
     BigInteger bigInt = BigInteger.valueOf(it);
     byte[] byteArray = bigInt.toByteArray();
     return byteArray;
   }
   
   public static String convertByteArrayToHexString(byte[] byteArray) {
     return (byteArray == null) ? null : String.join(",", (CharSequence[])splitStringIntoXStringSize((new BigInteger(1, byteArray)).toString(16).toUpperCase(), Integer.valueOf(2)));
   }
   
   public static String convertByteArrayToHexString(byte[] byteArray, String strToJoin) {
     if (byteArray == null)
       return null; 
     return String.join((strToJoin == null) ? "" : strToJoin, (CharSequence[])splitStringIntoXStringSize((new BigInteger(1, byteArray)).toString(16).toUpperCase(), Integer.valueOf(2)));
   }
   
   public static String formatIpAdressRemoveZeros(String ip) {
     return ip.replaceAll("0+(\\d)", "$1").replaceAll("\\.0+(\\d)", ".$1");
   }
   
   public static short computeAdditionChecksum(byte[] data) {
     short sum = 0; byte b; int i;
     byte[] arrayOfByte;
     for (i = (arrayOfByte = data).length, b = 0; b < i; ) { byte b1 = arrayOfByte[b];
       sum = (short)(sum + b1);
       b++; }
     
     return sum;
   }
   
   public static byte[] getComputedChecksumTwoBytesFromIntSum(int sum) {
     byte[] checksum = new byte[2];
     checksum[0] = (byte)(sum & 0xFF);
     checksum[0] = (byte)(sum >> 8 & 0xFF);
     return checksum;
   }
   
   public static String formatIpAdressAddZeros(String ip) {
     String[] nums = ip.split(".");
     for (int i = 0; i < nums.length; i++) {
       nums[i] = padStart(nums[i], 3, '0');
     }
     return String.join(".", (CharSequence[])nums);
   }
   
   public static int calculateBufferChecksum(List<Byte> buffer) {
     int checkSum = 0;
     for (Iterator<Byte> iterator = buffer.iterator(); iterator.hasNext(); ) { byte b = ((Byte)iterator.next()).byteValue();
       checkSum += b & 0xFF; }
      return checkSum;
   }
   
   public static int calculateBufferChecksum(byte[] buffer) {
     int checkSum = 0; byte b; int i; byte[] arrayOfByte;
     for (i = (arrayOfByte = buffer).length, b = 0; b < i; ) { byte b1 = arrayOfByte[b];
       checkSum += b1 & 0xFF; b++; }
      return checkSum;
   }
   
   public static String formatDateToWebhookPattern(Date date) {
     return df_webhookFormat.format(date);
   }
   
   public static String getFormatedDate_HHmmDDMM(Date date) {
     return format_HHmmDDMM.format(date);
   }
   
   public static String getFormatedDate_HHmmDDMM() {
     return format_HHmmDDMM.format(new Date());
   }
   
   public static String[] splitStringIntoXStringSize(String str, Integer size) {
     return str.split(String.format("(?<=\\G.{%s})", new Object[] { size }));
   }
   
   public static byte convertBitStringToByte(String bit) {
     return Byte.parseByte(bit, 2);
   }
   
   public static String classToJson(Object obj) {
     return gson.toJson(obj);
   }
   
   public static <T> String listToJson(List<T> list) {
     Gson gson = (new GsonBuilder()).setPrettyPrinting().create();
     return gson.toJson(list);
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\middleware\resource\Utils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
package br.com.thidi.middleware.resource;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Utils {

	private static DateFormat df_webhookFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	private static DateFormat format_HHmmDDMM = new SimpleDateFormat("HHmmddMM");
	private static Gson gson = new Gson();

	public static String bytesToHex(byte[] bytes) {
		StringBuilder hexString = new StringBuilder(2 * bytes.length);

		for (byte b : bytes) {
			String hex = Integer.toHexString(0xff & b);
			if (hex.length() == 1) {
				hexString.append('0'); // Pad single-digit hex values with a leading zero
			}
			hexString.append(hex);
		}

		return hexString.toString();
	}

	public static String hexToString(String hex) {
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < hex.length(); i += 2) {
			String pair = hex.substring(i, i + 2);
			int decimal = Integer.parseInt(pair, 16);
			output.append((char) decimal);
		}

		return output.toString();
	}

	public static ArrayList<Byte> convertPairStringSizedToBCD(String bcdString) {
		ArrayList<Byte> binBcd = new ArrayList<Byte>(bcdString.length() / 2);
		for (int i = 0; i < binBcd.size(); i++) {
			String sByte = bcdString.substring(i * 2, i * 2 + 2);
			binBcd.add(Byte.parseByte(sByte, 16));
		}
		return binBcd;
	}

	public static byte convertDecimalStringToBCD(String decimalString) {
		return (byte) Integer.parseInt(decimalString.substring(0, 2), 16);
	}

	public static Byte convertByteToByteBCD(byte b) {
		return ((byte) (((b / 10) * 16) + (b % 10)));
	}

	public static byte[] convertByteArrayToBCD(byte[] byteArray, int offSetDestino, int offSetOrigem, int qtdeDestino) {
		int i;
		byte k, x, z;
		byte[] destino = new byte[byteArray.length / 2];

		for (i = 0; i < qtdeDestino; i++) {
			k = (byte) (convertASCIIToHex((byte) byteArray[i * 2]) * 16);
			x = (byte) (convertASCIIToHex((byte) byteArray[(i * 2) + 1]));
			z = (byte) (k + x);
			destino[i] = (byte) z;
		}

		return destino;
	}

	private static byte convertASCIIToHex(byte arg) {
		if ((arg >= 0x30) && (arg <= 0x39))
			return (byte) (arg - 0x30);
		if ((arg >= 0x41) && (arg <= 0x46))
			return (byte) (arg - 0x37);
		return (0);
	}

	public static byte byteToBCD(byte arg1, byte arg2) {
		return ((byte) (((((byte) arg1) - 0x30) * 16) + ((((byte) arg2) - 0x30))));
	}

	/**
	 * Decodes an unsigned packed BCD byte to its integer number wrapped in a
	 * {@code String}.
	 *
	 * @param bcd the BCD byte to decode.
	 * @return the decoded integer number wrapped inside a {@code String}.
	 */
	public static String convertBCDToString(byte bcd) {
		StringBuilder sb = new StringBuilder();

		byte high = (byte) (bcd & 0xf0);
		high >>>= (byte) 4;
		high = (byte) (high & 0x0f);
		byte low = (byte) (bcd & 0x0f);

		sb.append(high);
		sb.append(low);

		return sb.toString();
	}

	/**
	 * Decodes an unsigned packed BCD byte to its integer number
	 *
	 * @param bcd the BCD byte to decode.
	 * @return the decoded integer number wrapped inside a {@code Integer}.
	 */
	public static Integer convertBCDToInteger(byte bcd) {
		return Integer.valueOf(convertBCDToString(bcd));
	}

	/**
	 * Encodes a positive integer number into an unsigned packed BCD.
	 *
	 * @param num a positive integer number to encode (maximum value of
	 *            2<sup>63</sup>-1).
	 * @return BCD representation of the passed number argument.
	 * @throws IllegalArgumentException if the passed num argument is negative.
	 */
	public static byte[] convertDecimalToBCD(long num) {
		if (num < 0)
			throw new IllegalArgumentException("The method decimalToBcd doesn't support negative numbers." + " Invalid argument: " + num);

		int digits = 0;

		long temp = num;
		while (temp != 0) {
			digits++;
			temp /= 10;
		}

		int byteLen = digits % 2 == 0 ? digits / 2 : (digits + 1) / 2;

		byte[] bcd = new byte[byteLen];

		for (int i = 0; i < digits; i++) {
			byte tmp = (byte) (num % 10);

			if (i % 2 == 0) {
				bcd[i / 2] = tmp;
			} else {
				bcd[i / 2] |= (byte) (tmp << 4);
			}

			num /= 10;
		}

		for (int i = 0; i < byteLen / 2; i++) {
			byte tmp = bcd[i];
			bcd[i] = bcd[byteLen - i - 1];
			bcd[byteLen - i - 1] = tmp;
		}

		return bcd;
	}

	public static String convertByteArrayToString(byte[] byteArray, char separator) {
		String hexString = "";

		// Iterating through each byte in the array
		for (byte i : byteArray)
			hexString += String.format("%02X%1", i) + separator;

		return hexString;
	}

	public static String convertByteArrayToString(byte[] byteArray) {
		String hexString = "";

		// Iterating through each byte in the array
		for (byte i : byteArray)
			hexString += String.format("%02X", i);

		return hexString;
	}

	public static String convertByteToBitString(byte b) {
		return String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
	}

	public static Integer convertByteToIntBCD(byte b) {
		assert 0 <= b && b <= 99; // two digits only.
		return (b / 10 << 4) | b % 10;
	}

	public static byte[] convertByteListToByteArray(List<Byte> bytesList) {
		byte[] bytes = new byte[bytesList.size()];
		for (int i = 0; i < bytesList.size(); i++)
			bytes[i] = bytesList.get(i);

		return bytes;
	}

	public static String padStart(String stringToFill, int sizeToFill, char charToFill) {
		if (stringToFill.length() >= sizeToFill)
			return stringToFill;

		String temp = stringToFill;
		for (int i = stringToFill.length(); i < sizeToFill; i++)
			temp = charToFill + temp;

		return temp;
	}

	public static String padEnd(String stringToFill, int sizeToFill, char charToFill) {
		if (stringToFill.length() >= sizeToFill)
			return stringToFill;

		String temp = stringToFill;
		for (int i = stringToFill.length(); i < sizeToFill; i++)
			temp += charToFill;

		return temp;
	}

	public static byte[] convertHexStringToByteArray(String s) {
		int it = Integer.parseInt(s, 16);
		BigInteger bigInt = BigInteger.valueOf(it);
		byte[] byteArray = (bigInt.toByteArray());
		return byteArray;
	}

	public static String convertByteArrayToHexString(byte[] byteArray) {
		return byteArray == null ? null : String.join(",", splitStringIntoXStringSize(new BigInteger(1, byteArray).toString(16).toUpperCase(), 2));
	}

	public static String convertByteArrayToHexString(byte[] byteArray, String strToJoin) {
		if (byteArray == null)
			return null;
		return String.join(strToJoin == null ? "" : strToJoin, splitStringIntoXStringSize(new BigInteger(1, byteArray).toString(16).toUpperCase(), 2));
	}

	public static String formatIpAdressRemoveZeros(String ip) {
		return ip.replaceAll("0+(\\d)", "$1").replaceAll("\\.0+(\\d)", ".$1");
	}

	public static short computeAdditionChecksum(byte[] data) {
		short sum = 0;
		{
			for (byte b : data) {
				sum += b;
			}
		}
		return sum;
	}

	public static byte[] getComputedChecksumTwoBytesFromIntSum(int sum) {
		byte[] checksum = new byte[2];
		checksum[0] = ((byte) ((sum) & 0xFF));
		checksum[0] = ((byte) ((sum >> 8) & 0xFF));
		return checksum;
	}

	public static String formatIpAdressAddZeros(String ip) {
		String[] nums = ip.split(".");
		for (int i = 0; i < nums.length; i++)
			nums[i] = padStart(nums[i], 3, '0');

		return String.join(".", nums);
	}

	public static int calculateBufferChecksum(List<Byte> buffer) {
		int checkSum = 0;
		for (byte b : buffer)
			checkSum += (b & 0xFF);
		return checkSum;
	}

	public static int calculateBufferChecksum(byte[] buffer) {
		int checkSum = 0;
		for (byte b : buffer)
			checkSum += (b & 0xFF);
		return checkSum;
	}

	public static String formatDateToWebhookPattern(Date date) {
		return df_webhookFormat.format(date);
	}

	public static String getFormatedDate_HHmmDDMM(Date date) {
		return format_HHmmDDMM.format(date);
	}

	public static String getFormatedDate_HHmmDDMM() {
		return format_HHmmDDMM.format(new Date());
	}

	public static String[] splitStringIntoXStringSize(String str, Integer size) {
		return str.split(String.format("(?<=\\G.{%s})", size));
	}

	public static byte convertBitStringToByte(String bit) {
		return Byte.parseByte(bit, 2);
	}

	public static String classToJson(Object obj) {
		return gson.toJson(obj);
	}

	public static <T> String listToJson(List<T> list) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(list);
	}

}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
