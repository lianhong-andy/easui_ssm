package com.andy.dao;

import com.andy.domain.TourAdmin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {

    /**
     * 查找所有用户
     * @return
     */
    List<TourAdmin> findAll( Integer page,  Integer size);

    /**
     * 查询总记录数
     * @return
     */
    Integer getCount();

}
