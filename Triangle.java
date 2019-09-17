package Exercise;

import javax.swing.JOptionPane;

public class Triangle {
	
	public static void main(String[] args) {
		
		String aTxt = JOptionPane.showInputDialog("Enter side a");
		int a = Integer.parseInt(aTxt);
		String bTxt = JOptionPane.showInputDialog("Enter side b");
		int b = Integer.parseInt(bTxt);
		String cTxt = JOptionPane.showInputDialog("Enter side c");
		int c = Integer.parseInt(cTxt);
		String statement = "Statemant: ";
		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			statement = statement + " Can be triagle";
		} else {
			statement = statement + " Can not be triagle";
		}	
		
		JOptionPane.showMessageDialog(null, statement);
		
	}

}
