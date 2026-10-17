package dataAccess;

public class OfertaData {
	public Integer eskID;
	public String selEmail;
	public float amount;
	public String message;

	public OfertaData(Integer eskID, String selEmail, float amount, String message) {
		this.eskID = eskID;
		this.selEmail = selEmail;
		this.amount = amount;
		this.message = message;
	}
}