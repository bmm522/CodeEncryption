package codeEncryption.oneWay.codeObject;

public class CodeObject {
	private String idCode;
	private String saltCode;
	private String HashCode;
	
	
	public String getIdCode() {
		return idCode;
	}
	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}
	public String getSaltCode() {
		return saltCode;
	}
	public void setSaltCode(String saltCode) {
		this.saltCode = saltCode;
	}
	public String getHashCode() {
		return HashCode;
	}
	public void setHashCode(String hashCode) {
		HashCode = hashCode;
	}
	
	
}
