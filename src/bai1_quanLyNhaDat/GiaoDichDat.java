package bai1_quanLyNhaDat;

import java.util.Scanner;

/*
 * Mục đích: quan ly mua ban dat loai A
 * Người tạo:Bui Quoc Trieu
 * Ngày tạo: 1/1/2021
 * Version:1.0
 * */
public class GiaoDichDat extends GiaoDich {
	// 1. attributes
	private String loaiDat;

	// 2. get, set

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public float getDoanhThu() {
		return doanhThu;
	}

	// 3. constructor
	public GiaoDichDat() {
		super();
	}

	public GiaoDichDat(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich,
			String loaiDat, float doanhThu) {
		super(maGiaoDich, ngayGD, thangGD, namGD, donGia, dienTich);
	}
	
	public GiaoDichDat(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich,
			String loaiDat) {
		super(maGiaoDich, ngayGD, thangGD, namGD, donGia, dienTich);
		this.loaiDat = loaiDat;
		
	}

//	public GiaoDichDat(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich) {
//		super(maGiaoDich, ngayGD, thangGD, namGD, donGia, dienTich);
//		// TODO Auto-generated constructor stub
//		this.loaiDat = loaiDat;
//	}

	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		boolean stop = false;
		do {
			System.out.print("Nhập loai Dat: ");
			System.out.println("Vui long nhap loai a, b hoac c:");
			this.loaiDat = scan.nextLine();
			if (loaiDat.equalsIgnoreCase("a") || loaiDat.equalsIgnoreCase("b") || loaiDat.equalsIgnoreCase("c")) {
				stop = true;
			}
		} while (!stop);
		
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loai Dat: " + this.loaiDat);
	}

	// 5. business

	// tinh doanh thu giao dich Dat
//	public void tinhDoanhThuDat() {
//		this.doanhThu = 0;
//		if (this.loaiDat.equalsIgnoreCase("a")) {
//			this.doanhThu = this.dienTich * this.donGia;
//		} else {
//			this.doanhThu= this.dienTich * this.donGia * 1.5f;
//		}
//
//	}

}
