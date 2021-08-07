public class SportCarDemo
{
    public static void main(String[] args)
    {
        SportCar s1 = new SportCar(CarType.BMW, CarColor.BLACK,50000);

        System.out.println(s1);

        switch(s1.getMake())
        {
            case PORSCHE:
                System.out.println("PORSCHE is made in Germany");
                break;
            case BMW:
                System.out.println("BMW is made in Germany but better than Hyundai");
                break;
            case HYUNDAI:
                System.out.println("Hyundai is made in Korea");
                break;
            default:
                System.out.println("What car?...");
        }
    }
}
