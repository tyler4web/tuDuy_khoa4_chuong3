package bai2_hoaDonTienDien;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: Danh sach hoa don tien dien cua 2 loai khach hang
 * Người tạo: Bui Quoc Trieu
 * Ngày tạo:1/1/2021
 * Version: 1.0
 * */
public class DanhSachHoaDon {
	// 1. attributes
		private ArrayList<KhachHang> listKhachHang;
		private int SlVietnamese;
		private int SlForeigner;
		private float TbHoaDonForeigner;
		private float hoaDonVietnamese;
		private float hoaDonForeigner;
		
		// 2, get, set
		public ArrayList<KhachHang> getListKhachHang() {
			return listKhachHang;
		}
		
		public void setListKhachHang(ArrayList<KhachHang> listKhachHang) {
			this.listKhachHang = listKhachHang;
		}

		public int getSlVietnamese() {
			return SlVietnamese;
		}
		public int getSlForeigner() {
			return SlForeigner;
		}
		public float getTbHoaDonForeigner() {
			return TbHoaDonForeigner;
		}
		public float getHoaDonVietnamese() {
			return hoaDonVietnamese;
		}
		public float getHonDonForeigner() {
			return hoaDonForeigner;
		}
		
		// 3. constructors
		public DanhSachHoaDon() {
			listKhachHang = new ArrayList<KhachHang>();
		}
		
		// 4. input, out
		public void nhap(Scanner scan) {
			boolean flag = true;
			KhachHang khachHang;
			do {
				System.out.println("Nhập 1. Khach Hang Viet Nam");
				System.out.println("Nhập 2. Khach Hang Nuoc Ngoai");
				System.out.println("Nhập 0. Thoát nhập");
				int chon = Integer.parseInt(scan.nextLine());
				switch (chon) {
				case 1:
					khachHang = new KhachHangVietNam();
					khachHang.nhap(scan);
					this.listKhachHang.add(khachHang);
					this.SlVietnamese = tinhSlVietnamese();					
					break;
				case 2:
					khachHang = new KhachHangNuocNgoai();
					khachHang.nhap(scan);
					this.listKhachHang.add(khachHang);
					this.SlForeigner = tinhSlForeigner();
					this.TbHoaDonForeigner =tinhTbHoaDonForeigner();
					break;
				case 0:
					flag = false;
					break;
				}
			} while (flag);
		}
		
		public void xuat() {
			for (KhachHang kh : this.listKhachHang) {
				kh.xuat();
			}
			
			System.out.println("So luong hoa don nguoi Viet nam:" + this.SlVietnamese);
			System.out.println("So luong hoa don nguoi nuoc ngoai:" + this.SlForeigner);
			
			System.out.println("Trung binh hoa don nguoi nuoc ngoai: " + this.TbHoaDonForeigner);
		}
		
		// 5. business
	// Tinh so luong khach hang Viet Nam
		public int tinhSlVietnamese() {
			this.SlVietnamese =0;
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangVietNam) { 
					this.SlVietnamese++;
				}
			}
			
			return this.SlVietnamese;
		}
		
		// Tinh so luong khach hang nuoc ngoai
		public int tinhSlForeigner() {
			this.SlForeigner =0;
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangNuocNgoai) { 
					this.SlForeigner++;
				}
			}
			
			return this.SlForeigner;
		}
		
		//Tinh tien dien khach hang Viet Nam
		public float tinhTbHoaDonForeigner() {
			this.hoaDonForeigner =0;
			this.TbHoaDonForeigner = 0;
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangNuocNgoai) { 
					this.hoaDonForeigner += kh.getThanhTien();
				}
			}
			this.TbHoaDonForeigner = this.hoaDonForeigner/this.SlForeigner;
			
			return this.TbHoaDonForeigner;
		}
		
		public void xuatHDTheoThoiGian() {
			for (KhachHang kh : this.listKhachHang) {
				if (kh.thangHoaDon == 9 && kh.namHoaDon == 2013) {
					kh.xuat();
				}
			}
		}
		
}
