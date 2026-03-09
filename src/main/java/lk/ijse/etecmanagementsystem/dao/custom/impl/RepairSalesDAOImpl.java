package lk.ijse.etecmanagementsystem.dao.custom.impl;

import lk.ijse.etecmanagementsystem.dao.custom.RepairSalesDAO;
import lk.ijse.etecmanagementsystem.dao.CrudUtil;
import lk.ijse.etecmanagementsystem.entity.RepairSale;

import java.sql.SQLException;
import java.util.List;

public class RepairSalesDAOImpl implements RepairSalesDAO {
    @Override
    public  boolean saveRepairSale(int repairId, int saleId) throws Exception {
        String sqlLink = "INSERT INTO RepairSale (repair_id, sale_id) VALUES (?, ?)";
        return  CrudUtil.execute(sqlLink, repairId, saleId);
    }

    @Override
    public List<RepairSale> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public boolean save(RepairSale entity) throws SQLException {
        return false;
    }

    @Override
    public boolean update(RepairSale entity) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public RepairSale search(int id) throws SQLException {
        return null;
    }
}
