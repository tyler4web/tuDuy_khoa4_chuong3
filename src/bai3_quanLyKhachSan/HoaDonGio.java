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

	public HoaDonGio(int maHD, int ngayHD, int thangHD, int namHD, int maPhong, String tenKH, float donGia,
			float soGioThue) {
		super(maHD, ngayHD, thangHD, namHD, maPhong, tenKH, donGia);
		this.soGioThue = soGioThue;
	}
	
	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
	System.out.println("Vui long nhap so gio thue: ");
	this.soGioThue = Integer.parseInt(scan.nextLine());
	System.out.println("Vui long nhap don gia theo gio: ");
	this.donGia = Float.parseFloat(scan.nextLine());
	this.thanhTien = tinhThanhTienTheoGio();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t số giờ thuê: " + this.soGioThue
				+ "\t Đơn giá theo giờ: " + this.donGia
				+ "\t Thanh tien theo gio: " + this.thanhTien);
	}
	
	// 5. business
	public float tinhThanhTienTheoGio() {
		float thanhTienGio = 0;
		if (this.soGioThue < 24) {
			thanhTienGio = this.soGioThue * this.donGia;
		} else if (this.soGioThue >= 24 &&this.soGioThue < 30 ) {
			thanhTienGio = 24 * this.donGia;
		}
		return thanhTienGio;
	}
	
	
	

	
	
}
