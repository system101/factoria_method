package fm;


public class TestSlots {
	public static void main(String[] args) {
		SlotStore NVStore = new NVSlotStore();
		SlotStore NJStore = new NJSlotStore();
                SlotStore WTStore = new WTSlotStore();
                
		Slot slot = WTStore.orderSlot(slottype.bonus);
		System.out.println("Juan ordered a "+ slot.getName());
		slot = NJStore.orderSlot(slottype.straight);
		System.out.println("Camila ordered a "+ slot.getName());
	}

}
