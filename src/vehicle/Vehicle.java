import javax.swing.JOptionPane;


public class Vehicle {


	static String[] VIN = new String[3];
	static String[] manufacturer = new String[3];
	static float[] vehiclePrice = new float[3];


	/**
	 * load Array
	 */
	static void loadArray() {
		VIN[0] = "112367";
		VIN[1] = "212367";
		VIN[2] = "312367";


		manufacturer[0] = "AUDI";
		manufacturer[1] = "BMW";
		manufacturer[2] = "VOLVO";


		vehiclePrice[0] = 180000;
		vehiclePrice[1] = 170000;
		vehiclePrice[2] = 210000;
	}


	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		loadArray();
		int ch = -1;
		while (ch != 0) {
			ch = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Enter (1) to search for vehicle details.\nEnter (2) to display all the vehicle details.\nEnter (0) to exit. "));
			if (ch == 1) {
				searchArray();
			}
			if (ch == 2) {
				String allVehicleDetails = "";
				for (int i = 0; i < 3; i++) {
					allVehicleDetails += "VIN: " + VIN[i] + "\nManufacturer: " + manufacturer[i] + "\nVehicle Price: R "
							+ vehiclePrice[i]+"\n";


				}
				JOptionPane.showMessageDialog(null, allVehicleDetails);
			}
		}
	}


	static void searchArray() {
		String vehicleVIN = JOptionPane.showInputDialog(null, "Enter in the Vehicle VIN");
		int index = -1;
		for (int i = 0; i < 3; i++) {
			if (VIN[i].compareToIgnoreCase(vehicleVIN) == 0) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			JOptionPane.showMessageDialog(null, "VIN: " + VIN[index] + "\nManufacturer: " + manufacturer[index]
					+ "\nVehicle Price: R " + vehiclePrice[index]);
		} else {
			JOptionPane.showMessageDialog(null, "The vehicle you entered cannot be found.");
		}


	}


}
