package com.frame.springboot.service;

import com.frame.springboot.base.BaseServiceImpl;
import com.frame.springboot.dao.CityDao;
import com.frame.springboot.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author van
 */
@Service
public class CityService extends BaseServiceImpl<City> {

    @Autowired
    private CityDao cityDao;

    @Override
    public Mapper<City> getMapper() {

        return cityDao;

    }

}
