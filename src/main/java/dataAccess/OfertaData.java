package dataAccess;

public class OfertaData {
    private Integer eskID;
    private String selEmail;
    private float amount;
    private String message;

    public OfertaData(Integer eskID, String selEmail, float amount, String message) {
        this.eskID = eskID;
        this.selEmail = selEmail;
        this.amount = amount;
        this.message = message;
    }

    public Integer getEskID() { return eskID; }
    public String getSelEmail() { return selEmail; }
    public float getAmount() { return amount; }
    public String getMessage() { return message; }
}