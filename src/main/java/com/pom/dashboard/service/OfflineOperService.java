package com.pom.dashboard.service;

import java.util.List;

import com.pmo.dashboard.entity.OfflineOper;
import com.pmo.dashboard.entity.User;

public interface OfflineOperService {
	boolean delete(String id);  // deleteByPrimaryKey

//    int insert(OfflineOper record);

	boolean insert(OfflineOper offlineOper);  // insertSelective

    OfflineOper selectById(String id); //selectByPrimaryKey

    boolean update(OfflineOper offlineOper); // updateByPrimaryKeySelective

//    int updateByPrimaryKeyWithBLOBs(OfflineOper record);
//
//    int updateByPrimaryKey(OfflineOper record);
    
    List<OfflineOper> query(OfflineOper condition, User user,int pageSize,int pageNumber);

	boolean save(OfflineOper offlineOper);
}
