package stedronsky.cipher;

/**
 * Interface zum ent- und verschl��seln
 * @author Stedronsky Thomas
 * @version 2014-04-07
 *
 */
public interface Cipher {
	
	/**
	 * Die Methode verschl�sselt einen Text mit dem zugeh�rigen secretAlphabet.
	 * @param  text			Text
	 * @return verText		verschl�sselter Text
	 */
	public String encrypt(String text);
	
	/**
	 * Die Methode entschl�sselt einen Text mit dem zugeh�rigen secretAlphabet
	 * @param verText	verschl�sselter Text
	 * @return entText	entschl�sselter Text
	 */
	public String decrypt(String verText);
}
