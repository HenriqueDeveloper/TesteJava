package dao;

import java.util.List;
import model.Hospede;
import java.util.ArrayList;

public class DAOHospede implements IHospede{
    
    public ArrayList<Hospede> hospede;
    public DAOHospede() {
        this.hospedes = new ArrayList<Hospede>();
    }

    @Override
    public void create(Hospede h){

    }

    @Override
    public void delete(Hospede h){

    }

    @Override
    public void update(Hospede h){

    }

    @Override
    public Hospede queryHospede(Hospede h){

    }

    @Override
    public  List<Hospede> getAll(){

    }
}