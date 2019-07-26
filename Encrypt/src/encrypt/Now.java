package encrypt;

public class Now {

	public static void main(String args[]) throws Exception {
		//String check = "{\"method\":\"updateTextualInfo\",\"textual_info\":\"{â€œpan_noâ€?:â€?1234567890â€?,â€?addressâ€?:â€?maladâ€?}\",\"service_id\":\"11\",\"latitude\":\"20\",\"longitude\":\"21\",\"token\":\"bb7nic6q546he52rrlk20cuft6\",\"user_id\":\"47007593\",\"app_name\":\"recharge_app\"}";

		AESCrypt a = new AESCrypt("Staging");
		/*String encrypted = a.encrypt(check);
		System.out.println(encrypted);
		 */
		String c = "xRcyrFH6acqbXVonoSIxs0x6ULyEzrYUiLd4mM+UFen3MFs1vTnlta4cDzahYwY9S476KPMlPffLO/Q8tfWPkezEg64U2ioMn7+5Z1vkaACFQgVcDpbdYwZU5lowIX2ukqsdoJifhzLN0JPYcjPsVHyrGOzUw+ZN9s/vlrpRTLHCSb6XERS/DADgyK8rqXZqOU9y8BENtcWTYA79jGG8Pg==";
		System.out.println(a.decrypt(c));

	}
}