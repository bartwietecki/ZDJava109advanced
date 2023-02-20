package sda.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class FileOperationPerformer {
    private final List<FileOperation> operationHistory = new ArrayList<>();

    public String executeOperation(FileOperation operation, String content) {
        operationHistory.add(operation);
        return operation.performOperation(content);
    }


    public List<FileOperation> getOperationHistory() {
//        return operationHistory;
        return List.copyOf(operationHistory); // Jeśli nie chcemy zmieniać zawartości listy to robimy kopię listy,
                                                // bo copyOf zwraca Listę niemodyfikalną [ tzw. deep-copy ]
    }
}
