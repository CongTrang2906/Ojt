package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BenhNhan {
	@Id
	@Column(name = "maBenhnhan")
	private String maBenhnhan;

	@Column(name = "tenBenhnhan")
	private String tenBenhnhan;

	@Column(name = "ngaySinh")
	private String ngaySinh;

	@Column(name = "diaChi")
	private String diaChi;

	@Column(name = "gioitinh")
	private String gioitinh;
	
	@Column(name = "sdt")
	private String sdt;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "dieutritaikhoa")
	private String dieutritaikhoa;
	
	@Column(name = "dieutritaiphong")
	private String dieutritaiphong;
	
	@Column(name = "dieutritaigiuong")
	private String dieutritaigiuong;

	public BenhNhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BenhNhan(String maBenhnhan, String tenBenhnhan, String ngaySinh, String diaChi, String sdt, String email,
			String dieutritaikhoa,String dieutritaiphong, String dieutritaigiuong) {
		super();
		this.maBenhnhan = maBenhnhan;
		this.tenBenhnhan = tenBenhnhan;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.sdt = sdt;
	}
	public String getMaBenhnhan() {
		return maBenhnhan;
	}
	public void setMaBenhnhan(String maBenhnhan) {
		this.maBenhnhan = maBenhnhan;
	}
	public String getTenBenhnhan() {
		return tenBenhnhan;
	}
	public void setTenBenhnhan(String tenBenhnhan) {
		this.tenBenhnhan = tenBenhnhan;
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
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDieutritaikhoa() {
		return dieutritaikhoa;
	}
	public void setDieutritaikhoa(String dieutritaikhoa) {
		this.dieutritaikhoa = dieutritaikhoa;
	}
	public String getDieutritaiphong() {
		return dieutritaiphong;
	}
	public void setDieutritaiphong(String dieutritaiphong) {
		this.dieutritaiphong = dieutritaiphong;
	}
	public String getDieutritaigiuong() {
		return dieutritaigiuong;
	}
	public void setDieutritaigiuong(String dieutritaigiuong) {
		this.dieutritaigiuong = dieutritaigiuong;
	}
	@Override
	public String toString() {
		return "quanlythongtinbenhnhan_NVHC [maBenhnhan=" + maBenhnhan + ", tenBenhnhan=" + tenBenhnhan + ", ngaySinh="
				+ ngaySinh + ", diaChi=" + diaChi + ", gioitinh=" + gioitinh + ", sdt=" + sdt + ", email=" + email
				+ ", dieutritaikhoa=" + dieutritaikhoa + ", dieutritaiphong=" + dieutritaiphong + ", dieutritaigiuong="
				+ dieutritaigiuong + "]";
	}
	
}
