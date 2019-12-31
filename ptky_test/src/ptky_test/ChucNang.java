package ptky_test;

import java.util.ArrayList;

public class ChucNang {
	private ArrayList<CBGV> listCBGV;
	public ChucNang() {
		listCBGV = new ArrayList<CBGV>(); // Cách 2 : Khởi tạo trong 1 Constructor
	}
	
	
	public void addCBGV(CBGV cbgv) {
		listCBGV.add(cbgv);
	}
	
	public void delCBGV(String maSoCBGV) {
		int viTri = -1;
		for (int i = 0; i < listCBGV.size() ; i++) {
			CBGV cbgv = listCBGV.get(i);
			if(maSoCBGV.equals(cbgv.getMaSoGV())) {
				viTri = i;
				break;
			}
			
		}
		if (viTri != -1) {
			listCBGV.remove(viTri);
			System.out.println("Da xoa vi tri  " + viTri + " co ma " + maSoCBGV);
		}
	}
	
	public float LuongThucLinh(CBGV cbgv2) {
		
		float LuongThucLinh = 0;
		
		for (int i = 0; i < listCBGV.size() ; i++) {
//			CBGV cbgv = listCBGV.get(i);
				LuongThucLinh = cbgv2.getLuongCung() + cbgv2.getLuongThuong() - cbgv2.getTienPhat();
				System.out.println("Luong thuc linh nguoi " +i+ ": "+LuongThucLinh);
		}	
		return LuongThucLinh;
		
	}
	public void hienThiDSCBGV() {
		for ( CBGV cbgv : listCBGV ) {
			cbgv.show();
			System.out.println("------------");
		}
	}
	
}
