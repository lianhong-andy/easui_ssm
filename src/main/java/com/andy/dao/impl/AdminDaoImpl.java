package com.andy.dao.impl;

import com.andy.dao.AdminDao;
import com.andy.dao.TestDao;
import com.andy.domain.TourAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class AdminDaoImpl implements TestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public List<TourAdmin> findAll(Integer page, Integer size) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("size",size);
        StringBuilder sql = new StringBuilder();
        sql.append("select * from tour_admin limit :page,:size");
        return namedParameterJdbcTemplate.query(sql.toString(),map,new BeanPropertyRowMapper<>(TourAdmin.class));
    }

    @Override
    public Integer getCount() {
        StringBuilder sql = new StringBuilder();
        sql.append("select count(*) from tour_admin");
        return jdbcTemplate.queryForObject(sql.toString(),new BeanPropertyRowMapper<>(Integer.class));
    }
}
