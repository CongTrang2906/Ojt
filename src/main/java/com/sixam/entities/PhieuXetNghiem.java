package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhieuXetNghiem {
@Id
@Column(name = "maBenhNhan")
private String maBenhNhan;

@Column(name = "tenBenhNhan")
private String tenBenhNhan;

@Column(name = "maPhieuXetNghiem")
private String maPhieuXetNghiem;

@Column(name = "tenPhieuXetNghiem")
private String tenPhieuXetNghiem;

@Column(name = "ngayXetNghiem")
private String ngayXetNghiem;

@Column(name = "ketQua")
private String ketQua;

@Column(name = "ghiChu")
private String ghiChu;

public PhieuXetNghiem() {
	super();
	// TODO Auto-generated constructor stub
}

public PhieuXetNghiem(String maBenhNhan, String tenBenhNhan, String maPhieuXetNghiem, String tenPhieuXetNghiem,
		String ngayXetNghiem, String ketQua, String ghiChu) {
	super();
	this.maBenhNhan = maBenhNhan;
	this.tenBenhNhan = tenBenhNhan;
	this.maPhieuXetNghiem = maPhieuXetNghiem;
	this.tenPhieuXetNghiem = tenPhieuXetNghiem;
	this.ngayXetNghiem = ngayXetNghiem;
	this.ketQua = ketQua;
	this.ghiChu = ghiChu;
}

public String getMaBenhNhan() {
	return maBenhNhan;
}

public void setMaBenhNhan(String maBenhNhan) {
	this.maBenhNhan = maBenhNhan;
}

public String getTenBenhNhan() {
	return tenBenhNhan;
}

public void setTenBenhNhan(String tenBenhNhan) {
	this.tenBenhNhan = tenBenhNhan;
}

public String getMaPhieuXetNghiem() {
	return maPhieuXetNghiem;
}

public void setMaPhieuXetNghiem(String maPhieuXetNghiem) {
	this.maPhieuXetNghiem = maPhieuXetNghiem;
}

public String getTenPhieuXetNghiem() {
	return tenPhieuXetNghiem;
}

public void setTenPhieuXetNghiem(String tenPhieuXetNghiem) {
	this.tenPhieuXetNghiem = tenPhieuXetNghiem;
}

public String getNgayXetNghiem() {
	return ngayXetNghiem;
}

public void setNgayXetNghiem(String ngayXetNghiem) {
	this.ngayXetNghiem = ngayXetNghiem;
}

public String getKetQua() {
	return ketQua;
}

public void setKetQua(String ketQua) {
	this.ketQua = ketQua;
}

public String getGhiChu() {
	return ghiChu;
}

public void setGhiChu(String ghiChu) {
	this.ghiChu = ghiChu;
}

@Override
public String toString() {
	return "PhieuXetNghiem [maBenhNhan=" + maBenhNhan + ", tenBenhNhan=" + tenBenhNhan + ", maPhieuXetNghiem="
			+ maPhieuXetNghiem + ", tenPhieuXetNghiem=" + tenPhieuXetNghiem + ", ngayXetNghiem=" + ngayXetNghiem
			+ ", ketQua=" + ketQua + ", ghiChu=" + ghiChu + "]";
}

}
