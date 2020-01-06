package email;

public class EMail
{
	String accountName;
	int id;
	int sentMail;
	int inbox;
	
	public EMail(String accountName, int id) 
	{
		this.accountName = accountName;
		this.id = id;
	}
	public EMail() 
	{
		
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSentMail() {
		return sentMail;
	}
	public void setSentMail(int sentMail) {
		this.sentMail = sentMail;
	}
	public int getInbox() {
		return inbox;
	}
	public void setInbox(int inbox) {
		this.inbox = inbox;
	}
}