package stedronsky.test;

import static org.junit.Assert.*;
import stedronsky.cipher.MonoAlphabeticCipher;
import stedronsky.cipher.SubstitutionCipher;


/**
 * JUnit Test-Klasse
 * @author Stedronsky Thomas
 * @version 2014-04-07
 *
 */
public class Test {

	/**
	 * JUnit Test f�r MonoAlphabeticCipher()
	 */
	@org.junit.Test
	public void MonoAlphabeticCipher(){
		MonoAlphabeticCipher c= new MonoAlphabeticCipher();
	}

	/**
	 * JUnit Test f�r getSecretAlphabet() 
	 */
	@org.junit.Test
	public void getSecretAlphabet() {
		MonoAlphabeticCipher c= new MonoAlphabeticCipher();
		String x=c.getSecretAlphabet(); //Wird zur�ckgegeben
		if(x.equals("abcdefghijklmnopqrstuvwxyz����")){ //�berpr�ft
			System.out.println("Erfolgreich");
		}
	}

	/**
	 * JUnit Test f�r setSecretAlphabet()
	 */
	@org.junit.Test
	public void setSecretAlphabet() {
		SubstitutionCipher c1= new SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		try {
		c1.setSecretAlphabet("����zyxwvutsrfedcba"); //Gesetzt
		}
		catch(IllegalArgumentException e){ //Wenn fals wird eine Exception geworfen
			System.out.println("FAIL");
		}
	}

	/**
	 * JUnit Test f�r encrypt
	 */
	@org.junit.Test
	public void encrypt() {
		SubstitutionCipher c= new SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		c.setSecretAlphabet("����zyxwvutsrqponmlkjihgfedcba"); //Wird gesetzt 
		String verschl=c.encrypt("3BHIT"); //Verschl�sselt
		if(verschl.equals("3�wvk")){ //�berpr�ft 
			System.out.println("Erfolgreich");
		}
	}

	/**
	 * JUnit Test f�r decrypt
	 */
	@org.junit.Test
	public void decrypt() {
		SubstitutionCipher c= new SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		c.setSecretAlphabet("����zyxwvutsrqponmlkjihgfedcba"); //gesetzt
		String verschl=c.decrypt("3�wvk"); //Entschl�sselt
		if(verschl.equals("3bhit")){ //�berpr�ft
			System.out.println("Erfolgreich");
		}
	}

}
