package bai2_hoaDonTienDien;

import java.util.Scanner;

public class XuLy {

	public XuLy() {

	}

	public static void main(String[] args) {
		DanhSachHoaDon objDSHD = new DanhSachHoaDon();
		Scanner scan = new Scanner(System.in);
//		objDSHD.nhap(scan);
		objDSHD.dummyData();
		objDSHD.init();//goi cac ham tinh toan
		System.out.println("***************Danh Sach Tat ca Khach hang*******");
		objDSHD.xuat();
		System.out.println("***************Xuat cac hoa don thang 9 nam 2013.*******");
		objDSHD.xuatHDTheoThoiGian();
	}

}
