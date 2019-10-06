package com.deTravel.service.impl;

import com.deTravel.mapper.TravelMapper;
import com.deTravel.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelServiceImpl implements TravelService {
    @Autowired
    TravelMapper travelMapper;
    @Override
    public List<TbArea> selectAllArea(TbArea tbArea) {
        return travelMapper.selectAllArea(tbArea);
    }
}
