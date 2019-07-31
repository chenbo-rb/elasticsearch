package com.elasticsearch.search.controller;

import com.elasticsearch.search.entity.City;
import com.elasticsearch.search.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityRestController {

    @Autowired
    CityService cityService;

    /**
     * 插入 ES 新城市
     * @param city
     * @return
     */
    @RequestMapping("/city/save")
    public Long saveCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    /**
     * 搜索返回分页结果
     *
     * @param pageNumber 当前页码
     * @param pageSize 每页大小
     * @param searchContent 搜索内容
     * @return
     */
    @RequestMapping(value = "/city/search")
    public List<City> searchCity(@RequestParam(value = "pageNumber") Integer pageNumber,
                                 @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                 @RequestParam(value = "searchContent") String searchContent) {
        return cityService.queryCity(pageNumber, pageSize,searchContent);
    }

}
