package bai2_hoaDonTienDien;

import java.util.Scanner;

public class XuLy {

	public XuLy() {

	}

	public static void main(String[] args) {
		DanhSachHoaDon objDSHD = new DanhSachHoaDon();
		Scanner scan = new Scanner(System.in);
		objDSHD.nhap(scan);
//		objDSHD.dummyData();
		objDSHD.xuat();
		System.out.println("Xuat cac hoa don thang 9 nam 2013.");
		objDSHD.xuatHDTheoThoiGian();
	}

}
