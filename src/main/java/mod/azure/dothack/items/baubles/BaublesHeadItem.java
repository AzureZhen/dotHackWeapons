package mod.azure.dothack.items.baubles;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.DotHackTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaublesHeadItem extends Item implements IBauble {

	public BaublesHeadItem() {
		super();
		this.setCreativeTab(DotHackMod.tab);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.HEAD;
	}

}