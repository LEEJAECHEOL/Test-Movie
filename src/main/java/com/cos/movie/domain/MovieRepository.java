package com.cos.movie.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.cos.movie.domain.dto.JoinReqDto;
import com.cos.movie.domain.dto.UpdateReqDto;


public class MovieRepository {
	
	public List<Movie> findAll() {
		System.out.println("MovieRepository: findAll() run");
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "ironMan1", 4.5, Timestamp.valueOf("2008-04-30 00:00:00")));
		movies.add(new Movie(2, "ironMan2", 4.0, Timestamp.valueOf("2010-04-29 00:00:00")));
		movies.add(new Movie(3, "ironMan3", 4.4, Timestamp.valueOf("2013-04-25 00:00:00")));
		movies.add(new Movie(4, "Avengers: Endgame", 4.5, Timestamp.valueOf("2019-04-24 00:00:00")));
		return movies;
	}
	
	public Movie findById(int id) {
		System.out.println("MovieRepository: findById() run");
		return new Movie(id, "ironMan1", 4.5, Timestamp.valueOf("2008-04-30 00:00:00"));
	}
	
	public void save(JoinReqDto dto) {
		System.out.println("MovieRepository: save() run -> " + dto.toString());
	}
	public void delete(int id) {
		System.out.println("MovieRepository: delete() run -> id :" + id);
		
	}
	public void updateById(UpdateReqDto dto) {
		
	}
}
