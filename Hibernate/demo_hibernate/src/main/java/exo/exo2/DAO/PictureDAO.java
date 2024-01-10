package exo.exo2.DAO;

import exo.exo1.model.Picture;

public interface PictureDAO<T> {
    public boolean addPicture(T t );
    public boolean updatePicture(Picture p, String s);
    public boolean deletePicture(long l);
}
