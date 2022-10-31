package com.example.demo.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.example.demo.model.Staff;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
//equals()とhashCode()を生成するが親クラスのメソッドは呼び出さない
@EqualsAndHashCode(callSuper=false)
public class LoginUserDetails extends User {
    //Staffテーブルから取得したオブジェクトを格納
    private final Staff staff;

    //認証処理
    public LoginUserDetails(Staff staff, String role) {
        //employeeテーブルのemployee_idとパスワードでログイン認証を行う
        super(staff.getEmployeeId(), staff.getPassword(), AuthorityUtils.createAuthorityList(role));
        this.staff = staff;
        
    }
}
