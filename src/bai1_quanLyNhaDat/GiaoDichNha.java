package bai1_quanLyNhaDat;
import java.util.Scanner;

/*
 * Mục đích: quan ly mua ban NHA loai A
 * Người tạo:Bui Quoc Trieu
 * Ngày tạo: 1/1/2021
 * Version:1.0
 * */
public class GiaoDichNha extends GiaoDich{
	   //1. attributes
	private int loaiNha;
	private String diaChi;
//	private float doanhThu;
	
	//2. get, set

	public int getloaiNha() {
		return loaiNha;
	}

	public void setloaiNha(int loaiNha) {
		this.loaiNha = loaiNha;
	}
	
	public float getDoanhThu() {
		return doanhThu;
	}	
	
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

		//3. constructor
		public GiaoDichNha() {
			super();
		}

		public GiaoDichNha(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich) {
			super(maGiaoDich, ngayGD, thangGD, namGD, donGia, dienTich);
			this.loaiNha =loaiNha;
			this.diaChi = diaChi;
			// TODO Auto-generated constructor stub
		}
		
		public GiaoDichNha(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich, int loaiNha, String diaChi) {
			super(maGiaoDich, ngayGD, thangGD, namGD, donGia, dienTich);
			this.loaiNha =loaiNha;
			this.diaChi = diaChi;
			
		}

		//4. input, output
		@Override
		public void nhap(Scanner scan) {
			super.nhap(scan);
			boolean flag = true;
			do {
				System.out.print("Nhập loai Nha: ");
				System.out.println("1. Nha Cao Cap");
				System.out.println("2. Nha Thuong");
				
				int chon = Integer.parseInt(scan.nextLine());
				switch (chon) {
				case 1: 
					this.loaiNha = 1;
					flag=false;
					break;
				case 2: 
					this.loaiNha =2;
					flag=false;
					break;
				}
			}while(flag);
					
			System.out.print("Nhập dia chi: ");
			this.diaChi = scan.nextLine();
//	
		}
		
		@Override 
		public void xuat() {
			super.xuat();
			System.out.println("\t Loai Nha: " + this.loaiNha + "\t dia chi: " + this.diaChi);
		}
		
		//5. business
		//tinh doanh thu giao dich Dat
//		public void tinhDoanhThuNha () {
//			
//			if (this.loaiNha == 1) {//nha cao cap
//				this.doanhThu = this.dienTich * this.donGia;
//			} else {//nha thuong
//				this.doanhThu = this.dienTich * this.donGia *90/100;
//			}
//		}
		
		

}
