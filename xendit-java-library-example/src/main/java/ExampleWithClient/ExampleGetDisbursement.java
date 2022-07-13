package ExampleWithClient;

import com.xendit.exception.XenditException;
import com.xendit.XenditClient;
import com.xendit.model.DisbursementIDR;

import java.util.Arrays;

public class ExampleGetDisbursement {
    public static void main(String[] args) {
        // create xendit client which holds value of apikey
        XenditClient xenditClient = new XenditClient.Builder()
                .setApikey("xnd_development_...")
                .build();

        try {
            /**
             * Get disbursement object by ID.
             */
            String disbursementId = "614acbe0c0041e00247ad195";
            DisbursementIDR disbursement = xenditClient.disbursement.getById(disbursementId);

            /**
             * Get array of disbursement object by external ID.
             */
            String externalId = "my_external_id";
            DisbursementIDR[] disbursements = xenditClient.disbursement.getByExternalId(externalId);

            System.out.println(disbursement);
            System.out.println(Arrays.toString(disbursements));
        } catch (XenditException e) {
            e.printStackTrace();
        }
    }
}
