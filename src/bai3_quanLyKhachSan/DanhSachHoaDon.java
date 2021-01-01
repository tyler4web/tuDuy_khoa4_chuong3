package bai3_quanLyKhachSan;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: Xử lý nghiệp vụ liên quan đến quan ly khach san
 * Người tạo:Bui Quoc Trieu
 * Ngày tạo: 2/1/2021
 * Version:1.0
 * */
public class DanhSachHoaDon {
	// 1. attributes
	private ArrayList<HoaDon> listHoaDon;
	private float thanhTienGio;
	private float thanhTienNgay;

	// 2, get, set
	public ArrayList<HoaDon> getListHoaDon() {
		return listHoaDon;
	}

	public void setListHoaDon(ArrayList<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}

	public float getThanhTienGio() {
		return thanhTienGio;
	}

	public float getThanhTienNgay() {
		return thanhTienNgay;
	}

	// 3. constructors

	public DanhSachHoaDon() {
		listHoaDon = new ArrayList<HoaDon>();
		this.thanhTienGio = 0;
		this.thanhTienNgay = 0;
	}

	// 4. input, out
	public void nhap(Scanner scan) {
		HoaDon hd;
		boolean flag = true;
		do {
			System.out.println("Nhập 1. Tinh tien theo gio");
			System.out.println("Nhập 2. Tinh tien theo ngay");
			System.out.println("Nhập 0. thoat");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				hd = new HoaDonGio();
				hd.nhap(scan);
				this.listHoaDon.add(hd);
				break;
			case 2:
				hd = new HoaDonNgay();
				hd.nhap(scan);
				this.listHoaDon.add(hd);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);

	}

	public void xuat() {
		for (HoaDon hd : this.listHoaDon) {
			hd.xuat();
		}
	}
	
	// 5. business method
	
	
	

}
