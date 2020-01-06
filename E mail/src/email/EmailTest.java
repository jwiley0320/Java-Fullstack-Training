package email;

public class EmailTest {

	public static void main(String[] args) 
	{
		EMail email = new EMail();
		EMail eMail2 = new EMail("Jason", 1);
		
		System.out.print(eMail2.getAccountName());
		System.out.print(eMail2.getId());
		email.setSentMail(5);
		email.setInbox(10);
		System.out.print(email.getInbox());
		System.out.print(email.getSentMail());
	}

}