package encrypt;

public class Encrypt {
	private String encrypted;

	public String convertAndEncrypt(String env, String param){
		try {
			AESCrypt a = new AESCrypt(env);
			encrypted = a.encrypt(param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encrypted;
	}
}
