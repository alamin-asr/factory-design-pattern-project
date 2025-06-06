package factory;

import com.alamin.shipping_update.enums.ShippingProvider;
import com.alamin.shipping_update.service.*;
import org.springframework.stereotype.Component;

@Component
public class ShippingServiceFactory {
    public ShippingService getShippingService(ShippingProvider provider) {
        return switch (provider) {
            case DHL -> new DhlService();
            case S_A_PARIBAHON -> new S_A_ParibahonService();
            case STREETFAST -> new StreetFastService();
            case SHUNDORBAN -> new SundarbanService();
        };
    }

}
