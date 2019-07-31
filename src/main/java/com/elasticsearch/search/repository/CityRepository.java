package com.elasticsearch.search.repository;

import com.elasticsearch.search.entity.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends ElasticsearchRepository<City,Long> {

}
