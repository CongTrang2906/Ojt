package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhongBenh {

	@Id
	@Column(name = "maPhong")
	private String maPhong;
	
	@Column(name = "tenPhong")
	private String tenPhong;
	
	@Column(name = "khoa")
	private String khoa;
	
	@Column(name = "phong")
	private String phong;
	
	@Column(name = "tinhTrangPhong")
	private String tinhTrangPhong;


	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public PhongBenh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongBenh(String maPhong, String tenPhong, String khoa,String sogiuongcuaPhong, String tinhTrangPhong) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.khoa = khoa;
		this.phong = sogiuongcuaPhong;
		this.tinhTrangPhong = tinhTrangPhong;
		
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getSogiuongcuaPhong() {
		return phong;
	}

	public void setSogiuongcuaPhong(String sogiuongcuaPhong) {
		this.phong = sogiuongcuaPhong;
	}

	public String getTinhTrangPhong() {
		return tinhTrangPhong;
	}

	public void setTinhTrangPhong(String tinhTrangPhong) {
		this.tinhTrangPhong = tinhTrangPhong;
	}

	@Override
	public String toString() {
		return "PhongBenh [maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", khoa=" + khoa + ", sogiuongcuaPhong="
				+ phong + ", tinhTrangPhong=" + tinhTrangPhong + "]";
	}
	
}
