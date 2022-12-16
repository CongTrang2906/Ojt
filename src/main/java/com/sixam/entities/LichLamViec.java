package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LichLamViec {
	@Id
	@Column(name = "hovaTen")
	private String hovaTen;
	
	@Column(name = "hocHamhocVi")
	private String hocHamhocVi;
	
	@Column(name = "gioiTinh")
	private String gioiTinh;
	
	@Column(name = "ngaySinh")
	private String ngaySinh;
	
	@Column(name = "chuyenKhoa")
	private String chuyenKhoa;
	
	@Column(name = "phong")
	private String phong;
	
	@Column(name = "lichLamViec")
	private String lichLamViec;

	public LichLamViec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LichLamViec(String hovaTen, String hocHamhocVi, String gioiTinh, String ngaySinh, String chuyenKhoa,
			String phong, String lichLamViec) {
		super();
		this.hovaTen = hovaTen;
		this.hocHamhocVi = hocHamhocVi;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.chuyenKhoa = chuyenKhoa;
		this.phong = phong;
		this.lichLamViec = lichLamViec;
	}

	public String getHovaTen() {
		return hovaTen;
	}

	public void setHovaTen(String hovaTen) {
		this.hovaTen = hovaTen;
	}

	public String getHocHamhocVi() {
		return hocHamhocVi;
	}

	public void setHocHamhocVi(String hocHamhocVi) {
		this.hocHamhocVi = hocHamhocVi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getChuyenKhoa() {
		return chuyenKhoa;
	}

	public void setChuyenKhoa(String chuyenKhoa) {
		this.chuyenKhoa = chuyenKhoa;
	}

	public String getPhong() {
		return phong;
	}

	public void setPhong(String phong) {
		this.phong = phong;
	}

	public String getLichLamViec() {
		return lichLamViec;
	}

	public void setLichLamViec(String lichLamViec) {
		this.lichLamViec = lichLamViec;
	}

	@Override
	public String toString() {
		return "LichLamViec [hovaTen=" + hovaTen + ", hocHamhocVi=" + hocHamhocVi + ", gioiTinh=" + gioiTinh
				+ ", ngaySinh=" + ngaySinh + ", chuyenKhoa=" + chuyenKhoa + ", phong=" + phong + ", lichLamViec="
				+ lichLamViec + "]";
	}

	
}
