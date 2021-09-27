package ExampleWithClient;

import com.xendit.exception.XenditException;
import com.xenditclient.batchDisbursements.BatchDisbursementItem;
import com.xendit.XenditClient;
import com.xenditclient.batchDisbursements.BatchDisbursement;

public class ExampleCreateBatchDisbursement {
    public static void main(String[] args) {
        //create xendit client which holds value of apikey
        XenditClient xenditClient = new XenditClient.Builder()
                .apikey("xnd_development_Z568GecuIH66011GIILkDFNJOoR1wFZdGqOOMFBrRVeX64DISB1o7hnNKB")
                .build();

        try {
            BatchDisbursementItem item =
                    BatchDisbursementItem.builder()
                            .amount(15000)
                            .bankAccountName("Joe")
                            .bankCode("BCA")
                            .bankAccountNumber("1234567890")
                            .description("Example")
                            .build();
            BatchDisbursementItem[] items = new BatchDisbursementItem[]{item};

            BatchDisbursement batchDisbursement = xenditClient.batchDisbursement.create("reference", items);

            System.out.println(batchDisbursement.getId());
            System.out.println(batchDisbursement.getReference());
            System.out.println(batchDisbursement.getCreated());
        } catch (XenditException e) {
            e.printStackTrace();
        }
    }
}