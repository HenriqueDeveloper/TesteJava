package dao;

import model.Hospede;
import java.util.List;

public interface IHospede extends IConexao{
        
    public void create(Hospede h);

    public void delete(Hospede h);

    public void update(Hospede h);

    public List<Hospede> getAll();

    public Hospede queryHospede(Hospede h);

}
