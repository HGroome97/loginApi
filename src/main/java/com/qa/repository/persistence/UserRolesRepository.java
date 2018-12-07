package com.qa.repository.persistence;

import org.springframework.stereotype.Repository;
import com.qa.repository.domain.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Long> {
	@Query("SELECT ur.user_role_id FROM user_roles ur where ur.username = :username")
    public long findIdByUsername(@Param("username") String username);
}
