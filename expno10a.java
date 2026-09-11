class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order Placement Started...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Order Placed Successfully!");
    }
}
class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order Delivery Started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Order Delivered Successfully!");
    }
}
 class Main {
    public static void main(String[] args) {
        OrderPlacement order = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();
        order.start();
        delivery.start();
    }
}
