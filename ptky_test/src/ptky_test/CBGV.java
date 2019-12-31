package ptky_test;

public class CBGV {
	private float luongCung;
	private float luongThuong;
	private float tienPhat;
	private float luongThuc;
	private String maSoGV;
	
	
	public CBGV(float luongCung, float luongThuong, float tienPhat, float luongThuc, String maSoGV) {
		super();
		this.luongCung = luongCung;
		this.luongThuong = luongThuong;
		this.tienPhat = tienPhat;
		this.luongThuc = luongThuc;
		this.maSoGV = maSoGV;
	}
	public float getLuongCung() {
		return luongCung;
	}
	public void setLuongCung(float luongCung) {
		this.luongCung = luongCung;
	}
	public float getLuongThuong() {
		return luongThuong;
	}
	public void setLuongThuong(float luongThuong) {
		this.luongThuong = luongThuong;
	}
	public float getTienPhat() {
		return tienPhat;
	}
	public void setTienPhat(float tienPhat) {
		this.tienPhat = tienPhat;
	}
	public float getLuongThuc() {
		return luongThuc;
	}
	public void setLuongThuc(float luongThuc) {
		this.luongThuc = luongThuc;
	}
	public String getMaSoGV() {
		return maSoGV;
	}
	public void setMaSoGV(String maSoGV) {
		this.maSoGV = maSoGV;
	}
	
	public void show() {
		System.out.println("Luong cung : " + luongCung);
		System.out.println("Luong thuong : " + luongThuong);
		System.out.println("Luong thuc : " + luongThuc);
		System.out.println("Tien phat : " + tienPhat);
		System.out.println("Ma so GV : " + maSoGV);
	}
	
}
