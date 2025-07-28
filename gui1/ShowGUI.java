package day1;

public class ShowGUI {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MyFirstJFrame gui = new MyFirstJFrame();
			}
		});
		
	}
}
