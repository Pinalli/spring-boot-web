package br.com.pinalli.dao;

public interface MusicaDao {

    void salvar(Musica musica);
    List<Musica>recuperarPorPlayList(long playListId);
    Musica recuperarPorPlayListIdEMusicasId(long playList, long musicaId);
    void atualizar(Musica musica);
    void excluir(long musicaId);
}
