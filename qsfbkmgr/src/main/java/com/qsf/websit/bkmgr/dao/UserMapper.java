package com.qsf.websit.bkmgr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qsf.ssm.core.feature.orm.mybatis.Page;
import com.qsf.ssm.core.generic.GenericDao;
import com.qsf.websit.bkmgr.entity.User;
import com.qsf.websit.bkmgr.entity.UserExample;

/**
 * �û�Dao�ӿ�
 * 
 * @author StarZou
 * @since 2014��7��5�� ����11:49:57
 **/
public interface UserMapper extends GenericDao<User, Long> {
	
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * �û���¼��֤��ѯ
     * 
     * @param record
     * @return
     */
    User authentication(@Param("record") User record);

    /**
     * ��ҳ������ѯ
     * 
     * @param page
     * @param example
     * @return
     */
    List<User> selectByExampleAndPage(Page<User> page, UserExample example);
}