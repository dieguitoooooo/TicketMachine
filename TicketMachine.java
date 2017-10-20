/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Aquí creamos el primer constructor
     */
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
    }
    
    /**
     * Construtor que permite crear maquinas cuyo precio del billete sea el
     * que se indica en el parametro.
     */
    public TicketMachine(int cost)
    {
        price = cost;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
    
    /**
     * Este metodo simula el proceso de extraer todo el dinero que haya
     * acumulado la maquina 
     */
    public void vaciarMaquina()
    {
        balance = 0;
        total = 0;
    }
    
    /**
     * imprime por pantalla el precio del dinero
     */
    public void showPrice()
    {
        System.out.println("El precio del bllete es" + price + " cents.");
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public void setPrice(int cost)
    {
        price = cost;
    }
    
    /**
     * Permite incrementar el precio del billete en 2 euros
     */
    public void subirPrecioEn2Euros()
    {
        price = price + 200;
    }
    
    /**
     * Reducir el precio del billete en la cantidad que se pasa como parametro
     */
    public void discount (int amount)
    {
        price = price - amount;
    }
    
    /**
     * Saca un mensaje por pantalla
     */
    public void prompt()
    {
        System.out.println("Inserta la cantidad correcta de dinero");
    }
    

}
