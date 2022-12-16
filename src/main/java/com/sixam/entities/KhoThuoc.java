package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KhoThuoc {
	@Id
	@Column(name = "maLoaiThuoc")
	private String maLoaiThuoc;

	@Column(name = "tenThuoc")
	private String tenThuoc;
	
	@Column(name = "loaiThuoc")
	private String loaiThuoc;
	
	@Column(name = "soLuong")
	private String soLuong;

	public KhoThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhoThuoc(String maLoaiThuoc, String tenThuoc, String loaiThuoc, String soLuong) {
		super();
		this.maLoaiThuoc = maLoaiThuoc;
		this.tenThuoc = tenThuoc;
		this.loaiThuoc = loaiThuoc;
		this.soLuong = soLuong;	
	}
	public String getMaLoaiThuoc() {
		return maLoaiThuoc;
	}
	public void setMaLoaiThuoc(String maLoaiThuoc) {
		this.maLoaiThuoc = maLoaiThuoc;
	}
	public String getTenThuoc() {
		return tenThuoc;
	}
	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}
	public String getLoaiThuoc() {
		return loaiThuoc;
	}
	public void setLoaiThuoc(String loaiThuoc) {
		this.loaiThuoc = loaiThuoc;
	}
	public String getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "KhoThuoc [maLoaiThuoc=" + maLoaiThuoc + ", tenThuoc=" + tenThuoc + ", loaiThuoc=" + loaiThuoc
				+ ", soLuong=" + soLuong + "]";
	}
	
}
