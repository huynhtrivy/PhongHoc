package quanlyphonghoc;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong;
	protected String dayNha;
	protected double dienTich;
	protected int soBongDen;

	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	//Phuong thuc thongf tin chi tiet cua phong hoc
	public abstract boolean datChuan();

	//phuong thuc kiem tra phong co anh sang du anh sang khong
	public boolean duAnhSanh() {
		return dienTich/ 10 <= soBongDen;
	}

	@Override
	public String toString() {
		String s="";
		s+=s.format("|%20s|%20s|%20s|%20s|%20s|", getMaPhong(),getDayNha(),getDienTich(),getSoBongDen(),datChuan()? "Dat Chuan":"Khong Dat Chuan");
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhong == null)? 0 : maPhong.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(dayNha, other.dayNha)
				&& Double.doubleToLongBits(dienTich) == Double.doubleToLongBits(other.dienTich)
				&& Objects.equals(maPhong, other.maPhong) && soBongDen == other.soBongDen;
	}








}