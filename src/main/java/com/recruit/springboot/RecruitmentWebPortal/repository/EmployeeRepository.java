
// package com.recruit.springboot.RecruitmentWebPortal.repository;

// import org.springframework.data.jpa.repository.JpaRepository;

// import com.recruit.springboot.RecruitmentWebPortal.entity.Employee;

// import java.util.Optional;

// public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//     Optional<Employee> findByEmail(String email);
// }
package com.recruit.springboot.RecruitmentWebPortal.repository;

import com.recruit.springboot.RecruitmentWebPortal.entity.Employee;
import com.recruit.springboot.RecruitmentWebPortal.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
    Optional<Employee> findByOtpAndRole(String otp, Role role);
    
}
