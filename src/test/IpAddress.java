package test;

public class IpAddress {

	public static void main(String[] args) {

		String ip = "1.1.1.1";
		String ipAddress = getUpdatedIpAddress(ip);
		System.out.println(ipAddress);
	}

	private static String getUpdatedIpAddress(String ipAddress) {
		char[] strChar = ipAddress.toCharArray();
		for (int i = 0; i < strChar.length; i++) {
			if (strChar[i] == '.') {
				strChar[i] = '[';
			}
		}
		return null;
	}

}
