package org.example.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.model.domain.AppInfo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

/**
 * a service class example, other services class should extends ServiceImpl like this
 *
 * @author netyjq@gmail.com
 * @date 2019/12/13
 */
@Service
public class AppInfoService implements PagingService<AppInfo> // extends ServiceImpl<AppInfoMapper, AppInfo>
{
    private AppInfo appInfo = new AppInfo();

    @PostConstruct
    public void init() {
        appInfo.setName("indyKube App");
        appInfo.setId(1);
    }

    @Override
    public Page<AppInfo> page(Page<AppInfo> page, LambdaQueryWrapper<AppInfo> queryWrapper) {
        page.setRecords(Collections.singletonList(appInfo));
        return page;
    }

    public AppInfo getById(Integer id) {
        return new AppInfo();
    }

    @Override
    public boolean update(AppInfo appInfo, LambdaUpdateWrapper<AppInfo> eq) {
        this.appInfo.setName(appInfo.getName());
        this.appInfo.setId(appInfo.getId());
        return true;
    }

    @Override
    public List<AppInfo> list(QueryWrapper<AppInfo> objectQueryWrapper) {
        return Collections.singletonList(appInfo);
    }
}
