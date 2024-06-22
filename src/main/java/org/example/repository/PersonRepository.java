package org.example.repository;

import org.example.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

0 interface PersonRepository extends JpaRepository <Person,Integer> {
}
