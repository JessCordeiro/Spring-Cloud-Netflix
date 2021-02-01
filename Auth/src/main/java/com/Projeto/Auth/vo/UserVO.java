package com.Projeto.Auth.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserVO implements Serializable {



	private String userName;
	private String password;
	public Object getUserName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}