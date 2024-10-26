package quanlyphonghoc;

import java.util.ArrayList;
import java.util.List;

public class DanhSachPhongHoc {

	private List<PhongHoc> danhSachPhongHoc;


	public DanhSachPhongHoc() {
		danhSachPhongHoc = new ArrayList<>();
	}


	//them mot phong hoc neu khong trung ma phong
	public void themPhongHoc(PhongHoc phongHoc) {
		if (!danhSachPhongHoc.contains(phongHoc)) {
			danhSachPhongHoc.add(phongHoc);
		}
	}


	//Tim kiem mot phong hoc theo ma phong
	public PhongHoc timPhongHocTheoMa(String maPhong) {
		for (PhongHoc phongHoc : danhSachPhongHoc) {
			if (phongHoc.getMaPhong().equals(maPhong)) {
				return phongHoc;
			}
		}
		return null;//khong tim thay
	}

	//phuong thuc lay thong tin toan bo danh sach phong hoc

	public List<PhongHoc> layDanhSachPhongHoc() {
		return danhSachPhongHoc;
	}

	//phuong thuc lay danh sach phong hoc dat chuan
	public List<PhongHoc> layDanhSachPhongHocDatChuan() {
		List<PhongHoc> danhSachPhongHocDatChuan = new ArrayList<>();
		for (PhongHoc phongHoc : danhSachPhongHoc) {
			if (phongHoc.datChuan()) {
				danhSachPhongHocDatChuan.add(phongHoc);
			}
		}
		return danhSachPhongHocDatChuan;
	}

	//sao sep danh sach tang dan theo day nha
	public void sapXepTheoDayNha() {
		danhSachPhongHoc.sort((ph1, ph2) -> ph1.getDayNha().compareTo(ph2.getDayNha()));
	}

	//sao sep danh sach tang dan theo dien tich
	public void sapXepTheoDienTich() {
		danhSachPhongHoc.sort((ph1, ph2) -> Double.compare(ph1.getDienTich(), ph2.getDienTich()));
	}

	//sao sep danh sach tang dan theo so bong den
	public void sapXepTheoSoBongDen() {
		danhSachPhongHoc.sort((ph1, ph2) -> Integer.compare(ph1.getSoBongDen(), ph2.getSoBongDen()));
	}

	//phuong thuc cao nhat may tinh cho  phong hoc may tinh khi biet ma phong
	public void capNhatSoMayTinh(String maPhongMayTinh, int soMayTinhMoi) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && phongHoc.getMaPhong().equals(maPhongMayTinh)) {
                ((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinhMoi);
                break;
            }
        }
    }


	//xoa phong hoc theo ma phong
	public boolean xoaPhongHocTheoMa(String maPhong) {
		return danhSachPhongHoc.removeIf(phongHoc -> phongHoc.getMaPhong().equals(maPhong));
	}

	//tinh tong so phong hoc
	public int tongSoPhongHoc() {
		return danhSachPhongHoc.size();
	}


	//lay danh sach phong may co 60 may
	public List<PhongMayTinh> layPhongMayTinhCo60May() {
        List<PhongMayTinh> phongMayTinhCo60May = new ArrayList<>();
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && ((PhongMayTinh) phongHoc).getSoMayTinh() == 60) {
                phongMayTinhCo60May.add((PhongMayTinh) phongHoc);
            }
        }
        return phongMayTinhCo60May;
    }

	//lay danh sach
	public List<PhongHoc> getDanhSachPhongHoc() {
		return danhSachPhongHoc;
	}

}