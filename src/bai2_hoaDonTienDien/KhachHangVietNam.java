package bai2_hoaDonTienDien;

import java.util.Scanner;

/*
 * Mục đích: Lớp cha quản lý khach hang viet nam
 * Người tạo: Bui Quoc Trieu
 * Ngày tạo:1/1/2021
 * Version: 1.0
 * */
public class KhachHangVietNam extends KhachHang {
	// 1. attributes
	private String doiTuong;
	// 2. get, set

	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}

	// 3. constructors
	public KhachHangVietNam() {
		super();
	}

	public KhachHangVietNam(int maKH, String hoTenKH, int ngayHoaDon, int thangHoaDon, int namHoaDon,
			float soluongKWTieuThu, float donGia, String doiTuong) {
		super(maKH, hoTenKH, ngayHoaDon, thangHoaDon, namHoaDon, soluongKWTieuThu, donGia);
		this.doiTuong = doiTuong;
	}

	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		tinhHoaDonVietnamese();
		boolean flag = true;
		do {
			System.out.print("Nhập doi tuong: ");
			System.out.println("1.Dien Sinh Hoat");
			System.out.println("2. Dien Kinh Doanh");
			System.out.println("3. Dien San Xuat");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				doiTuong = "Dien Sinh Hoat";
				flag = false;
				break;
			case 2:
				doiTuong = "Dien Kinh Doanh";
				flag = false;
				break;
			case 3:
				doiTuong = "Dien San Xuat";
				flag = false;
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Đối tượng khách hàng  " + this.doiTuong 
				+ "\t Tổng hóa đơn: " + this.thanhTien);

	}
	
	//5. business methods
	
	public void tinhHoaDonVietnamese() {
		if (this.soluongKWTieuThu <= DINHMUC) {
			this.thanhTien = this.soluongKWTieuThu*this.donGia;
		} else {
			this.thanhTien = this.donGia*DINHMUC + (this.soluongKWTieuThu-DINHMUC)*this.donGia*2.5f;
		}
	}

}
