package com.wb.cloud.service.impl;

import com.wb.cloud.dao.StorageDAO;
import com.wb.cloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : StorageServiceImpl
 * @Author : 王斌
 * @Date : 2020-12-04 21:35
 * @Description
 * @Version
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    StorageDAO storageDAO;


    @Override
    public int decrease(long productId, int count) {
        return storageDAO.decrease(productId,count);
    }
}
