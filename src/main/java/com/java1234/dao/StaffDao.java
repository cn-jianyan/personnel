package com.java1234.dao;

import com.java1234.entity.Staff;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Staff)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-14 23:20:03
 */
public interface StaffDao {

    /**
     * 通过ID查询单条数据
     *
     * @param s_id 主键
     * @return 实例对象
     */
    Staff queryById(Integer s_id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Staff> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param staff 实例对象
     * @return 对象列表
     */
    List<Staff> queryAll(Staff staff);

    /**
     * 新增数据
     *
     * @param staff 实例对象
     * @return 影响行数
     */
    int insert(Staff staff);

    /**
     * 修改数据
     *
     * @param staff 实例对象
     * @return 影响行数
     */
    int update(Staff staff);

    /**
     * 通过主键删除数据
     *
     * @param s_id 主键
     * @return 影响行数
     */
    int deleteById(Integer s_id);

}