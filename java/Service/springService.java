package Service;

import java.util.List;

import Dao.springDao;
import Entity.Spring;

public class springService {
    private springDao springDao = new springDao();

    public List<Spring> findAll() {
        // 本来は、例外処理が必要
        return springDao.findAll();
    }
}