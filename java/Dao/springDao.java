package Dao;

import java.util.ArrayList;
import java.util.List;

import Entity.Spring;


public class springDao {

    public List<Spring> findAll() {
        List<Spring> list = new ArrayList<>();

        // 本来は、例外処理が必要
        list.add(new Spring(101, "鉛筆", "50"));
        list.add(new Spring(102, "消しゴム", "100"));
        list.add(new Spring(103, "地球儀", "5000"));

        return list;
    }
}