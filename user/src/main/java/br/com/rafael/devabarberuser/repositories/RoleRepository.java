package br.com.rafael.devabarberuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rafael.devabarberuser.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRoleName(String roleName);
	
	@Modifying
	@Query(value = "INSERT INTO tb_user_role (user_id, role_id) VALUES (:userId, :roleId)", nativeQuery = true)
	void roleTeste(Long userId, Long roleId);
}
