package org.tnsif.acc.c2tc.multipleinterface;

class SmartPhone implements Camera,MusicPlayer
{
@Override
public void playMusic() {
	// TODO Auto-generated method stub
	
}

@Override
public void takePhoto() {
	// TODO Auto-generated method stub
	
}

public class MultipleInterface {

	public static void main(String[] args) { 
		SmartPhone smartPhone =new SmartPhone();
		smartPhone.playMusic();
		smartPhone.takePhoto();

	}

}
 
}
