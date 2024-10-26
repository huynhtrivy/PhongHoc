package quanlyphonghoc;

public class PhongLyThuyet extends PhongHoc {

	private boolean coMayChieu;


	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
		// TODO Auto-generated constructor stub
	}


	public boolean isCoMayChieu() {
		return coMayChieu;
	}


	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}


	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		return duAnhSanh() && coMayChieu;
	}


	@Override
	public String toString() {
	    return String.format("PhongLyThuyet [%s, coMayChieu=%s]", super.toString(), coMayChieu);
	}




}