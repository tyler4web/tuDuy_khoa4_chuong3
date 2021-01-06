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
					break;
				case 2:
					khachHang = new KhachHangNuocNgoai();
					khachHang.nhap(scan);
					this.listKhachHang.add(khachHang);
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
			System.out.println("**********************************");
			System.out.println("So luong hoa don nguoi Viet nam:" + this.SlVietnamese);
			System.out.println("So luong hoa don nguoi nuoc ngoai:" + this.SlForeigner);
			System.out.println("**********************************");
			System.out.println("Trung binh hoa don nguoi nuoc ngoai: " + this.TbHoaDonForeigner);
			System.out.println("**********************************");
		}
		
		// 5. business
		//Ham goi ham
		public void init() {
			tinhSlVietnamese();
			tinhSlForeigner();
			tinhHDVietnamese();
			tinhHDForeigner();
			tinhTbHoaDonForeigner();
		}
		
		//tinh hoa don vietnamese
		public void tinhHDVietnamese() {
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangVietNam) { 
					((KhachHangVietNam) kh).tinhHoaDonVietnamese();
				}
			}
		}
		
		public void tinhHDForeigner() {
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangNuocNgoai) { 
					((KhachHangNuocNgoai) kh).tinhHoaDonForeigner();
				}
			}
		}
		
	// Tinh so luong khach hang Viet Nam
		public void tinhSlVietnamese() {
			this.SlVietnamese =0;
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangVietNam) { 
					this.SlVietnamese++;
				}
			}
			
		}
		
		// Tinh so luong khach hang nuoc ngoai
		public void tinhSlForeigner() {
			this.SlForeigner =0;
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangNuocNgoai) { 
					this.SlForeigner++;
				}
			}
			
		}
		
		//Tinh tien dien khach hang Viet Nam
		public void tinhTbHoaDonForeigner() {
			this.hoaDonForeigner =0;
			this.TbHoaDonForeigner = 0;
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangNuocNgoai) { 
					this.hoaDonForeigner += kh.getThanhTien();
				}
			}
			this.TbHoaDonForeigner = this.hoaDonForeigner/this.SlForeigner;
			
		}
		
		public void xuatHDTheoThoiGian() {
			for (KhachHang kh : this.listKhachHang) {
				if (kh.thangHoaDon == 9 && kh.namHoaDon == 2013) {
					kh.xuat();
				}
			}
		}
		
		public void dummyData() {
			KhachHang kh;
			kh = new KhachHangVietNam(1, "nobita", 1, 9, 2013, 10, 10, 1);
			this.listKhachHang.add(kh);
			kh = new KhachHangVietNam(2, "Doreamon", 2, 2, 2013, 200, 20, 2);
			this.listKhachHang.add(kh);
			kh = new KhachHangVietNam(3, "xuka", 3, 9, 2013, 30, 300, 3);
			this.listKhachHang.add(kh);
			kh = new KhachHangVietNam(4, "xeko", 4, 9, 2013, 40, 40, 1);
			this.listKhachHang.add(kh);
			kh = new KhachHangVietNam(5, "chainen", 5, 5, 2013, 40, 40, 2);
			this.listKhachHang.add(kh);
			kh = new KhachHangNuocNgoai(6,"naruto",6,9,2013,10,10,"nhat ban");
			this.listKhachHang.add(kh);
			kh = new KhachHangNuocNgoai(7,"kakashi",7,7,2013,20,20,"nhat ban");
			this.listKhachHang.add(kh);
			kh = new KhachHangNuocNgoai(8,"sasuke",6,9,2013,30,30,"nhat ban");
			this.listKhachHang.add(kh);
			kh = new KhachHangNuocNgoai(9,"boruto",6,7,2013,40,40,"nhat ban");
			this.listKhachHang.add(kh);
			kh = new KhachHangNuocNgoai(10,"kaido",6,9,2013,50,50,"nhat ban");
			this.listKhachHang.add(kh);


		}
		
}
