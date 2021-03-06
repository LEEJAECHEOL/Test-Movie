package com.cos.movie.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.movie.domain.CommonDto;
import com.cos.movie.domain.Movie;
import com.cos.movie.domain.MovieRepository;
import com.cos.movie.domain.dto.JoinReqDto;
import com.cos.movie.domain.dto.UpdateReqDto;

@RestController
public class MovieController {
	
	private MovieRepository movieRepository;
	
	public MovieController() {
		this.movieRepository = new MovieRepository();
	}
	
	@RequestMapping("/movie")
	public CommonDto<List<Movie>> findAll() {
		System.out.println("movieController: findAll() run");
		return new CommonDto<>(HttpStatus.OK.value(), movieRepository.findAll());
	}
	
	@GetMapping("/movie/{id}")
	public CommonDto<Movie> findById(@PathVariable int id) {
		System.out.println("movieController: findById() run");
		return new CommonDto<>(HttpStatus.OK.value(), movieRepository.findById(id));
	}
	
	@CrossOrigin 
	@PostMapping("/movie")
	public CommonDto<String> save(@Valid @RequestBody JoinReqDto dto, BindingResult bindingResult) {
		movieRepository.save(dto);
		return new CommonDto<>(HttpStatus.OK.value(), "ok");
	}
	
	@DeleteMapping("/movie/{id}")
	public CommonDto<String> delete(@PathVariable int id) {
		System.out.println("movieController: delete() run -> id : " + id);
		return new CommonDto<>(HttpStatus.OK.value(), "ok");
	}
	
	@PutMapping("/movie/{id}")
	public CommonDto<String> updateById(@PathVariable int id, @Valid @RequestBody UpdateReqDto dto, BindingResult bindingResult) {
		System.out.println("movieController: updateById() run -> id : " + id);
		movieRepository.updateById(dto);
		return new CommonDto<>(HttpStatus.OK.value(), "ok");
	}
}
