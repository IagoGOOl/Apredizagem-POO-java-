import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Orden{
    private Date moment;
    private OrdenStatus status;
    
    private Client client;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
   
    private List <OrdenItens> item = new ArrayList<OrdenItens>();

    public Orden() {
    }

    public Orden(Date moment, OrdenStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrdenStatus getStatus() {
        return status;
    }
    public void setStatus(OrdenStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public void  addItem(OrdenItens itens){
        item.add(itens);
    }

    public void remove(OrdenItens itens){
        item.remove(itens);
    }
    
    public double total(){
        double sum = 0.0;
        for(OrdenItens it : item){
            sum = sum + it.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Orden status:");
        sb.append(status + "\n");
        sb.append(" Client: ");
        sb.append(client + "\n");
        sb.append(" Order items: \n ");
        for (OrdenItens item : item){
            sb.append(item + " \n ");
        }

        sb.append(" Total price: $ ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

    

}