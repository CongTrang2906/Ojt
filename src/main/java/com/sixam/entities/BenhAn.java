package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BenhAn {
	@Id
	@Column(name = "maBenhan")
	private String maBenhan;

	@Column(name = "tenBenhNhan")
	private String tenbenhnhan;

	@Column(name = "tinhTrangNhapVien")
	private String tinhtrangnhapvien;

	@Column(name = "chanDoanBenh")
	private String chandoanbenh;

	@Column(name = "lanKham")
	private String lankham;

	@Column(name = "bacSi")
	private String bacsi;

	public BenhAn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BenhAn(String maBenhan, String Tenbenhnhan, String Tinhtrangnhapvien, String chandoanbenh, String lankham,
			String Bacsi) {
		super();
		this.maBenhan = maBenhan;
		this.tenbenhnhan = Tenbenhnhan;
		this.tinhtrangnhapvien = Tinhtrangnhapvien;
		this.chandoanbenh = chandoanbenh;
		this.lankham = lankham;
		this.bacsi = Bacsi;
	}

	public String getMaBenhan() {
		return maBenhan;
	}

	public void setMaBenhan(String maBenhan) {
		this.maBenhan = maBenhan;
	}

	public String getTenbenhnhan() {
		return tenbenhnhan;
	}

	public void setTenbenhnhan(String tenbenhnhan) {
		this.tenbenhnhan = tenbenhnhan;
	}

	public String getTinhtrangnhapvien() {
		return tinhtrangnhapvien;
	}

	public void setTinhtrangnhapvien(String tinhtrangnhapvien) {
		this.tinhtrangnhapvien = tinhtrangnhapvien;
	}

	public String getChandoanbenh() {
		return chandoanbenh;
	}

	public void setChandoanbenh(String chandoanbenh) {
		this.chandoanbenh = chandoanbenh;
	}

	public String getLankham() {
		return lankham;
	}

	public void setLankham(String lankham) {
		this.lankham = lankham;
	}

	public String getBacsi() {
		return bacsi;
	}

	public void setBacsi(String bacsi) {
		this.bacsi = bacsi;
	}

	@Override
	public String toString() {
		return "BenhAn [maBenhan=" + maBenhan + ", Tenbenhnhan=" + tenbenhnhan + ", Tinhtrangnhapvien="
				+ tinhtrangnhapvien + ", chandoanbenh=" + chandoanbenh + ", lankham=" + lankham + ", Bacsi=" + bacsi
				+ "]";
	}

}
