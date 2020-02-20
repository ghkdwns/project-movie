package com.movie.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private Long bno;
	private String title;
	private String content;
	private Long rating;
	private String writer;
	private Date regDate;
	private Date updateDate;
	private Long uno;
	private Long movno;
}
