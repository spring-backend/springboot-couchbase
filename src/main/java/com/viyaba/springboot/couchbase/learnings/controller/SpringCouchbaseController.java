package com.viyaba.springboot.couchbase.learnings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viyaba.springboot.couchbase.learnings.model.DailyCloseDocument;
import com.viyaba.springboot.couchbase.learnings.repo.DailyCloseRepo;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/fullstack")
@CrossOrigin(origins = "*")
@Api(tags={"Spring Couchbase Controller - related operations"})
public class SpringCouchbaseController {

	private DailyCloseRepo dailyCloseRepo;
	
	@Autowired
	public SpringCouchbaseController(DailyCloseRepo dailyCloseRepo) {
		super();
		this.dailyCloseRepo = dailyCloseRepo;
	}

	@GetMapping("/ping")
	public String ping() {
		return "Pong";
	}
	
	@GetMapping
	public Page<DailyCloseDocument> getAllDocuments() {
		Pageable pageable = PageRequest.of(0, 10);
		return dailyCloseRepo.findAll(pageable);
	}
}
