package br.com.pinalli.dao;
import br.com.pinalli.domain.PlayList;

import java.util.List;

public interface  PlayListDao {

    void salvar(PlayList playList);
    List<PlayList> recuperar();
    PlayList recuperarPorID(long id);
    void atualizar(PlayList playList);
    void excluir(long id);


    PlayList recuperarPorID();
}
