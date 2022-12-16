package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NhanVien {

	@Id
	@Column(name = "maNhanVien")
	private String maNhanVien;
	
	@Column(name = "tenNhanVien")
	private String tenNhanVien;
	
	@Column(name = "ngaySinh")
	private String ngaySinh;
	
	@Column(name = "diaChi")
	private String diaChi;
	
	@Column(name = "gioiTinh")
	private String gioiTinh;
	
	@Column(name = "soDienThoai")
	private String soDienThoai;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "chucVu")
	private String chucVu;
	
	@Column(name = "bangCap")
	private String bangCap;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String maNhanVien, String tenNhanVien, String ngaySinh, String diaChi, String gioiTinh,
			String soDienThoai, String email, String chucVu, String bangCap) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.chucVu = chucVu;
		this.bangCap = bangCap;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getBangCap() {
		return bangCap;
	}

	public void setBangCap(String bangCap) {
		this.bangCap = bangCap;
	}

	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", ngaySinh=" + ngaySinh
				+ ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", soDienThoai=" + soDienThoai + ", email=" + email
				+ ", chucVu=" + chucVu + ", bangCap=" + bangCap + "]";
	}

	
}
