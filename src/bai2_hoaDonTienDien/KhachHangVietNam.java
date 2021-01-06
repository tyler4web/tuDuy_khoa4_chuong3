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
	public static int DINHMUC = 100;
	private int doiTuong;
	// 2. get, set

	public int getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(int doiTuong) {
		this.doiTuong = doiTuong;
	}

	// 3. constructors
	public KhachHangVietNam() {
		super();
	}

	public KhachHangVietNam(int maKH, String hoTenKH, int ngayHoaDon, int thangHoaDon, int namHoaDon,
			float soluongKWTieuThu, float donGia, int doiTuong) {
		super(maKH, hoTenKH, ngayHoaDon, thangHoaDon, namHoaDon, soluongKWTieuThu, donGia);
		this.doiTuong = doiTuong;
	}

	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		boolean flag = true;
		do {
			System.out.print("Nhập doi tuong: ");
			System.out.println("1.Dien Sinh Hoat");
			System.out.println("2. Dien Kinh Doanh");
			System.out.println("3. Dien San Xuat");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				this.doiTuong = 1;// 1.Dien Sinh Hoat"
				break;
			case 2:
				this.doiTuong = 2;// 2. Dien Kinh Doanh
				break;
			case 3:
				this.doiTuong = 3;// 3."3. Dien San Xuat"
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui long 1, 2 hoac 3.");
			}
		} while (flag);
	}

	@Override
	public void xuat() {
		super.xuat();
		if (this.doiTuong == 1) {
			System.out.println("\t Đối tượng khách hàng: Dien Sinh Hoat  " + "\t Tổng hóa đơn: " + this.thanhTien);
		} else if (this.doiTuong == 2) {
			System.out.println("\t Đối tượng khách hàng: Dien Kinh Doanh  " + "\t Tổng hóa đơn: " + this.thanhTien);
		} else {
			System.out.println("\t Đối tượng khách hàng: Dien San Xuat  " + "\t Tổng hóa đơn: " + this.thanhTien);
		}
	}
	// 5. business methods

	public void tinhHoaDonVietnamese() {
		if (this.soluongKWTieuThu <= DINHMUC) {
			this.thanhTien = this.soluongKWTieuThu * this.donGia;
		} else {
			this.thanhTien = this.donGia * DINHMUC + (this.soluongKWTieuThu - DINHMUC) * this.donGia * 2.5f;
		}
	}

}
