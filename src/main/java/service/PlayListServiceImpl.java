package service;

import br.com.pinalli.dao.PlayListDao;
import br.com.pinalli.domain.PlayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlayListServiceImpl implements PlayListService {

    @Autowired
    private PlayListDao playListDao;


    @Override
    public void salvar(PlayList playList) {
        playListDao.salvar(playList);

    }

    @Override
    @Transactional(readOnly = true)
    public List<PlayList> recuperar() {
        return playListDao.recuperar();
    }

    @Override
    @Transactional(readOnly = true)
    public PlayList recuperarPorId(long id) {
        return playListDao.recuperarPorID();
    }

    @Override
    public void atualizar(PlayList playList) {
        playListDao.atualizar(playList);

    }

    @Override
    public void excluir(long id) {
        playListDao.excluir(id);
    }
}
