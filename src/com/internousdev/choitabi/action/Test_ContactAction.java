package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;
//package com.internousdev.choitabi.action;

public class Test_ContactAction extends ActionSupport{

	private String contact_name;
	private String contact_mailAddress;
	private String contact_contents;

	public String getContact_name(){
		return contact_name;
	}

	public String getContact_mailAddress(){
		return contact_mailAddress;
	}
	public String getContact_contents(){
		return contact_contents;
	}

public void setContact_name(String contact_name)	{
	this.contact_name=contact_name;
}

public void setContact_mailAddress(String contact_mailAddress)	{
	this.contact_mailAddress=contact_mailAddress;
}

public void setContact_contents(String contact_contents)	{
	this.contact_contents=contact_contents;
}
public String execute(){
	System.out.println("メールアドレス：" + contact_mailAddress);
	System.out.println("内容：" + contact_contents);
String result= SUCCESS;

return  result;

}
}