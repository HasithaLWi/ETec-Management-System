package lk.ijse.etecmanagementsystem.dto;

public enum TransactionFlow {
    IN("IN"),
    OUT("OUT");

    private final String flowType;

    TransactionFlow() {
        this.flowType = this.name();
    }

    TransactionFlow(String flowType) {
        this.flowType = flowType;
    }

    public String getFlowType() {
        return flowType;
    }

    @Override
    public String toString() {
        return flowType;
    }
}
