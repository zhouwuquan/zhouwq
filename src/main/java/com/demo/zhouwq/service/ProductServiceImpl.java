package com.demo.zhouwq.service;

import com.demo.zhouwq.dao.ProductMapper;
import com.demo.zhouwq.entity.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Resource
    private ProductMapper roductMapper;
    @Override
    public List<Product> selectAll() {
        return roductMapper.selectAll();
    }
}
