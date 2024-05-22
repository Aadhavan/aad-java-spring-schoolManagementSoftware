package com.jaw.fee.dao;

public class StudentFeeDiscountList {

	private String studentAdmisNo = "";
	private String studentName = "";
	private String feeAmt = "";
	private String concessionAmt = "";
	private String feePaidAmt = "";
	private String feeDueAmt = "";
	private String FeeDmdremarks = "";
	private int dbTs = 0;
	private String instId = "";
	private String branchId = "";
	private String rModId = "";
	private int rowid;
	private String acTerm = "";
	private Integer lastYearPayment;

	public Integer getLastYearPayment() {
		return lastYearPayment;
	}

	public void setLastYearPayment(Integer lastYearPayment) {
		this.lastYearPayment = lastYearPayment;
	}

	public String getAcTerm() {
		return acTerm;
	}

	public void setAcTerm(String acTerm) {
		this.acTerm = acTerm;
	}

	public String getInstId() {
		return instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public int getDbTs() {
		return dbTs;
	}

	public void setDbTs(int dbTds) {
		this.dbTs = dbTds;
	}

	public String getrModId() {
		return rModId;
	}

	public void setrModId(String rModId) {
		this.rModId = rModId;
	}

	public String getStudentAdmisNo() {
		return studentAdmisNo;
	}

	public void setStudentAdmisNo(String studentAdmisNo) {
		this.studentAdmisNo = studentAdmisNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

	public String getConcessionAmt() {
		return concessionAmt;
	}

	public void setConcessionAmt(String concessionAmt) {
		this.concessionAmt = concessionAmt;
	}

	public String getFeePaidAmt() {
		return feePaidAmt;
	}

	public void setFeePaidAmt(String feePaidAmt) {
		this.feePaidAmt = feePaidAmt;
	}

	public String getFeeDueAmt() {
		return feeDueAmt;
	}

	public void setFeeDueAmt(String feeDueAmt) {
		this.feeDueAmt = feeDueAmt;
	}

	public String getFeeDmdremarks() {
		return FeeDmdremarks;
	}

	public void setFeeDmdremarks(String feeDmdremarks) {
		FeeDmdremarks = feeDmdremarks;
	}

	public int getRowid() {
		return rowid;
	}

	public void setRowid(int rowid) {
		this.rowid = rowid;
	}

	@Override
	public String toString() {
		return "StudentFeeDiscountList [studentAdmisNo=" + studentAdmisNo
				+ ", studentName=" + studentName + ", feeAmt=" + feeAmt
				+ ", concessionAmt=" + concessionAmt + ", feePaidAmt="
				+ feePaidAmt + ", feeDueAmt=" + feeDueAmt + ", FeeDmdremarks="
				+ FeeDmdremarks + ", dbTs=" + dbTs + ", instId=" + instId
				+ ", branchId=" + branchId + ", rModId=" + rModId + ", rowid="
				+ rowid + ", acTerm=" + acTerm + "]";
	}

}
