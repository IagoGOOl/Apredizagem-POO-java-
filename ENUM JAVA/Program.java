
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrdenStatus status = OrdenStatus.valueOf(sc.next());

        Orden orden = new Orden(new Date(), status, client );

        System.out.println("How many items to this order?: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter # " + (i+1) + " item data:");
            System.out.println("Product name");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrdenItens it = new OrdenItens(quantity, productPrice, product);
            orden.addItem(it);
        }
        System.out.println();
        System.out.println(orden);


        sc.close();

    }
}
