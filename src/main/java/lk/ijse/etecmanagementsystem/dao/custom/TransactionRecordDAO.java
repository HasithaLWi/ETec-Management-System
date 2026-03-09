package lk.ijse.etecmanagementsystem.dao.custom;

import lk.ijse.etecmanagementsystem.dao.CrudDAO;
import lk.ijse.etecmanagementsystem.entity.TransactionRecord;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface TransactionRecordDAO extends CrudDAO<TransactionRecord> {

    List<TransactionRecord> getAllTransactions(Date dpFromDate, Date dpToDate) throws SQLException;

    boolean saveManualTransaction(String type, double amount, String method, String note, int userId) throws SQLException;

    double[] getDashboardStats(Date fromDate, Date toDate) throws SQLException;

    boolean settleTransaction(TransactionRecord entity, String type) throws SQLException;

    int getTransactionCount(LocalDate from, LocalDate to) throws SQLException;

    double getTodayIncome(LocalDate today) throws SQLException;
}

