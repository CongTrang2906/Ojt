package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Khoa {

@Id
@Column(name = "maKhoa")
private String maKhoa;

@Column(name = "tenKhoa")
private String tenKhoa;

@Column(name = "truongKhoa")
private String truongKhoa;

@Column(name = "soLuongPhong")
private String soLuongPhong;

@Column(name = "soLuongNhanVien")
private String soLuongNhanVien;

public Khoa() {
	super();
	// TODO Auto-generated constructor stub
}

public Khoa(String maKhoa, String tenKhoa, String truongKhoa, String soLuongPhong, String soLuongNhanVien) {
	super();
	this.maKhoa = maKhoa;
	this.tenKhoa = tenKhoa;
	this.truongKhoa = truongKhoa;
	this.soLuongPhong = soLuongPhong;
	this.soLuongNhanVien = soLuongNhanVien;
}

public String getMaKhoa() {
	return maKhoa;
}

public void setMaKhoa(String maKhoa) {
	this.maKhoa = maKhoa;
}

public String getTenKhoa() {
	return tenKhoa;
}

public void setTenKhoa(String tenKhoa) {
	this.tenKhoa = tenKhoa;
}

public String getTruongKhoa() {
	return truongKhoa;
}

public void setTruongKhoa(String truongKhoa) {
	this.truongKhoa = truongKhoa;
}

public String getSoLuongPhong() {
	return soLuongPhong;
}

public void setSoLuongPhong(String soLuongPhong) {
	this.soLuongPhong = soLuongPhong;
}

public String getSoLuongNhanVien() {
	return soLuongNhanVien;
}

public void setSoLuongNhanVien(String soLuongNhanVien) {
	this.soLuongNhanVien = soLuongNhanVien;
}

@Override
public String toString() {
	return "quanlykhoa_GDBV [maKhoa=" + maKhoa + ", tenKhoa=" + tenKhoa + ", truongKhoa=" + truongKhoa
			+ ", soLuongPhong=" + soLuongPhong + ", soLuongNhanVien=" + soLuongNhanVien + "]";
}

}
