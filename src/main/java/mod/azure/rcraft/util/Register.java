package mod.azure.rcraft.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.ImmutableList;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import mod.azure.rcraft.items.ItemBaseGun;
import mod.azure.rcraft.items.ItemBaseMagic;
import mod.azure.rcraft.items.ItemBaseSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Loader;

public class Register {

	private static final Logger LOGGER = LogManager.getLogger();
	private static final List<String> EARTH = ImmutableList.of(
			"harvestcleric1", "macabredancer2", "shadowwarlock3", "shadowwarlock7",
			"shadowwarlock12", "shadowwarlock14", "wavemaster2", "wavemaster5",
			"wavemaster26", "wavemaster30", "wavemaster37"
			);
	private static final List<String> LIGHTNING = ImmutableList.of(
			"harvestcleric2", "shadowwarlock10", "wavemaster6", "wavemaster12",
			"wavemaster20", "wavemaster24", "wavemaster27", "wavemaster34",
			"wavemaster38", "wavemaster42"
			);
	private static final List<String> HEALING = ImmutableList.of(
			"harvestcleric3", "shadowwarlock4", "shadowwarlock11", "shadowwarlock13",
			"wavemaster8", "wavemaster29", "wavemaster33", "wavemaster41"
			);
	private static final List<String> SORCERY = ImmutableList.of(
			"harvestcleric4", "harvestcleric5", "harvestcleric7", "macabredancer1",
			"shadowwarlock2", "shadowwarlock5", "shadowwarlock9", "wavemaster9",
			"wavemaster14", "wavemaster19", "wavemaster22", "wavemaster23",
			"wavemaster35", "wavemaster43", "wavemaster44"
			);
	private static final List<String> ICE = ImmutableList.of(
			"harvestcleric6", "shadowwarlock8", "wavemaster3", "wavemaster10",
			"wavemaster17", "wavemaster31"
			);
	private static final List<String> FIRE = ImmutableList.of(
			"harvestcleric8", "harvestcleric9", "macabredancer4", "macabredancer5",
			"wavemaster4", "wavemaster11", "wavemaster18", "wavemaster25",
			"wavemaster32", "wavemaster39"
			);
	private static final List<String> NECROMANCY = ImmutableList.of(
			"macabredancer3", "shadowwarlock6", "wavemaster7", "wavemaster21",
			"wavemaster28", "wavemaster36", "wavemaster40"
			);
	private static final List<String> MAGIC = ImmutableList.of(
			"shadowwarlock1", "wavemaster1", "wavemaster13", "wavemaster15",
			"wavemaster16"
			);
	
	public static Item[] itemList;
	public static NonNullList<ItemStack> variantList; 
	static {
		List<Item> items = new ArrayList<Item>();
		for (int i = 1; i <= 19; i ++) items.add(new ItemBaseSword("bladebrandier" + i, 3 * i));
		for (int i = 1; i <= 25; i ++) items.add(new ItemBaseSword("dualswords" + i, 2 * i));
		for (int i = 1; i <= 20; i ++) items.add(new ItemBaseSword("edgepunisher" + i, 4 * i));
		for (int i = 1; i <= 9; i ++) items.add(new ItemBaseSword("flickreaper" + i, 4 * i));
		for (int i = 1; i <= 9; i ++) items.add(new ItemBaseSword("lordpartizan" + i, 4 * i));
		for (int i = 1; i <= 11; i ++) items.add(new ItemBaseSword("tribalgrappler" + i, 3 * i));
		for (int i = 1; i <= 41; i ++) items.add(new ItemBaseSword("blademaster" + i, 3 * i));
		for (int i = 1; i <= 45; i ++) items.add(new ItemBaseSword("heavyaxeman" + i, 4 * i));
		for (int i = 1; i <= 38; i ++) items.add(new ItemBaseSword("heavyblade" + i, 4 * i));
		for (int i = 1; i <= 42; i ++) items.add(new ItemBaseSword("longarm" + i, 4 * i));
		for (int i = 1; i <= 79; i ++) items.add(new ItemBaseSword("twinblade" + i, 2 * i));
		items.add(new ItemBaseGun("dualgunner1"));
		items.add(new ItemBaseGun("dualgunner2"));
		items.add(new ItemBaseGun("dualgunner3"));
		for (int i = 1; i <= 18; i ++) items.add(new ItemBaseGun("steamgunner" + i));
		if(Loader.isModLoaded("ebwizardry")) {
			for (String s : EARTH ) {items.add(new ItemBaseMagic(s, Tier.MASTER, Element.EARTH));};
			for (String s : LIGHTNING ) {items.add(new ItemBaseMagic(s, Tier.MASTER, Element.LIGHTNING));};
			for (String s : HEALING ) {items.add(new ItemBaseMagic(s, Tier.MASTER, Element.HEALING));};
			for (String s : SORCERY ) {items.add(new ItemBaseMagic(s, Tier.MASTER, Element.SORCERY));};
			for (String s : ICE ) {items.add(new ItemBaseMagic(s, Tier.MASTER, Element.ICE));};
			for (String s : FIRE ) {items.add(new ItemBaseMagic(s, Tier.MASTER, Element.FIRE));};
			for (String s : NECROMANCY ) {items.add(new ItemBaseMagic(s, Tier.MASTER, Element.NECROMANCY));};
			for (String s : MAGIC ) {items.add(new ItemBaseMagic(s, Tier.MASTER, Element.MAGIC));};
			itemList = items.toArray(new Item[items.size()]);
			LOGGER.debug("Registered with EB");
		} else {
			for (int i = 1; i <= 9; i ++) items.add(new ItemBaseGun("harvestcleric" + i));
			for (int i = 1; i <= 5; i ++) items.add(new ItemBaseGun("macabredancer" + i));
			for (int i = 1; i <= 14; i ++) items.add(new ItemBaseGun("shadowwarlock" + i));
			for (int i = 1; i <= 44; i ++) items.add(new ItemBaseGun("wavemaster" + i));
			itemList = items.toArray(new Item[items.size()]);
			LOGGER.debug("Registered without EB");
		}
	}
}