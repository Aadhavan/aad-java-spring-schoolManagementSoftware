package com.jaw.mark.controller;

import java.io.Serializable;

import org.apache.log4j.Logger;


public class MarkMasterVO implements Serializable {

	// Logging
	Logger logger = Logger.getLogger(MarkMasterVO.class);

	// Properties	
	private String acTerm;
	private String studentGrpId = "";
	private String examOrdrWiSG ;
	private String examId;
	private String examTest;
	private String attTermStartDate = "";
	private String attTermEndDate = "";
	private String expRptDate = "";
	private String actRptDate = "";
	private String status = "";
	private String studentGrpName;
	private int rowid;
	private String mMSeqId;
	public String getAcTerm() {
		return acTerm;
	}
	public void setAcTerm(String acTerm) {
		this.acTerm = acTerm;
	}
	public String getStudentGrpId() {
		return studentGrpId;
	}
	public void setStudentGrpId(String studentGrpId) {
		this.studentGrpId = studentGrpId;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getExamTest() {
		return examTest;
	}
	public void setExamTest(String examTest) {
		this.examTest = examTest;
	}
	public String getAttTermStartDate() {
		return attTermStartDate;
	}
	public void setAttTermStartDate(String attTermStartDate) {
		this.attTermStartDate = attTermStartDate;
	}
	public String getAttTermEndDate() {
		return attTermEndDate;
	}
	public void setAttTermEndDate(String attTermEndDate) {
		this.attTermEndDate = attTermEndDate;
	}
	public String getExpRptDate() {
		return expRptDate;
	}
	public void setExpRptDate(String expRptDate) {
		this.expRptDate = expRptDate;
	}
	public String getActRptDate() {
		return actRptDate;
	}
	public void setActRptDate(String actRptDate) {
		this.actRptDate = actRptDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRowid() {
		return rowid;
	}
	public void setRowid(int rowid) {
		this.rowid = rowid;
	}
	public String getmMSeqId() {
		return mMSeqId;
	}
	public void setmMSeqId(String mMSeqId) {
		this.mMSeqId = mMSeqId;
	}
	public String getExamOrdrWiSG() {
		return examOrdrWiSG;
	}
	public void setExamOrdrWiSG(String examOrdrWiSG) {
		this.examOrdrWiSG = examOrdrWiSG;
	}
	public String getStudentGrpName() {
		return studentGrpName;
	}
	public void setStudentGrpName(String studentGrpName) {
		this.studentGrpName = studentGrpName;
	}
	@Override
	public String toString() {
		return "MarkMasterVO [acTerm=" + acTerm + ", studentGrpId="
				+ studentGrpId + ", examOrdrWiSG=" + examOrdrWiSG + ", examId="
				+ examId + ", examTest=" + examTest + ", attTermStartDate="
				+ attTermStartDate + ", attTermEndDate=" + attTermEndDate
				+ ", expRptDate=" + expRptDate + ", actRptDate=" + actRptDate
				+ ", status=" + status + ", studentGrpName=" + studentGrpName
				+ ", rowid=" + rowid + ", mMSeqId=" + mMSeqId + "]";
	}
	
	
	
}
