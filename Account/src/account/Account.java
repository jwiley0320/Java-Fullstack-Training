package account;

public class Account 
{
	private int _accountNumber;
	private double _balance;
	
	public Account(int _accountNumber, double _balance) 
	{
		this._accountNumber = _accountNumber;
		this._balance = _balance;
	}
	public int get_accountNumber() 
	{
		return _accountNumber;
	}
	public void set_accountNumber(int _accountNumber) 
	{
		this._accountNumber = _accountNumber;
	}
	public double get_balance() 
	{
		return _balance;
	}
	public void set_balance(double _balance) 
	{
		this._balance = _balance;
	}
	public void Withdraw(double _withdraw) 
	{
		_balance = _balance - _withdraw; 
	}
	public void Deposit(double _deposit) 
	{
		_balance = _deposit + _balance;
	}
}