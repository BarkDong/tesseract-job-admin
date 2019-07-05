package admin.service;

import admin.entity.TesseractUser;
import admin.pojo.UserDO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author nickle
 * @since 2019-07-03
 */
public interface ITesseractUserService extends IService<TesseractUser> {
    String userLogin(UserDO userDO);

    void userLogout(String token);
}