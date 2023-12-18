package com.lewickiy.criteria_api_exercise.repository;

import com.lewickiy.criteria_api_exercise.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ActorRepository extends JpaRepository<Actor, Long>, JpaSpecificationExecutor<Actor> {
    //TODO
}
