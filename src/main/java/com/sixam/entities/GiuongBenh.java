package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GiuongBenh {
	@Id
	@Column(name = "maGiuong")
	private String maGiuong;
	
	@Column(name = "tenGiuong")
	private String tenGiuong;
	
	@Column(name = "tenPhong")
	private String tenPhong;
	
	@Column(name = "tinhTrangGiuong")
	private String tinhTrangGiuong;

	public GiuongBenh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiuongBenh(String maGiuong, String tenGiuong, String tenPhong, String tinhTrangGiuong) {
		super();
		this.maGiuong = maGiuong;
		this.tenGiuong = tenGiuong;
		this.tenPhong = tenPhong;
		this.tinhTrangGiuong = tinhTrangGiuong;
	}

	public String getMaGiuong() {
		return maGiuong;
	}

	public void setMaGiuong(String maGiuong) {
		this.maGiuong = maGiuong;
	}

	public String getTenGiuong() {
		return tenGiuong;
	}

	public void setTenGiuong(String tenGiuong) {
		this.tenGiuong = tenGiuong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getTinhTrangGiuong() {
		return tinhTrangGiuong;
	}

	public void setTinhTrangGiuong(String tinhTrangGiuong) {
		this.tinhTrangGiuong = tinhTrangGiuong;
	}

	@Override
	public String toString() {
		return "GiuongBenh [maGiuong=" + maGiuong + ", tenGiuong=" + tenGiuong + ", tenPhong=" + tenPhong
				+ ", tinhTrangGiuong=" + tinhTrangGiuong + "]";
	}
	

}