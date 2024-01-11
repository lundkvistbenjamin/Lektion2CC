public class Main {
    public static void main(String[] args) {

        Shirt nikeShirt = new Shirt("Nike", "Black", 49.90);
        System.out.println(("Brand: " + nikeShirt.getBrand()));
        System.out.println(("Color: " + nikeShirt.getColor()));
        System.out.println(("Price: " + nikeShirt.getPrice()));

        Shirt pumaShirt = new Shirt("Puma", "Grey", 29.90);
        System.out.println(("Brand: " + pumaShirt.getBrand()));
        System.out.println(("Color: " + pumaShirt.getColor()));
        System.out.println(("Price: " + pumaShirt.getPrice()));
    }
}