package com.example.memoboard.service;

import com.example.memoboard.model.Memo;
import com.example.memoboard.repository.MemoRepository;

import java.util.List;

public class MemoService {

    private final MemoRepository memoRepository;

    public MemoService(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }

    public Memo addMemo(String name) {
        return memoRepository.save(new Memo(name));
    }

    public List<Memo> findMemoByName(String name) {
        return memoRepository.findByNameLike("%"+name+"%");
    }

    public List<Memo> findAllMemo() {
        return memoRepository.findAll();
    }
}
