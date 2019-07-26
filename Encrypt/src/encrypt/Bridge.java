package encrypt;

public class Bridge {
	private String hasMap;

	public String hashConvert(String data, String key){
		try {
			hasMap = EncryptBridge.generateTokenHMAC(data, key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hasMap;	
	}
}
