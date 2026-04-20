public class Store {
    DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];

    public void addDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = disc;
                break;
            }
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == disc) {
                itemsInStore[i] = null;
                break;
            }
        }
    }
}
