import java.util.Arrays;
import java.util.Scanner;

public class UngDungDemSoLuongSVThiDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Số lượng điểm sinh viên
        int number;
        do {
            System.out.print("Nhập số lượng điểm sinh viên: ");
            number = scanner.nextInt();
            if (number > 30) {
                System.out.println("Tối đa 30");
            }
        } while (number > 30);
        //Nhập điểm của sinh viên
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Nhập số điểm sinh viên " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Số điểm sinh viên đã cho vào: " + Arrays.toString(arr));
        System.out.println("Kết quả");
        checkPass(arr);

    }
    //Check điểm
    public static void checkPass(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5 && arr[i] <= 10) {
                System.out.println("Sinh viên " + (i + 1) + " : ĐỖ");
            } else if (0 < arr[i] && arr[i] < 5) {
                System.out.println("Sinh viên " + (i + 1) + " : TRƯỢT");
            } else {
                System.out.println("Sinh viên " + (i + 1) + " : Out of range");
            }
        }
    }
}
