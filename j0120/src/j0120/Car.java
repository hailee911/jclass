package j0120;

public class Car {
	
	Car(){
		color = "black";
		gearType = "auto";
		door = 4;
	} // 기본 생성자
	
	Car(String color, String gearType, int door){
		this.color = color; // this는 인스턴스 자신을 가리킨다.
		this.gearType = gearType;
		this.door = door;
	} // 생성자
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	
	String color;
	String gearType;
	int door;
}
