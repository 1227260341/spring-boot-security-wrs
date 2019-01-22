package com.zj.modules.mapper;

import com.zj.modules.domain.Menu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by sang on 2017/12/28.
 */
@Mapper
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
