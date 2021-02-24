package com.wb.cloud.controller;

import com.wb.cloud.dao.StorageDAO;
import com.wb.cloud.entitles.CommonResult;
import com.wb.cloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : StorageController
 * @Author : 王斌
 * @Date : 2020-12-04 21:34
 * @Description
 * @Version
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult storage(long productId,int count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功！");
    }


}
