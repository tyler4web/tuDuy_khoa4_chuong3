package bai3_quanLyKhachSan;

import java.util.Scanner;

/*
 * Mục đích: Lớp cha quản lý các hoa don theo gio
 * Người tạo: Bui Quoc Trieu
 * Ngày tạo: 1/1/2021
 * Version:1.0
 * */
public class HoaDonNgay extends HoaDon {
	// 1. attributes
//	private float soGioThue;
	private float soNgayThue;

	// 2. get, set

	public float getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(float soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	// 3. constructor

	public HoaDonNgay() {
		super();
	}

	public HoaDonNgay(int maHD, int ngayHD, int thangHD, int namHD, int maPhong, String tenKH, float donGiaNgay, float soNgayThue) {
		super(maHD, ngayHD, thangHD, namHD, maPhong, tenKH, soNgayThue);
//		this.soGioThue = soGioThue;
		this.soNgayThue = soNgayThue;
		this.donGiaNgay = donGiaNgay;
	}

	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Vui long nhap so ngay thue: ");
		this.soNgayThue = Integer.parseInt(scan.nextLine());
		System.out.println("Vui long nhap don gia theo ngay: ");
		this.donGiaNgay = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		
		System.out.println("\t So ngay thue: " + this.soNgayThue +"\t Đơn giá theo ngay: " + this.donGiaNgay + "\t Thanh tien theo ngay: " + this.thanhTien);
	}

	// 5. business
	public void tinhThanhTienTheoNgay() {
		this.thanhTien = this.donGiaNgay * this.soNgayThue;
	}

}
