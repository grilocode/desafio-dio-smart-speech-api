package dio.budgeting.application;

import dio.budgeting.domain.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class GetBalanceUseCase {

    private final TransactionRepository transactionRepository;

    public GetBalanceUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public long execute() {
        return transactionRepository.findAll()
                .stream()
                .mapToLong(transaction -> transaction.getAmount())
                .sum();
    }
}