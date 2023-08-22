
public enum Transport {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); //constuctor constants declared
	private int speed; //instance variable declared
	Transport(int s) { speed = s; } //constructor declared for each enum constant
	int getSpeed() { return speed; } //method declared for enumerator
} //each enum constant (i.e car) will have it's own construcor, speed variable and getSpeed method
