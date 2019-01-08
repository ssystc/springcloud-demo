package com.sunsy.springcloud.entity;

import java.io.Serializable;

public class Dept implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long deptno;
	private String dname;
	private String db_source;
	
	public Dept() {
		super();
	}

	public Dept(Long deptno, String dname, String db_source) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.db_source = db_source;
	}

	public Dept(String dname) {
		super();
		this.dname = dname;
	}

	public Long getDeptno() {
		return deptno;
	}

	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
	
}
