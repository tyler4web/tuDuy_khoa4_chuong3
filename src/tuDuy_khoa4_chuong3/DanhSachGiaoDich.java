package tuDuy_khoa4_chuong3;

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
				this.SLGiaoDichDat = tinhSoLuongGiaoDichDat();
				break;
			case 2:
				giaoDich = new GiaoDichNha();
				giaoDich.nhap(scan);
				this.listGiaoDich.add(giaoDich);
				this.SLGiaoDichNha = tinhSoLuongGiaoDichNha();
				break;
			case 0:
				this.tongDoanhThu = tinhTongDoanhThu();
				this.doanhThuDat = tinhDoanhThuDat();
				this.TBGiaoDichDat = tinhTBGiaoDichDat();
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
			if (gd.thangGD == 9 && gd.namGD == 2013) {
				gd.xuat();
			}
		}
	}

	// 5. business
	public float tinhTongDoanhThu() {
		this.tongDoanhThu = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			this.tongDoanhThu += gd.getDoanhThu();
		}

		return tongDoanhThu;
	}

	public float tinhDoanhThuDat() {
		this.doanhThuDat = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichDat) {

				this.doanhThuDat += gd.getDoanhThu();
			}
		}

		return doanhThuDat;
	}

	public void tinhDoanhThuNha() {
		this.doanhThuNha = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichNha) {

				this.doanhThuNha += gd.getDoanhThu();
			}
		}
	}

	public int tinhSoLuongGiaoDichDat() {
		this.SLGiaoDichDat = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichDat) {
				this.SLGiaoDichDat++;
			}
		}
		return this.SLGiaoDichDat;
	}

	public int tinhSoLuongGiaoDichNha() {
		this.SLGiaoDichNha = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichNha) {
				this.SLGiaoDichNha++;
			}
		}
		return this.SLGiaoDichNha;
	}

	public float tinhTBGiaoDichDat() {
		this.TBGiaoDichDat = this.doanhThuDat / this.SLGiaoDichDat;
		return TBGiaoDichDat;
	}

}
