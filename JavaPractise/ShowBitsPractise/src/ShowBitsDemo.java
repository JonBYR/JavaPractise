
public class ShowBitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowBits b = new ShowBits(8);
		ShowBits i = new ShowBits(32);
		ShowBits li = new ShowBits(64);
		System.out.println("123 in binary: ");
		b.show(123); //8 bit number
		System.out.println("\n87987 in binary: ");
		i.show(87987); //32 bit number
		System.out.println("\n237658768 in binary: ");
		li.show(237658768); //64 bit number
		System.out.println("\nLow order 8 bits of 87987 in binary");
		b.show(87987);
	}

}
