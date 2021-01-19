package com.cos.movie.domain.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class JoinReqDto {
	@NotNull(message = "영화제목 값이 없습니다.")
	private String title;
	@NotNull(message = "평점 값이 없습니다.")
	private double rating;
}
