package org.example.repository;
import org.example.entity.RoomEntity;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class RoomEntityRepository extends Repository<RoomEntity> {
    @Override
    RoomEntity findById(long id) {
        return session.get(RoomEntity.class, id);
    }

    @Override
    List<RoomEntity> findAll() {

        Query<RoomEntity> query = session.createQuery("FROM RoomEntity", RoomEntity.class);

        return query.getResultList();
    }

    @Override
    public void create(RoomEntity room) {
        Transaction transaction = session.beginTransaction();
        try {
            session.getTransaction();
            session.persist(room);

        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

}
