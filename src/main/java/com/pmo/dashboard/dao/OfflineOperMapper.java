package com.pmo.dashboard.dao;

import java.util.List;

import com.pmo.dashboard.entity.OfflineOper;
import com.pmo.dashboard.entity.User;

public interface OfflineOperMapper {
	int deleteByPrimaryKey(String id);
	
//  int insert(OfflineOper record);

  int insertSelective(OfflineOper record);

  OfflineOper selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(OfflineOper record);

//  int updateByPrimaryKeyWithBLOBs(OfflineOper record);
//
//  int updateByPrimaryKey(OfflineOper record);
  
  /**
   * 根据：年份、月份、RM_ID、三个条件在线下运营提交表去查询线下运营提交表
   * @param condition
   * @returnaf
   */
  List<OfflineOper> queryByRM(OfflineOper condition);
  
  /**
   * 根据：年份、月份、交付部、三个条件在线下运营提交表去查询
   * @param condition
   * @return
   */
  List<OfflineOper> queryBySubDept(OfflineOper condition);
  
  /**
   * 根据：年份、月份、事业部、三个条件在线下运营提交表去查询
   * @param condition
   * @return
   */
  List<OfflineOper> queryByDept(OfflineOper condition);
  
  /**
   * 根据：年份、月份、RM_ID、三个条件在线下运营提交表去count查询
   * RM count
   */
  int rmCount(OfflineOper condition);
  
//  List<User> queryRMFromDept(String subDeptId) ;
  
  /**
   * 根据职员表构造线下运营提交表数据
   * @param condition
   * @return
   */
   List<OfflineOper> queryFromEmployeeByRM(OfflineOper condition);
   
   /**
    * 根据：年份、月份、EMPLOYEE_ID、三个条件在线下运营提交表去count查询
    * EMPLOYEE count
    */
   int employeeCount(OfflineOper condition);
}