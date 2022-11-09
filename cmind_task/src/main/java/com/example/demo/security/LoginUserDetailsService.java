package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Staff;
import com.example.demo.model.StaffExample;
import com.example.demo.mybatis.mapper.StaffMapper;

/***
 * ログインイン時に認証ユーザーを「Staffテーブル」から情報を取得するクラス
 */
@Service
public class LoginUserDetailsService implements UserDetailsService{
    @Autowired
    StaffExample staffExample;

    @Autowired
    StaffMapper staffMapper;

    @Override
    public UserDetails loadUserByUsername (String employeeId) throws UsernameNotFoundException {
    	Staff staff = staffMapper.selectByEmployeeId(employeeId);
    	
        //該当レコードが取得できなかった場合はエラーにする
        if  (staff  ==  null)   {
            throw new UsernameNotFoundException("Wrong employeeId or password");
        }

        //ログインユーザー権限を設定
        String role = "ROLE_ADMIN";

        return new LoginUserDetails(staff, role);
    }
}
