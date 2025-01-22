package j0122;

public class Tv {
	boolean power;
	int channel;
	void power() {
		power = !power; // true -> false, false -> true
	}
	void channerUp() {channel++;}
	void channerDown() {channel--;}

}
