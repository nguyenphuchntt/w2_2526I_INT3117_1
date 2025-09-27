public class Calculator {
    public static final int MOTORBIKE = 1;
    public static final int SMALL_CAR = 2;
    public static final int MEDIUM_CAR = 3;

    public int calculateFee(int vehicleType, int parkingTime, boolean isParking) {
        switch (vehicleType) {
            case MOTORBIKE:
                if (!isParking) {
                    System.out.println("Thông báo bảo vệ");
                    return -1;
                } else {
                    if (parkingTime < 0) {
                        System.out.println("Thông báo bảo vệ");
                        return -1;
                    } else if (parkingTime < 12) {
                        return 5;
                    } else if (parkingTime <= 24) {
                        return 15;
                    } else {
                        System.out.println("Làm giấy phạt");
                        return -2;
                    }
                }
            case SMALL_CAR:
                if (!isParking) {
                    System.out.println("Thông báo bảo vệ");
                    return -1;
                } else {
                    if (parkingTime < 0) {
                        System.out.println("Thông báo bảo vệ");
                        return -1;
                    } else if (parkingTime < 12) {
                        return 30;
                    } else if (parkingTime <= 24) {
                        return 50;
                    } else {
                        System.out.println("Làm giấy phạt");
                        return -2;
                    }
                }
            case MEDIUM_CAR:
                if (!isParking) {
                    System.out.println("Thông báo bảo vệ");
                    return -1;
                } else {
                    if (parkingTime < 0) {
                        System.out.println("Thông báo bảo vệ");
                        return -1;
                    } else if (parkingTime < 12) {
                        return 50;
                    } else if (parkingTime <= 24) {
                        return 100;
                    } else {
                        System.out.println("Làm giấy phạt");
                        return -2;
                    }
                }
            default:
                System.out.println("Thông báo bảo vệ");
                return -1;
        }
        // Thông báo bảo vệ -1; Thông báo bảo vệ + giấy phạt -2
    }
}
