package bai3_quanLyKhachSan;

import java.util.ArrayList;
import java.util.Scanner;

import bai2_hoaDonTienDien.KhachHangVietNam;

/*
 * Mục đích: Xử lý nghiệp vụ liên quan đến quan ly khach san
 * Người tạo:Bui Quoc Trieu
 * Ngày tạo: 2/1/2021
 * Version:1.0
 * */
public class DanhSachHoaDon {
	// 1. attributes
	private ArrayList<HoaDon> listHoaDon;
//	protected float tien;

	// 2, get, set
	public ArrayList<HoaDon> getListHoaDon() {
		return listHoaDon;
	}

	public void setListHoaDon(ArrayList<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}


	// 3. constructors

	public DanhSachHoaDon() {
		listHoaDon = new ArrayList<HoaDon>();

	}

	public DanhSachHoaDon(ArrayList<HoaDon> listHoaDon) {
		super();
		this.listHoaDon = listHoaDon;
	}

	// 4. input, out
	public void nhap(Scanner scan) {
		HoaDon hd;
		boolean flag = true;
		do {
			System.out.println("Nhập 1. Tinh tien theo gio");
			System.out.println("Nhập 2. Tinh tien theo ngay");
			System.out.println("Nhập 0. thoat va xuat danh sach hoa don");
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
	public void init() {
		tinhTien();
	}

	public void tinhTien() {
		for (HoaDon hd : this.listHoaDon) {
			if (hd instanceof HoaDonGio) {

				((HoaDonGio) hd).tinhTienTheoGio();

			} else {
				((HoaDonNgay) hd).tinhThanhTienTheoNgay();
			}
		}
	}

	public void dummyData() {
		HoaDon hd;
		hd = new HoaDonGio(1, 1, 9, 2013, 1, "nobita", 10, 10);
		this.listHoaDon.add(hd);

		hd = new HoaDonGio(2, 1, 1, 2013, 1, "nobita", 25, 20);
		this.listHoaDon.add(hd);

		hd = new HoaDonGio(3, 1, 9, 2013, 1, "nobita", 30, 30);
		this.listHoaDon.add(hd);
		hd = new HoaDonGio(3, 1, 9, 2013, 1, "nobita", 40, 15);
		this.listHoaDon.add(hd);

		hd = new HoaDonNgay(4, 1, 9, 2013, 1, "xuka", 10, 1);
		this.listHoaDon.add(hd);

		hd = new HoaDonNgay(5, 1, 9, 2013, 1, "deki", 20, 2);
		this.listHoaDon.add(hd);

		hd = new HoaDonNgay(6, 1, 9, 2013, 1, "xeko", 30, 3);
		this.listHoaDon.add(hd);
	}

}