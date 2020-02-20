package com.movie.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {

	private Long rno;
	private Long bno;
	private Long uno;
	private String reply;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
}
