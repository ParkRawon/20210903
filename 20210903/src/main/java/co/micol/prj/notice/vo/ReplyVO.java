package co.micol.prj.notice.vo;

import java.sql.Date;

public class ReplyVO {
	private int rId;
	private int id;
	private String replyContext;
	private Date replyDate;
	
	public ReplyVO() {
		
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReplyContext() {
		return replyContext;
	}

	public void setReplyContext(String replyContext) {
		this.replyContext = replyContext;
	}

	public Date getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}

	
	
}
