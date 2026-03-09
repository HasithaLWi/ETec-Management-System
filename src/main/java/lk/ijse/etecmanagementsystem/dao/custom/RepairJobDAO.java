package lk.ijse.etecmanagementsystem.dao.custom;

import javafx.scene.chart.XYChart;
import lk.ijse.etecmanagementsystem.dao.CrudDAO;
import lk.ijse.etecmanagementsystem.entity.RepairJob;
import lk.ijse.etecmanagementsystem.dto.RepairStatus;

import java.sql.SQLException;
import java.time.LocalDate;

public interface RepairJobDAO extends CrudDAO<RepairJob> {

    int getLastInsertedRepairId() throws SQLException;

    boolean updateRepairJob(RepairJob entity) throws SQLException;

    boolean updateRepairPayment(double amount, double totalAmount, double discount, String paymentStatus, int repairId) throws SQLException;

    boolean updateRepairCosts(RepairJob entity) throws SQLException;

    boolean updateStatus(int repairId, RepairStatus newStatus) throws SQLException;

    boolean updateDateOut(String paymentStatus, int repairId) throws SQLException;

    int getRepairCount(LocalDate from, LocalDate to) throws SQLException;

    boolean isRepairExist(String repairId) throws SQLException;

    XYChart.Series<String, Number> getRepairChartData() throws SQLException;

    int getActiveRepairCount() throws SQLException;
}

