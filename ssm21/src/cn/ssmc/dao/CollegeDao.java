package cn.ssmc.dao;

import java.util.List;

import cn.ssmc.entity.College;

public interface CollegeDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_college
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_college
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    int insert(College record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_college
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    int insertSelective(College record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_college
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    College selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_college
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    int updateByPrimaryKeySelective(College record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_college
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    int updateByPrimaryKey(College record);
    
    List<College> selectCollegeList();
}