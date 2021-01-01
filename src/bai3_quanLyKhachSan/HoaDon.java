package bai3_quanLyKhachSan;

import java.util.Scanner;

/*
 * Mục đích: Lớp cha quản lý các hoa don
 * Người tạo: Bui Quoc Trieu
 * Ngày tạo: 1/1/2021
 * Version:1.0
 * */

public class HoaDon {
	// 1. Attributes
		protected int maHD;
		protected int ngayHD;
		protected int thangHD;
		protected int namHD;
		protected int maPhong;
		protected String tenKH;
		protected float donGia;
		protected float thanhTien;
		
//2. Get, Set
		public int getMaHD() {
			return maHD;
		}
		public void setMaHD(int maHD) {
			this.maHD = maHD;
		}
		public int getNgayHD() {
			return ngayHD;
		}
		public void setNgayHD(int ngayHD) {
			this.ngayHD = ngayHD;
		}
		public int getThangHD() {
			return thangHD;
		}
		public void setThangHD(int thangHD) {
			this.thangHD = thangHD;
		}
		public int getNamHD() {
			return namHD;
		}
		public void setNamHD(int namHD) {
			this.namHD = namHD;
		}
		public int getMaPhong() {
			return maPhong;
		}
		public void setMaPhong(int maPhong) {
			this.maPhong = maPhong;
		}
		public String getTenKH() {
			return tenKH;
		}
		public void setTenKH(String tenKH) {
			this.tenKH = tenKH;
		}
		public float getDonGia() {
			return donGia;
		}
		public void setDonGia(float donGia) {
			this.donGia = donGia;
		}
		public float getThanhTien() {
			return thanhTien;
		}
		// 3. constructors
		public HoaDon() {
			this.donGia = 0;
			this.thanhTien =0;
		}
		public HoaDon(int maHD, int ngayHD, int thangHD, int namHD, int maPhong, String tenKH, float donGia) {
			super();
			this.maHD = maHD;
			this.ngayHD = ngayHD;
			this.thangHD = thangHD;
			this.namHD = namHD;
			this.maPhong = maPhong;
			this.tenKH = tenKH;
			this.donGia = donGia;
		}
		
		// 4. input, output
		public void nhap(Scanner scan) {
			System.out.print("Nhập mã hóa đơn: ");
			this.maHD = Integer.parseInt(scan.nextLine());
			System.out.print("Nhập ngày hóa đơn: ");
			this.ngayHD = Integer.parseInt(scan.nextLine());
			System.out.print("Nhập tháng hóa đơn: ");
			this.thangHD = Integer.parseInt(scan.nextLine());
			System.out.print("Nhập năm hóa đơn: ");
			this.namHD = Integer.parseInt(scan.nextLine());
			System.out.print("Nhập tên khách hàng: ");
			this.tenKH = scan.nextLine();
			System.out.print("Nhập mã phòng: ");
			this.maPhong = Integer.parseInt(scan.nextLine());
//			System.out.print("Nhập đơn giá: ");
//			this.donGia = Float.parseFloat(scan.nextLine());
			
		}
		
		public void xuat() {
			System.out.print("Mã hóa đơn: " + this.maHD + "\t Ngày : " + this.ngayHD
					+ "\t Tháng: " + this.thangHD + "\t Năm: " + this.namHD + "\t Đơn giá: "
					+ this.donGia + "\t Tên Khách Hàng: " + this.tenKH
					+ "\t Mã phòng: " + this.maPhong			
					);
		}
		
		//5. business method
}
