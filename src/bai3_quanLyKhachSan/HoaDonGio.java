package bai3_quanLyKhachSan;

import java.util.Scanner;

/*
 * Mục đích: Lớp cha quản lý các hoa don theo gio
 * Người tạo: Bui Quoc Trieu
 * Ngày tạo: 1/1/2021
 * Version:1.0
 * */
public class HoaDonGio extends HoaDon {
	// 1. attributes
	private float soGioThue;
	
	// 2. get, set
	public float getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(float soGioThue) {
		this.soGioThue = soGioThue;
	}
	
	// 3. constructor
	
	public HoaDonGio() {
		super();
	}

	public HoaDonGio(int maHD, int ngayHD, int thangHD, int namHD, int maPhong, String tenKH, float donGiaGio,
			float soGioThue) {
		super(maHD, ngayHD, thangHD, namHD, maPhong, tenKH, soGioThue);
		this.soGioThue = soGioThue;
		this.donGiaGio = donGiaGio;
	}
	
	
	
	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
	System.out.println("Vui long nhap so gio thue: ");
	this.soGioThue = Integer.parseInt(scan.nextLine());
	System.out.println("Vui long nhap don gia theo gio: ");
	this.donGiaGio = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t số giờ thuê: " + this.soGioThue
				+ "\t Đơn giá theo giờ: " + this.donGiaGio
				+ "\t Thanh tien theo gio: " + this.thanhTien);
	}
	
	// 5. business
	public void tinhTienTheoGio() {
		if (this.soGioThue < 24) {
			this.thanhTien = this.soGioThue * this.donGiaGio;
		} else if (this.soGioThue >= 24 &&this.soGioThue < 30 ) {
			this.thanhTien = 24 * this.donGiaGio;
		}
	}
	
	
	

	
	
}
