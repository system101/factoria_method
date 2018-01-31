package fm;


public class NJSlotStore extends SlotStore {

	protected Slot makeSlot(slottype type) {
		Slot tmp = null;
		if (type.equals(slottype.straight)) { 
			tmp = new NJSlotStraight();
			tmp.cost=(float) (tmp.cost*1.1);
		}
                if (type.equals(slottype.bonus)) { 
			tmp = new NJSlotBonus();
			tmp.cost=(float) (tmp.cost*1.2);
		}
                if (type.equals(slottype.progressive)) { 
			tmp = new NJSlotProgressive();
			tmp.cost=(float) (tmp.cost*1.3);
		}
		return tmp;
	}
}
