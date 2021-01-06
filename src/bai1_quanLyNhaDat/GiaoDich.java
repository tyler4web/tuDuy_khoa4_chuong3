/*
 * Mục đích: Lớp cha quản lý các giao dich
 * Người tạo: Bui Quoc Trieu
 * Ngày tạo: 1/1/2021
 * Version:1.0
 * */

package bai1_quanLyNhaDat;

import java.util.Scanner;

public class GiaoDich {
	// 1. Attributes
	protected int maGiaoDich;
	protected int ngayGD;
	protected int thangGD;
	protected int namGD;
	protected float donGia;
	protected float dienTich;
	protected float doanhThu;

	// 2. Get, set
	public int getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public int getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(int ngayGD) {
		this.ngayGD = ngayGD;
	}

	public int getThangGD() {
		return thangGD;
	}

	public void setThangGD(int thangGD) {
		this.thangGD = thangGD;
	}

	public int getNamGD() {
		return namGD;
	}

	public void setNamGD(int namGD) {
		this.namGD = namGD;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public float getDienTich() {
		return dienTich;
	}

	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}
	public float getDoanhThu() {
		return doanhThu;
	}	
	
	// 3. constructors
	public GiaoDich() {
		this.doanhThu =0;
	}

	public GiaoDich(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich) {
//		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGD = ngayGD;
		this.thangGD = thangGD;
		this.namGD = namGD;
		this.donGia = donGia;
		this.dienTich = dienTich;

	}

	// 4. input, output
	public void nhap(Scanner scan) {
		System.out.print("Nhập mã giao dịch: ");
		this.maGiaoDich = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập ngày giao dịch: ");
		this.ngayGD = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập tháng giao dịch: ");
		this.thangGD = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập năm giao dịch: ");
		this.namGD = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập đơn giá: ");
		this.donGia = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập diện tích: ");
		this.dienTich = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Mã giao dịch: " + this.maGiaoDich + "\t Ngày giao dịch: " + this.ngayGD
				+ "\t Thang giao dịch: " + this.thangGD + "\t Nam giao dịch: " + this.namGD + "\t Đơn giá: "
				+ this.donGia + "\t Diện tích: " + this.dienTich + "\t Thanh tien: " + this.doanhThu);
	}

}
