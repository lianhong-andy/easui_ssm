package com.andy.service;

import com.andy.domain.TourAdmin;
import com.andy.domain.common.PageVo;

public interface TestService {
    /**
     * 查找所有用户
     * @return
     */
    PageVo findAll(TourAdmin tourAdmin);
}
