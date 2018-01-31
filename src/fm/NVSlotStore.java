package fm;

public class NVSlotStore extends SlotStore {

    protected Slot makeSlot(slottype type) {
        switch (type) {
            case straight:
                return new NVSlotStraight();
            case bonus:
                return new NVSlotBonus();
            case progressive:
                return new NVSlotProgressive();
            default:
                return null;
        }
    }
}
