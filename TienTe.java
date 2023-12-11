import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        int tiGia = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so tien can doi:");

        float input = sc.nextFloat();
        sc.nextLine();
        System.out.println("chon loai tien can doi:");
        String moneyType = sc.nextLine();
        if(moneyType.equalsIgnoreCase("USD")){
            float VND = input*tiGia;
            System.out.println("so tien la:" +VND);
        } else {
            float USD = input/tiGia;
            System.out.println("so tien la usd:" +USD);
        }

    }

}
