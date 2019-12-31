package ptky_test;

public class Nguoi extends CBGV {
	private String hoTen;
	private int tuoi;
	private String queQuan;
	
	
	public Nguoi(float luongCung, float luongThuong, float tienPhat, float luongThuc, String maSoGV, String hoTen,
			int tuoi, String queQuan) {
		super(luongCung, luongThuong, tienPhat, luongThuc, maSoGV);
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("Ho ten : " + hoTen);
		System.out.println("Tuoi : " + tuoi);
		System.out.println("Que quan : " + queQuan);
	}
	
	
}
