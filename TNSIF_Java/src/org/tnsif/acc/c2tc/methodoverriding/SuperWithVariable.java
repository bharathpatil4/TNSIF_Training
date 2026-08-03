package org.tnsif.acc.c2tc.methodoverriding;
class Notification
{
	String message= "Default Notification";
}
class Pushnotification extends Notification
{
	String message ="Push Notification";
	void showNotification()
	{
		System.out.println("child message :"+message);
		System.out.println("parent message :"+super.message );
	}
}


public class SuperWithVariable {

	public static void main(String[] args) { 
		Pushnotification obj =new Pushnotification();
		obj.showNotification();
	}

}
