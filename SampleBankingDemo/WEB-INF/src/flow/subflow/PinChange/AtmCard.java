package flow.subflow.PinChange;

import flow.subflow.AccountBalance.Users;

public class AtmCard {
	
    public int cardId;
    public String cardNumber;
    public String cvv;
    public String pin;
    public String expiryDate;
    public Users users;
    
	public AtmCard() {
		super();
	}

	public AtmCard(int cardId, String cardNumber, String cvv, String pin, String expiryDate, Users users) {
		super();
		this.cardId = cardId;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.pin = pin;
		this.expiryDate = expiryDate;
		this.users = users;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
    
    

}
