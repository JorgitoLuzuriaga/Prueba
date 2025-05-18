package org.unl.music.base.controller.dao.dao_models;
import org.unl.music.base.models.Repuesto;   
import org.unl.music.base.controller.dao.AdapterDao;
import org.unl.music.base.models.Genero;
public class DaoRepuesto extends AdapterDao<Repuesto> {
    private Repuesto obj;

    public DaoRepuesto() {
        super(Repuesto.class);
    }

    public Repuesto getObj() {
        if (obj == null)
            this.obj = new Repuesto();
        return this.obj;
    }

    public void setObj(Repuesto obj) {
        this.obj = obj;
    }

    public Boolean save() {
        try {
            this.persist(obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean update(Integer pos) {
        try {
            this.update(obj, pos);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
