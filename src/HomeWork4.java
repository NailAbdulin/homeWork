public class HomeWork4 {
    public static void main(String[] args){

        // задача №1
        int clientOS = 0;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // задача №2
        int operatingSystem = 1;
        int clientDeviceYear = 2014;
        if(operatingSystem == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(operatingSystem == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if(operatingSystem == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if(operatingSystem == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else{
            System.out.println("нет установки");
        }

        // Задача №3

        int year = 2021;
        if((year % 4 == 0) && (year % 100 !=0) || year % 400 == 0){
            System.out.println( year + " это высокосный год");
        }else{
            System.out.println(year + " это не высокосный год");
        }


        // задача %4

        int  deliveryDistance = 95;
        if(deliveryDistance < 20){
            System.out.println("на доставку уйдет 1 день");
        }else if(deliveryDistance >=20 && deliveryDistance <60){
            System.out.println("на доставку уйдет 2 дня");
        }else if(deliveryDistance >=60 && deliveryDistance <100){
            System.out.println("на доставку уйдет 3 дня");
        }else{
            System.out.println("Доставки не будет");
        }

        // задача №5

        int monthNumber = 12;
        switch(monthNumber){
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето"); 
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("зима");
                break;
            default:
                System.out.println("такого месяца нет");
        }



    }
}
