package stedronsky.cipher;

/**
 * 
 * @author Stedronsky Thomas
 * @version 2014-04-06
 */
public class MonoAlphabeticCipher implements Cipher {
	private String secretAlphabet;
	
	/**
	 * Konstruktor
	 */
	public MonoAlphabeticCipher() {
		secretAlphabet = "abcdefghijklmnopqrstuvwxyz����";
	}
	
	/**
	 * Getter Methode f�r das Geheimalphabet
	 * @return secretAlphabet Das Geheimalphabet
	 */
	public String getSecretAlphabet() {
		return this.secretAlphabet; 
	}
	
	/**
	 * Setter Methode f�r das Geheimalphabet
	 * @param secretAlphabetneues secretAlphabet
	 */
	void setSecretAlphabet(String secretAlphabet) {
		if(secretAlphabet.length()==30){ //Es wird gepr�ft ob das neue secretAlphabet die entsprechende Anzahl an Zeichen besitzt.
			this.secretAlphabet=secretAlphabet;
		}
	}
	

	/**
	 * Die Methode verschl�sselt einen Text mit dem zugeh�rigen secretAlphabet.
	 * @param  text	Text
	 * @return verText		verschl�sselter Text
	 */
	@Override
	public String encrypt(String text) {
		String alphabet="abcdefghijklmnopqrstuvwxyz����";
		String verText="";
		String t = text.toLowerCase();
		for(int i=0; i<t.length(); ++i){
			char b=t.charAt(i); 
			int index= alphabet.indexOf(b);  //Stelle am Alphabet wird gepr�ft
			if(index>=0){ 
				verText+=this.secretAlphabet.charAt(index); //An der Stelle des indizes wird der Buchstabe zur�ckgegeben.
			}
			else {
				verText+=b; //Wenn nicht enthalten einfach der gleich Buchstabe
			}
		}
		return verText;
		
	}
	
	/**
	 * Die Methode entschl�sselt einen Text mit dem zugeh�rigen secretAlphabet
	 * @param verText	verschl�sselter Text
	 * @return entText	entschl�sselter Text
	 */
	@Override
	public String decrypt(String verText) {
		String alphabet="abcdefghijklmnopqrstuvwxyz����";
		String entText="";
		String t= verText.toLowerCase();
		for(int i=0; i<t.length(); ++i){
			char b=t.charAt(i);
			int index= this.secretAlphabet.indexOf(b); //Stelle am SecretAlphabet wird gepr�ft
			if(index>=0){ 
				entText+=alphabet.charAt(index); //An der Stelle des indizes wird der Buchstabe zur�ckgegeben.
			}
			else {
				entText+=b; //Wenn nicht enthalten einfach der gleich Buchstabe
			}
		}
		return entText;
	}
}
