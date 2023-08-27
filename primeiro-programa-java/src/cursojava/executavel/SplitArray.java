package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class SplitArray {
	public static void main(String[] args) {
		
		String texto = " alex, curso Java, 80, 70, 90, 89";
		
		String[] valoresArray = texto.split(",");
		
		/*Convertendo um Array em uma lista*/
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		
		
		/*Convertendo uma lista para Array */
		
		String[] conversaoArray = list.toArray(new String[6]);
		
		for (int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
		
		
		
	}
}
