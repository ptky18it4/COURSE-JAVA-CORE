package ptky_test;

public class MainClass {

	public static void main(String[] args) {
		ChucNang chucNang = new ChucNang();
		System.out.println("CHUONG TRINH QUAN LY VIEC THANH TOAN LUONG");
		
		Nguoi nguoi0 = new Nguoi(0, 1000, 500, 50, "ABC", "Bill Gate",99 , "HaNoi");
		Nguoi nguoi1 = new Nguoi(0, 1000, 70, 50, "DEF", "Bill Gate",99 , "HaNoi");
		Nguoi nguoi2 = new Nguoi(0, 1000, 700, 50, "GHI", "Bill Gate",99 , "HaNoi");
		chucNang.addCBGV(nguoi0);
		chucNang.addCBGV(nguoi1);
		chucNang.addCBGV(nguoi2);
		chucNang.hienThiDSCBGV();
		chucNang.delCBGV("ABC");
		chucNang.hienThiDSCBGV();
		chucNang.LuongThucLinh(nguoi2);
	}

}
