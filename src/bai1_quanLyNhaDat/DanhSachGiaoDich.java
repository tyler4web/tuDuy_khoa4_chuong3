package bai1_quanLyNhaDat;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: Xử lý nghiệp vụ liên quan đến danh sách giao dich nha va dat
 * Người tạo:Bui Quoc Trieu
 * Ngày tạo: 1/1/2021
 * Version:1.0
 * */

public class DanhSachGiaoDich {

	// 1. attributes
	private ArrayList<GiaoDich> listGiaoDich;
	private float tongDoanhThu;
	private float doanhThuNha;
	private float doanhThuDat;
	private int SLGiaoDichNha;
	private int SLGiaoDichDat;
	private float TBGiaoDichDat;

	// 2, get, set
	public ArrayList<GiaoDich> getListGiaoDich() {
		return listGiaoDich;
	}

	public void setListGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	public float getTongDoanhThu() {
		return tongDoanhThu;
	}

	public float getDoanhThuNha() {
		return doanhThuNha;
	}

	public float getDoanhThuDat() {
		return doanhThuDat;
	}

	public int getSLGiaoDichNha() {
		return SLGiaoDichNha;
	}

	public int getSLGiaoDichDat() {
		return SLGiaoDichDat;
	}

	public float getTBGiaoDichDat() {
		return TBGiaoDichDat;
	}

	// 3. constructors
	public DanhSachGiaoDich() {
		listGiaoDich = new ArrayList<GiaoDich>();
		this.SLGiaoDichDat = 0;
		this.SLGiaoDichNha = 0;

	}

	// 4. input, out
	public void nhap(Scanner scan) {
		boolean flag = true;
		GiaoDich giaoDich;
		do {
			System.out.println("Nhập 1. Giao Dich Dat");
			System.out.println("Nhập 2. Giao Dich Nha");
			System.out.println("Nhập 0. thoat");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				giaoDich = new GiaoDichDat();
				giaoDich.nhap(scan);
				this.listGiaoDich.add(giaoDich);
				break;
			case 2:
				giaoDich = new GiaoDichNha();
				giaoDich.nhap(scan);
				this.listGiaoDich.add(giaoDich);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}

	public void xuat() {
		for (GiaoDich gd : this.listGiaoDich) {
			gd.xuat();
		}
		System.out.println("Tong doanh thu ca nha va dat:" + this.tongDoanhThu);
		System.out.println("So tien trung binh giao dich dat: " + this.TBGiaoDichDat);
	}

	public void xuatSLGiaoDich() {
		System.out.println("So Luong Giao Dich Dat: " + this.SLGiaoDichDat);
		System.out.println("So Luong Giao Dich Nha: " + this.SLGiaoDichNha);
	}

	public void xuatGDTheoThoiGian() {
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichDat) {
				if (gd.thangGD == 9 && gd.namGD == 2013) {
					gd.xuat();
				}
			}
		}
	}

	// 5. business

	public void init() {
		tinhDoanhThuDat();
		tinhDoanhThuNha();
		tinhSoLuongGiaoDichDat();
		tinhSoLuongGiaoDichNha();
		tinhTongDoanhThu();
		tinhTBGiaoDichDat();
	}

	public void tinhTongDoanhThu() {
		this.tongDoanhThu = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			this.tongDoanhThu += gd.getDoanhThu();
		}
	}

	public void tinhDoanhThuDat() {
		this.doanhThuDat = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichDat) {
				if (((GiaoDichDat) gd).getLoaiDat().equalsIgnoreCase("a")) {
					gd.doanhThu = gd.dienTich * gd.donGia;
				} else {
					gd.doanhThu = gd.dienTich * gd.donGia * 1.5f;
				}

				this.doanhThuDat += gd.getDoanhThu();
			}
		}
	}

	public void tinhDoanhThuNha() {
//		this.doanhThuNha = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichNha) {
				if (((GiaoDichNha) gd).getloaiNha() == 1) {// nha cao cap
					gd.doanhThu = gd.dienTich * gd.donGia;
				} else {// nha thuong
					gd.doanhThu = gd.dienTich * gd.donGia * 90 / 100;
				}
			}
		}
	}

	public void tinhSoLuongGiaoDichDat() {
		this.SLGiaoDichDat = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichDat) {
				this.SLGiaoDichDat++;
			}
		}
	}

	public void tinhSoLuongGiaoDichNha() {
		this.SLGiaoDichNha = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichNha) {
				this.SLGiaoDichNha++;
			}
		}
	}

	public void tinhTBGiaoDichDat() {
		this.TBGiaoDichDat = this.doanhThuDat / this.SLGiaoDichDat;
	}

	public void dummyData() {
		GiaoDich giaoDich;
		giaoDich = new GiaoDichDat(1, 1, 9, 2013, 100, 10, "b");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichDat(2, 1, 7, 2013, 200, 20, "c");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichDat(3, 1, 8, 2013, 300, 30, "a");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichDat(4, 1, 9, 2013, 400, 40, "b");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichDat(5, 1, 9, 2013, 500, 50, "a");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichNha(6, 1, 9, 2013, 100, 10, 1, "1 Hai Ba Trung");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichNha(7, 1, 9, 2013, 200,20,2,"2 Hai Ba Trung");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichNha(8, 1, 9, 2013, 300,30,1,"2 Hai Ba Trung");
		this.listGiaoDich.add(giaoDich);
		
	}

}
