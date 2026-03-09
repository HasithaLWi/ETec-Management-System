package lk.ijse.etecmanagementsystem.dao.custom;

import lk.ijse.etecmanagementsystem.dao.SuperDAO;
import lk.ijse.etecmanagementsystem.dto.CustomDTO;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface QueryDAO extends SuperDAO {
    List<CustomDTO> getPendingRepairs() throws SQLException;

    List<CustomDTO> getUsedParts(int repairId) throws SQLException;

    List<CustomDTO> getUrgentRepairs() throws SQLException;

    List<CustomDTO> getUnpaidDebts() throws SQLException;

    double getDebts() throws SQLException;

    List<CustomDTO> getAllProductItems() throws SQLException;

    List<CustomDTO> getAllAvailableRealItems() throws SQLException;

    CustomDTO getProductItem(int itemId) throws SQLException;

    List<CustomDTO> getUnitsByStockId(int stockId, String productName) throws SQLException;

    CustomDTO getItemBySerial(String serial) throws SQLException;

    List<CustomDTO> getSalesByDateRange(LocalDate from, LocalDate to) throws SQLException;

    List<CustomDTO> getPendingSales() throws SQLException;
}

