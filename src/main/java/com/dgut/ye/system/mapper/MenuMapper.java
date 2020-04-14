package com.dgut.ye.system.mapper;

import com.dgut.ye.system.bean.Menu;
import com.dgut.ye.system.bean.Role;

import java.util.List;

/**
 * The interface Menu mapper.
 *
 * @author : DGUT.YE
 * @date : 2020/03/15
 */
public interface MenuMapper {
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
    int insert(Menu record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Menu record);

    /**
     * Select by primary key menu.
     *
     * @param id the id
     * @return the menu
     */
    Menu selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Menu record);

    List<Menu> getMenuByHrId(Integer id);

    List<Menu> getAllMenuWithRoles();
}
