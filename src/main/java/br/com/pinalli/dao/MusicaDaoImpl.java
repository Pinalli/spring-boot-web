package br.com.pinalli.dao;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class MusicaDaoImpl implements MusicaDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Musica musica) {
        em.persist(musica);

    }
    @Override
    public List<Musica> recuperarPorPlayList(long playListId) {
        return em.createQuery("select m from Musica m where m.playList.id = :playListId ", Musica.class)
                .setParameter( name:"playListId",playListId)
                .getResultList();
    }

    @Override
    public Musica recuperarPorPlayListIdEMusicasId(long playList, long musicaId) {
        return em.createQuery("select m from Musica m where m.playList.id = :playListId and m.id = :musicaId",Musica.class)
                set.Parameter(name:"playListId", playListId)
                .setPàrameter(name: "musicaId", musicaId)
                .getSingleResult();
    }

    @Override
    public void atualizar(Musica musica) {
        em.merge(musica);

    }

    @Override
    public void excluir(long musicaId) {
    em.remove(em.getReference(Musica.class,musicaId));
    }
}
