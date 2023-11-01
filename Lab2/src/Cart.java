
public class Cart {
	private int qtyOrdered;
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered <= MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for(DigitalVideoDisc disc : dvdList){
            if(qtyOrdered <= MAX_NUMBERS_ORDERED){
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc has been added");
            }
            else{
                System.out.println("The cart is almost full");
                break;
            }
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int index_disc = 0;
        for(int i=0; i<qtyOrdered; i++){
            if(disc.equals(itemsOrdered[i])) break;
            index_disc++;
        }
        if(index_disc == qtyOrdered) {
        	System.out.println(disc.getTitle() + "is not in cart");
        }
        for(int i=index_disc; i<qtyOrdered-1; i++){
            itemsOrdered[i] = itemsOrdered[i+1];
        }
        qtyOrdered--;
        System.out.println(disc.getTitle() + "has been deleted");
    }
    public float totalCost() {
        float sum = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
    public void print() {
        System.out.println("\t\t******CART******");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].toString());
        }
        System.out.println("\t\t****************");
    }
}
