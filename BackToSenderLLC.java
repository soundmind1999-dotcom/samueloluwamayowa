public class BackToSenderLLC {

    public static int riderPayout(int successfulDeliveries) {

        int basePay = 5000;
        int rate;

        if (successfulDeliveries < 0 || successfulDeliveries > 100) {
            return -1;
        }

        if (successfulDeliveries >= 70) {
            rate = 500;
        } else if (successfulDeliveries >= 60) {
            rate = 250;
        } else if (successfulDeliveries >= 50) {
            rate = 200;
        } else {
            rate = 160;
        }

        return basePay + (successfulDeliveries * rate);
    }
}

