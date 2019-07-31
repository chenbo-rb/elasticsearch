package com.elasticsearch.search.service;

import com.elasticsearch.search.entity.City;

import java.util.List;

public interface CityService {

    /**
     * 保持城市
     * @param city
     * @return
     */
    public Long saveCity(City city);

    /**
     * 查询城市
     * @param pageNumber
     * @param pageSize
     * @param searchContent
     * @return
     */
    public List<City> queryCity(Integer pageNumber, Integer pageSize, String searchContent);

}
