package tuDuy_khoa4_chuong3;

import java.util.Scanner;

public class XuLy {
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){

		DanhSachGiaoDich objDSGD = new DanhSachGiaoDich();
		Scanner scan = new Scanner(System.in);
		objDSGD.nhap(scan);
		objDSGD.xuat();
		System.out.println("Tong so luong cac loai giao dich");
		objDSGD.xuatSLGiaoDich();
		System.out.println("Cac giao dich trong thang 9 nam 2013");
		objDSGD.xuatGDTheoThoiGian();

	}
}