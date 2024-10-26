package quanlyphonghoc;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
		this.soMayTinh = soMayTinh;
	}


	public int getSoMayTinh() {
		return soMayTinh;
	}


	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}


	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		return duAnhSanh() && dienTich/1.5>= soMayTinh;
	}


	@Override
	public String toString() {
		return "PhongMayTinh ["+super.toString()+" , soMayTinh=" + soMayTinh + "]";
	}








}