package cn.ssmc.dao;

import java.util.List;

import cn.ssmc.entity.ChooseCourse;
import cn.ssmc.entity.ClassTime;

public interface ChooseCourseDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chos
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chos
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    //
    int insert(ChooseCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chos
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    int insertSelective(ChooseCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chos
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    ChooseCourse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chos
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    int updateByPrimaryKeySelective(ChooseCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chos
     *
     * @mbg.generated Sun Aug 20 13:05:37 CST 2017
     */
    int updateByPrimaryKey(ChooseCourse record);
    
    //进入管理员的选课管理页面，或是在其中点击查询
    //通过		‘课程名称’，‘开课学院’，‘授课老师’ 
    //查询 
    //得到		‘选课id’,‘选课编号’，‘课程名称’，‘学分’，‘开课学院’，‘授课老师’，
    //			‘学期名称’，‘人数’，‘课程安排id隐藏在按钮处’
    
    List<ChooseCourse> selectChooseCourse(ChooseCourse chooseCourse);

    //点击课程安排，根据隐藏的id查询选课表中的上课地点和时间
    ClassTime selectClassTime(Integer classTimeId);
    
    void updateSelected(Integer ccID);
    
    void updateSelected2(Integer ccID);
    
    //点击删除时要先查看是否还有学生选课
    int countSelect(int ccID);
}