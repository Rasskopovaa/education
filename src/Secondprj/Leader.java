package Secondprj;

import java.util.List;

public class Leader extends Employee {
    List<Worker> subordinatesList;  // список подчиненных

    /**
     * Конструктор Руководителя
     *
     * @param subordinatesList список подчиненных
     */
    public Leader(List<Worker> subordinatesList) {
        this.subordinatesList = subordinatesList;
    }

    @Override
    public void saySalary() {
        System.out.println("It's out of your business! Get to work, now!");
    }

    @Override
    public String toString() {
        return "Leader{" +
                "subordinatesList=" + subordinatesList +
                '}';
    }
}
