package com.inti.service.interfaces;

import java.util.List;
import java.util.Set;

import com.inti.entities.Role;

public interface IRoleService {
	List<Role> findAll();

	Role findOne(Long id);

	Role save(Role role);

	void delete(Long id);
}
