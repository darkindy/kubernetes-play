package org.example.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.model.domain.AppInfo;

import java.util.List;

public interface PagingService<T> {
    public Page<T> page(Page<T> page, LambdaQueryWrapper<T> queryWrapper);

    AppInfo getById(Integer id);

    boolean update(AppInfo appInfo, LambdaUpdateWrapper<AppInfo> eq);

    List<T> list(QueryWrapper<T> objectQueryWrapper);
}
