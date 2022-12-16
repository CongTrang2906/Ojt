package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Thuoc {

	@Id
	@Column(name = "maThuoc")
	private String maThuoc;
	
	@Column(name = "tenThuoc")
	private String tenThuoc;
	
	@Column(name = "chiDinh")
	private String chiDinh;
	
	@Column(name = "loaiThuoc")
	private String loaiThuoc;
	
	@Column(name = "donGia")
	private String donGia;

	public Thuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Thuoc(String maThuoc, String tenThuoc, String chiDinh, String loaiThuoc, String donGia ) {
		super();
		this.maThuoc = maThuoc;
		this.tenThuoc = tenThuoc;
		this.chiDinh = chiDinh;
		this.loaiThuoc = loaiThuoc;
		this.donGia = donGia;	
 }
	public String getMaThuoc() {
		return maThuoc;
	}
	public void setMaThuoc(String maThuoc) {
		this.maThuoc = maThuoc;
	}
	public String getTenThuoc() {
		return tenThuoc;
	}
	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}
	public String getChiDinh() {
		return chiDinh;
	}
	public void setChiDinh(String chiDinh) {
		this.chiDinh = chiDinh;
	}
	public String getLoaiThuoc() {
		return loaiThuoc;
	}
	public void setLoaiThuoc(String loaiThuoc) {
		this.loaiThuoc = loaiThuoc;
	}
	public String getDonGia() {
		return donGia;
	}
	public void setDonGia(String donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return "Thuoc [maThuoc=" + maThuoc + ", tenThuoc=" + tenThuoc + ", chiDinh=" + chiDinh + ", loaiThuoc="
				+ loaiThuoc + ", donGia=" + donGia + "]";
	}
	
}
