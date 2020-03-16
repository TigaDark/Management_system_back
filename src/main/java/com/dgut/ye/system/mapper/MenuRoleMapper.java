package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.MenuRole;

/**
 * The interface Menu role mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface MenuRoleMapper {
    /**
     * Delete by primary key int.
     *
     * @param id the id
     * @return the int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(MenuRole record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(MenuRole record);

    /**
     * Select by primary key menu role.
     *
     * @param id the id
     * @return the menu role
     */
    MenuRole selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(MenuRole record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(MenuRole record);
}
