package cn.ssmc.dao;


import cn.ssmc.entity.Student;

public interface StudentDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Aug 21 10:16:56 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Aug 21 10:16:56 CST 2017
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Aug 21 10:16:56 CST 2017
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Aug 21 10:16:56 CST 2017
     */
    Student selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Aug 21 10:16:56 CST 2017
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Aug 21 10:16:56 CST 2017
     */
    int updateByPrimaryKey(Student record);
    
    Student loginStudent(Student record);
    
}