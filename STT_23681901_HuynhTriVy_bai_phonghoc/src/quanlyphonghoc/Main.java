package quanlyphonghoc;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachPhongHoc quanLyPhongHoc = new DanhSachPhongHoc();

		Scanner scanner = new Scanner(System.in);
		quanLyPhongHoc.themPhongHoc(new PhongLyThuyet("LT101", "A1", 100, 10, true));
		quanLyPhongHoc.themPhongHoc(new PhongMayTinh("MT201", "B2", 80, 12, 30));
		quanLyPhongHoc.themPhongHoc(new PhongThiNghiem("TN301", "C3", 120, 15, "Hoa Hoc", 20, true ));
		quanLyPhongHoc.themPhongHoc(new PhongLyThuyet("LT102", "A2", 110, 9, false));
		quanLyPhongHoc.themPhongHoc(new PhongMayTinh("MT202", "B3", 90, 10, 40));
		quanLyPhongHoc.themPhongHoc(new PhongThiNghiem("TN302", "C4", 130, 20, "Vat Ly", 25, true ));
		int choice;

		do {
		 System.out.println("---------------------Menu---------------------");
		 System.out.println("1. Them phong hoc");
		 System.out.println("2. Tim phong hoc theo ma");
		 System.out.println("3. Hien thi danh sach phong hoc");
		 System.out.println("4. Hien thi danh sach phong hoc dat chuan");
		 System.out.println("5. Sap xep theo day nha");
		 System.out.println("6. Sap xep theo dien tich giam dan");
		 System.out.println("7. Sap xep theo so bong den tang dan");
		 System.out.println("8. Cap nhat so may tinh cho phong may tinh");
		 System.out.println("9. Xoa phong hoc theo ma");
		 System.out.println("10. Hien thi tong so phong hoc");
		 System.out.println("11. Hien thi phong may co 60 may");
		 System.out.println("0. Thoat");
		 System.out.println("Ban chon: ");
		 choice = scanner.nextInt();

		 switch (choice) {
		 case 1:
			 //Them phong hoc
			 System.out.println("1. Phong ly thuyet");
			 System.out.println("2. Phong may tinh");
			 System.out.println("3. Phong thi nghiem");
			 System.out.println("Chon loai phong hoc: ");
			 int loaiPhong = scanner.nextInt();
			 switch (loaiPhong) {
				case 1:
					System.out.println("Nhap ma phong: ");
					scanner.nextLine();
					String maPhongLT = scanner.nextLine();
					System.out.println("Nhap day nha: ");
					String dayNhaLT = scanner.nextLine();
					System.out.println("Nhap dien tich: ");
					double dienTichLT = scanner.nextDouble();
					System.out.println("Nhap so bong den: ");
					int soBongDenLT = scanner.nextInt();
					System.out.println("Phong co may chieu: ");
					boolean coMayChieu = scanner.nextBoolean();
					quanLyPhongHoc
							.themPhongHoc(new PhongLyThuyet(maPhongLT, dayNhaLT, dienTichLT, soBongDenLT, coMayChieu));
					break;
			 }
			 break;
		 case 2:
			 System.out.println("Nhap ma phong can tim: ");
			 scanner.nextLine();
			 String maPhong = scanner.nextLine();
			 PhongHoc foudPhong = quanLyPhongHoc.timPhongHocTheoMa(maPhong);
			 if(foudPhong != null) {
                 System.out.println("Phong hoc duoc tim thay:" + foudPhong);
                 } else {
                	 System.out.println("Khong tim thay phong hoc" + maPhong);
                 }
		case 3:
			List<PhongHoc> danhSachPhongHoc = quanLyPhongHoc.layDanhSachPhongHoc();
			for (PhongHoc phongHoc : danhSachPhongHoc) {
                System.out.println(phongHoc);
            }
			break;
		case 4:
			List<PhongHoc> phongDatChuan = quanLyPhongHoc.layDanhSachPhongHoc();
			for (PhongHoc phongHoc : phongDatChuan) {
                if (phongHoc.datChuan()) {
                    System.out.println(phongHoc);
                }
            }
			break;

		case 5:
			//Sap xep theo day nha
			quanLyPhongHoc.sapXepTheoDayNha();
		    break;
		case 6:
			//Sap xep theo dien tich giam dan
			quanLyPhongHoc.sapXepTheoDayNha();
			break;
		 case 7:
			 //Sap xep theo so bong den tang dan
			 quanLyPhongHoc.sapXepTheoSoBongDen();
			 break;
		 case 8:
			 //Cap nhat so may tinh cho phong may tinh
			 System.out.print("Nhập mã phòng máy tính: ");
             scanner.nextLine();
             String maPhongMayTinh = scanner.nextLine();
             System.out.print("Nhập số máy tính mới: ");
             int soMayTinhMoi = scanner.nextInt();
             quanLyPhongHoc.capNhatSoMayTinh(maPhongMayTinh, soMayTinhMoi);
             break;

	     case 9:
	    	 //Xoa phong hoc theo ma
	    	 System.out.println("Nhap ma phong can xoa:");
	    	 scanner.nextLine();
	    	 String maPhongCanXoa = scanner.nextLine();
	    	 quanLyPhongHoc.xoaPhongHocTheoMa(maPhongCanXoa);
	    	 break;
	     case 10:
	    	 //Hien thi tong so phong hoc

	    	 int  tongSoPhongHOc = quanLyPhongHoc.tongSoPhongHoc();
	    	 System.out.println("Tong so phong hoc la: " + tongSoPhongHOc);
	    	 break;

	     case 11:
	    	//Hien thi phong may co 60 may
	    	 List<PhongMayTinh> phongMayCo60May = quanLyPhongHoc.layPhongMayTinhCo60May();
        	 for (PhongMayTinh phongMay : phongMayCo60May) {
                 System.out.println(phongMay);
             }
        	 break;
        	 case 0:
        		 System.out.println("Cam on ban da su dung dich vu cua chung toi");
        		 break;
                default:
                	System.out.println("Lua chon khong hop le");
                	break;
		 }
		} while (choice != 0);

	}
}