package com.cos.movie.domain.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UpdateReqDto {
	@NotNull(message = "영화제목 값이 없습니다.")
	private String title;
	private double rating;
}
