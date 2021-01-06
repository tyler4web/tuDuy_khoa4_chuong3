package bai2_hoaDonTienDien;

import java.util.Scanner;

/*
 * Mục đích: Lớp cha quản lý khach hang nuoc ngoai
 * Người tạo: Bui Quoc Trieu
 * Ngày tạo:1/1/2021
 * Version: 1.0
 * */
public class KhachHangNuocNgoai extends KhachHang {
	// 1. attributes
	private String quocTich;
	// 2. get, set

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	// 3. constructors
	public KhachHangNuocNgoai() {
		super();
	}

	public KhachHangNuocNgoai(int maKH, String hoTenKH, int ngayHoaDon, int thangHoaDon, int namHoaDon,
			float soluongKWTieuThu, float donGia, String quocTich) {
		super(maKH, hoTenKH, ngayHoaDon, thangHoaDon, namHoaDon, soluongKWTieuThu, donGia);
		this.quocTich = quocTich;
	}

	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		tinhHoaDonForeigner();
		System.out.print("Nhập quoc tich: ");
		this.quocTich = scan.nextLine();

	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Quoc tich  " + this.quocTich + "\t Tổng hóa đơn: " + this.thanhTien);

	}

	// 5. business methods

	public void tinhHoaDonForeigner() {
		this.thanhTien = this.soluongKWTieuThu * this.donGia;
	}

}
