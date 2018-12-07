package com.qa.repository.persistence;

import org.springframework.stereotype.Repository;
import com.qa.repository.domain.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Long> {

}
