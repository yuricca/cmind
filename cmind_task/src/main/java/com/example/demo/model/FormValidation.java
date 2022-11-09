package com.example.demo.model;

//login.htmlでth:fieldで設定するフィールド名をどうしてもusernameにしておく必要があったので、
//（LoginUserDerailsServiceクラスのloadUserByUsernameメソッドの引数として認知されるにはname属性をusernameとしておきたい）
//別途、バリデーション用のエンティティクラスを作成。

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class FormValidation {

	@Id
	@NotBlank(message="社員番号は必ず指定してください")
    @Size(max = 6, message="社員番号は６桁で指定してください")
    private String username;

    @NotBlank(message="パスワードは必ず指定してください")
    private String password;

}
