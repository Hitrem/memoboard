package com.example.memoboard.repository;

import com.example.memoboard.model.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {

    List<Memo> findByNameLike(String name);

    List<Memo> findAll();
}
