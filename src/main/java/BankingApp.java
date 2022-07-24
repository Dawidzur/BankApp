import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Witaj w naszej aplikacji bankowej");
        System.out.println("Co chcesz zrobic \n 1. Pokaz informacje o koncie \n 2. Wplacanie gotowki \n 3. Wyplata gotowki \n 4. Wyjscie");
        account.createAccount();
        int inputNumber = scanner.nextInt();
        do{
            switch(inputNumber){
                case 1:
                    account.showAccount();
                    break;
            }
        }while(inputNumber != 4);
    }
}
