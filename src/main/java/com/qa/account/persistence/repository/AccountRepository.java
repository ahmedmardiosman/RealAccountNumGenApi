package com.qa.account.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.account.persistence.domain.AccountNum;

@Repository
public interface AccountRepository extends JpaRepository<AccountNum, String> {
}
