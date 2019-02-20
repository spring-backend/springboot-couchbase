package com.viyaba.springboot.couchbase.learnings.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.viyaba.springboot.couchbase.learnings.model.DailyCloseDocument;

@Repository
public interface DailyCloseRepo extends PagingAndSortingRepository<DailyCloseDocument, Long> {

	
}
