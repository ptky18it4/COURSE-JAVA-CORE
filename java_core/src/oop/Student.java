package oop;

public class Student {
	private float point;
	private String name;
	
	public void setPoint(float _point) {
		if (_point >= 0 && _point <= 10) {
			point = _point;
			System.out.println("Valid data");
		} else {
			System.out.println("Input point must >= 0 & <= 10");
		}
	}
	
	public float getPoint() {
		return point;
	}
	
	public void setName(String _name) {
		if (_name.length() > 5) {
			System.out.println("Data invalid");
		} else {
			name = _name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	
}
