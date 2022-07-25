
public class VetorHistograma {

	public static void main(String[] args) {
		int charVal = 0;
		char aChar = (char) charVal;
		final int DIASDASEMANA = 7;
		int temperatura[] = new int[DIASDASEMANA];
		char dia[] = { 'D', 'S', 'T', 'Q', 'Q', 'S', 'S' };
		String s;
		temperatura[0] = 19;
		temperatura[1] = 21;
		temperatura[2] = 25;
		temperatura[3] = 22;
		temperatura[4] = 20;
		temperatura[5] = 17;
		temperatura[6] = 15;
		for (int i = 0; i < DIASDASEMANA; i++) {
			s = "";
			for (int j = 0; j < temperatura[i]; j++) {
				s = s + aChar;
			}
			System.out.println(dia[i] + ": " + s);
		}
	}
}