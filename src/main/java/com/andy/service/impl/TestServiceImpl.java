package com.andy.service.impl;

import com.andy.dao.TestDao;
import com.andy.domain.TourAdmin;
import com.andy.domain.common.PageVo;
import com.andy.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.List;

@Service
public class TestServiceImpl implements /*ServletContextAware, InitializingBean ,*/TestService {
    private ServletContext servletContext;
    private Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
   /* @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("xxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }*/


    @Autowired
    private TestDao testDao;
    @Override
    public PageVo findAll(TourAdmin tourAdmin) {
        PageVo vo = new PageVo();
        Integer size = tourAdmin.getSize();
        if(size==null){
            size=10;
        }
        Integer page = tourAdmin.getPage()==null || tourAdmin.getPage().equals(0)?0:(tourAdmin.getPage()-1)*size;
     /*   List<TourAdmin> list = testDao.findAll(page,size);
        if(list==null) return vo;
        vo.setRows(list);*/
        Integer count = testDao.getCount();
        vo.setTotal(count);
        return vo;
    }
}
