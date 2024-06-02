package com.example.duanweb2.dao;


import com.example.duanweb2.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
}
