package io.github.tt432.kitchenkarrot.item;

import io.github.tt432.kitchenkarrot.block.ModBlocks;
import io.github.tt432.kitchenkarrot.item.food.*;
import io.github.tt432.kitchenkarrot.item.food.BowlFoodItem;
import net.minecraft.core.NonNullList;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

import java.util.Comparator;

import static io.github.tt432.kitchenkarrot.Kitchenkarrot.MOD_ID;

/**
 * @author DustW
 **/
@SuppressWarnings("unused")
@ParametersAreNonnullByDefault
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<FoodItem> BEEF_IN_DRIPLEAF = ITEMS.register("beef_in_dripleaf", () -> new FoodItem(12, 16).setIndex(25));
    public static final RegistryObject<FoodItem> SMALL_BEEF_IN_DRIPLEAF = ITEMS.register("small_beef_in_dripleaf", () -> new FoodItem(6, 8).setIndex(26));
    public static final RegistryObject<FoodItem> BAMBOO_POTATO = ITEMS.register("bamboo_potato", () -> new FoodItem(8, 8).setIndex(27));
    public static final RegistryObject<FoodItem> PICKLED_SEA_PICKLES = ITEMS.register("pickled_sea_pickles", () -> new FoodItem(3, 2).setIndex(28));
    public static final RegistryObject<FoodItem> BIRCH_SAP_CHOCOLATE_BAR = ITEMS.register("birch_sap_chocolate_bar", () -> new FoodItem(5, 9.2F).setIndex(29));
    public static final RegistryObject<FoodItem> CHOCOLATE_CROISSANT = ITEMS.register("chocolate_croissant", () -> new FoodItem(7, 8).setIndex(30));
    public static final RegistryObject<FoodItem> BEETROOT_CREPE = ITEMS.register("beetroot_crepe", () -> new FoodItem(10, 9.6F).setIndex(31));
    public static final RegistryObject<FoodItem> CHINESE_CREPE = ITEMS.register("chinese_crepe", () -> new FoodItem(10, 9.6F).setIndex(32));
    public static final RegistryObject<FoodItem> CROQUE_MADAME = ITEMS.register("croque_madame", () -> new FoodItem(8, 10).setIndex(33));
    public static final RegistryObject<FoodItem> GRILLED_WHEATMEAL = ITEMS.register("grilled_wheatmeal", () -> new FoodItem(3, 1).setIndex(34));
    public static final RegistryObject<FoodItem> GRILLED_FISH_AND_CACTUS = ITEMS.register("grilled_fish_and_cactus", () -> new FoodItem(8, 6.4F).setIndex(35));
    public static final RegistryObject<FoodItem> FLOWER_CAKE = ITEMS.register("flower_cake", () -> new FoodItem(6, 4.8F).setIndex(36));
    public static final RegistryObject<FoodItem> PILLAGER_PIE = ITEMS.register("pillager_pie", () -> new FoodItem(8, 4.8F, EffectEntry.of(MobEffects.BAD_OMEN, 600, 1)).setIndex(37));
    public static final RegistryObject<FoodItem> MONSTER_LASAGNA = ITEMS.register("monster_lasagna", () -> new FoodItem(13, 3.2F, EffectEntry.of(MobEffects.HUNGER, 30, 1)).setIndex(40));
    public static final RegistryObject<FoodItem> SMALL_MONSTER_LASAGNA = ITEMS.register("small_monster_lasagna", () -> new FoodItem(5, 1.6F, EffectEntry.of(MobEffects.HUNGER, 10, 1)).setIndex(41));
    public static final RegistryObject<FoodItem> CHORUS_MOUSSE = ITEMS.register("chorus_mousse", () -> new FoodItem(12, 14.4F).setIndex(63));
    public static final RegistryObject<FoodItem> SMALL_CHORUS_MOUSSE = ITEMS.register("small_chorus_mousse", () -> new FoodItem(4, 4.8F).setIndex(64));
    public static final RegistryObject<FoodItem> SLIME_MOUSSE = ITEMS.register("slime_mousse", () -> new FoodItem(12, 14.4F).setIndex(65));
    public static final RegistryObject<FoodItem> SMALL_SLIME_MOUSSE = ITEMS.register("small_slime_mousse", () -> new FoodItem(4, 4.8F).setIndex(66));
    public static final RegistryObject<FoodItem> DUNGEON_PIZZA_SLICE = ITEMS.register("dungeon_pizza_slice", () -> new FoodItem(10, 6F, EffectEntry.of(MobEffects.POISON, 10, 0.2F)).setIndex(72));
    public static final RegistryObject<FoodItem> FEAST_PIZZA_SLICE = ITEMS.register("feast_pizza_slice", () -> new FoodItem(10, 12.8F).setIndex(68));
    public static final RegistryObject<FoodItem> SHINY_PIZZA_SLICE = ITEMS.register("shiny_pizza_slice", () -> new FoodItem(7, 24).setIndex(70));
    public static final RegistryObject<FoodItem> SWEET_LOAF = ITEMS.register("sweet_loaf", () -> new FoodItem(0, 0).setIndex(74));
    public static final RegistryObject<FoodItem> SWEET_LOAF_SLICE = ITEMS.register("sweet_loaf_slice", () -> new FoodItem(7, 9.6F).setIndex(75));
    public static final RegistryObject<FoodItem> EGG_TART = ITEMS.register("egg_tart", () -> new FoodItem(5, 7.2F).setIndex(90));
    public static final RegistryObject<FoodItem> SWEET_BERRY_TART = ITEMS.register("sweet_berry_tart", () -> new FoodItem(5, 7.2F).setIndex(91));
    public static final RegistryObject<FoodItem> CARROT_TART = ITEMS.register("carrot_tart", () -> new FoodItem(5, 7.2F).setIndex(92));
    public static final RegistryObject<FoodItem> HONEY_BRULEE = ITEMS.register("honey_brulee", () -> new FoodItem(4, 9.6F).setIndex(87));
    public static final RegistryObject<FoodItem> LAVA_BRULEE = ITEMS.register("lava_brulee", () -> new FoodItem(4, 9.6F).setIndex(88));
    public static final RegistryObject<FoodItem> HI_NRG_BRULEE = ITEMS.register("hi_nrg_brulee", () -> new FoodItem(4, 14.4F).setIndex(89));
    public static final RegistryObject<FoodItem> SIRLOIN_STEAK = ITEMS.register("sirloin_steak", () -> new FoodItem(12, 14.4F).setIndex(76));
    public static final RegistryObject<FoodItem> BEEF_GRAINS = ITEMS.register("beef_grains", () -> new FoodItem(3, 4).setIndex(77));
    public static final RegistryObject<FoodItem> SASHIMI = ITEMS.register("sashimi", () -> new FoodItem(4, 2.4F).setIndex(78));
    public static final RegistryObject<FoodItem> MOSS_FRIED_LAMB_CUTLETS = ITEMS.register("moss_fried_lamb_cutlets", () -> new FoodItem(10, 12.8F).setIndex(79));
    public static final RegistryObject<FoodItem> FRIES = ITEMS.register("fries", () -> new FoodItem(7, 10.8F).setIndex(80));
    public static final RegistryObject<FoodItem> DRUMSTICK = ITEMS.register("drumstick", () -> new FoodItem(9, 12.8F).setIndex(81));
    public static final RegistryObject<FoodItem> FRIED_CHICKEN_COMBO = ITEMS.register("fried_chicken_combo", () -> new FoodItem(15, 30).setIndex(82));
    public static final RegistryObject<FoodItem> RAW_VEGGIE_BEEF = ITEMS.register("raw_veggie_beef", () -> new FoodItem(3, 1.8F).setIndex(129));
    public static final RegistryObject<FoodItem> COOKED_VEGGIE_BEEF = ITEMS.register("cooked_veggie_beef", () -> new FoodItem(8, 12.8F).setIndex(130));
    public static final RegistryObject<FoodItem> RAW_VEGGIE_PORK = ITEMS.register("raw_veggie_pork", () -> new FoodItem(3, 0.6F).setIndex(131));
    public static final RegistryObject<FoodItem> COOKED_VEGGIE_PORK = ITEMS.register("cooked_veggie_pork", () -> new FoodItem(8, 12.8F).setIndex(132));
    public static final RegistryObject<FoodItem> RAW_VEGGIE_LAMB = ITEMS.register("raw_veggie_lamb", () -> new FoodItem(2, 1.2F).setIndex(133));
    public static final RegistryObject<FoodItem> COOKED_VEGGIE_LAMB = ITEMS.register("cooked_veggie_lamb", () -> new FoodItem(6, 7.2F).setIndex(134));


    public static final RegistryObject<DrinkItem> SOOTHING_TEA = ITEMS.register("soothing_tea", () -> new DrinkItem(3.6F) {
        @Override
        public int getUseDuration(ItemStack pStack) {
            return 48;
        }
        {setIndex(62);}
    });
    public static final RegistryObject<DrinkItem> BIRCH_SAP = ITEMS.register("birch_sap", () -> new DrinkItem(3, 2).setIndex(20));
    public static final RegistryObject<DrinkItem> ICED_MELON_LAGER = ITEMS.register("iced_melon_lager", () -> new DrinkItem(3, 2.4F, EffectEntry.of(MobEffects.FIRE_RESISTANCE, 300, 2, 1)).setIndex(109));
    public static final RegistryObject<DrinkItem> GLOW_BERRY_LAGER = ITEMS.register("glow_berry_lager", () -> new DrinkItem(2, 2.4F, EffectEntry.of(MobEffects.GLOWING, 300, 2, 1)).setIndex(110));
    public static final RegistryObject<DrinkItem> ACORN_WINE = ITEMS.register("acorn_wine", () -> new DrinkItem(2, 5.2F).setIndex(115));
    public static final RegistryObject<DrinkItem> MEAD = ITEMS.register("mead", () -> new DrinkItem(0, 0F).setIndex(116));
    public static final RegistryObject<DrinkItem> RUM = ITEMS.register("rum", () -> new DrinkItem(0, 0F, EffectEntry.of(MobEffects.DOLPHINS_GRACE, 300, 1)).setIndex(117));
    public static final RegistryObject<DrinkItem> VODKA = ITEMS.register("vodka", () -> new DrinkItem(0, 0F, EffectEntry.of(MobEffects.DAMAGE_BOOST, 300, 1)).setIndex(118));

    public static final RegistryObject<SnackItem> KELP_WITH_SUNFLOWER_SEED = ITEMS.register("kelp_with_sunflower_seed", () -> new SnackItem(2, 1, 12).setIndex(21));
    public static final RegistryObject<SnackItem> FRIED_PUMPKIN_CAKE = ITEMS.register("fried_pumpkin_cake", () -> new SnackItem(4, 3.2F, 24).setIndex(22));
    public static final RegistryObject<SnackItem> SEED_PIE = ITEMS.register("seed_pie", () -> new SnackItem(4, 2.4F, 24).setIndex(23));
    public static final RegistryObject<SnackItem> RICE_CAKE = ITEMS.register("rice_cake", () -> new SnackItem(4, 4, 18).setIndex(85));
    public static final RegistryObject<SnackItem> LEAFY_FRESH_CHOCOLATE = ITEMS.register("leafy_fresh_chocolate", () -> new SnackItem(2, 4.8F, 18).setIndex(86));

    public static final RegistryObject<SnackDrinkItem> LIGHT_SODA = ITEMS.register("light_soda", () -> new SnackDrinkItem(0, 0, 72000).setIndex(119));
    public static final RegistryObject<SnackDrinkItem> KELP_SODA = ITEMS.register("kelp_soda", () -> new SnackDrinkItem(0, 0F, 24, EffectEntry.of(MobEffects.WATER_BREATHING, 180, 1)).setIndex(120));
    public static final RegistryObject<SnackDrinkItem> TWISTING_SODA = ITEMS.register("twisting_soda", () -> new SnackDrinkItem(0, 0F, 24, EffectEntry.of(MobEffects.ABSORPTION, 60, 1)).setIndex(121));
    public static final RegistryObject<SnackDrinkItem> DANDELION_COKE = ITEMS.register("dandelion_coke", () -> new SnackDrinkItem(0, 0F, 24, EffectEntry.of(MobEffects.MOVEMENT_SPEED, 180, 2,1), EffectEntry.of(MobEffects.DIG_SPEED, 180,1)).setIndex(122));
    public static final RegistryObject<SnackDrinkItem> CORAL_COKE = ITEMS.register("coral_coke", () -> new SnackDrinkItem(0, 0F, 24, EffectEntry.of(MobEffects.MOVEMENT_SPEED, 180, 1), EffectEntry.of(MobEffects.DIG_SPEED, 180, 2, 1)).setIndex(123));
    public static final RegistryObject<SnackDrinkItem> DRAGON_BREATH_COKE = ITEMS.register("dragon_breath_coke", () -> new SnackDrinkItem(1, 3F, 24, EffectEntry.of(MobEffects.MOVEMENT_SPEED, 180, 2,1), EffectEntry.of(MobEffects.DIG_SPEED, 180, 2, 1)).setIndex(124));

    public static final RegistryObject<BowlFoodItem> FISHERMENS_DELIGHT = ITEMS.register("fishermens_delight", () -> new BowlFoodItem(10, 10.4F).setIndex(38));
    public static final RegistryObject<BowlFoodItem> LUSH_SALAD = ITEMS.register("lush_salad", () -> new BowlFoodItem(7, 6.4F).setIndex(50));
    public static final RegistryObject<BowlFoodItem> FRESH_SALAD = ITEMS.register("fresh_salad", () -> new BowlFoodItem(6, 4).setIndex(51));
    public static final RegistryObject<BowlFoodItem> TRAVELERS_SALAD = ITEMS.register("travelers_salad", () -> new BowlFoodItem(5, 3.2F).setIndex(52));
    public static final RegistryObject<BowlFoodItem> FRUIT_CEREAL_PORRIDGE = ITEMS.register("fruit_cereal_porridge", () -> new BowlFoodItem(7, 9.6F).setIndex(55));
    public static final RegistryObject<BowlFoodItem> CREEPER_CEREAL_PORRIDGE = ITEMS.register("creeper_cereal_porridge", () -> new BowlFoodItem(7, 9.6F).setIndex(56));

    public static final RegistryObject<InstantFoodItem> CANNED_RABBIT_PUMPKIN = ITEMS.register("canned_rabbit_pumpkin", () -> new InstantFoodItem(8, 12.8F).setIndex(99));
    public static final RegistryObject<InstantFoodItem> CANNED_PORK_BEETROOT = ITEMS.register("canned_pork_beetroot", () -> new InstantFoodItem(8, 12.8F).setIndex(100));
    public static final RegistryObject<InstantFoodItem> CANNED_CANDIED_APPLE = ITEMS.register("canned_candied_apple", () -> new InstantFoodItem(6, 14.4F).setIndex(101));
    public static final RegistryObject<InstantFoodItem> CANNED_BEEF_POTATO = ITEMS.register("canned_beef_potato", () -> new InstantFoodItem(8, 12.8F).setIndex(102));
    public static final RegistryObject<InstantFoodItem> CANNED_SWEET_BERRY_MILK = ITEMS.register("canned_sweet_berry_milk", () -> new InstantFoodItem(4, 4.8F, EffectEntry.of(MobEffects.INVISIBILITY, 90, 1)).setIndex(103));
    public static final RegistryObject<InstantFoodItem> CANNED_HOGLIN_CONFIT = ITEMS.register("canned_hoglin_confit", () -> new InstantFoodItem(8, 12.8F).setIndex(104));

    public static final RegistryObject<CreamSoupItem> CREAM_OF_MUSHROOM_SOUP = ITEMS.register("cream_of_mushroom_soup", () -> new CreamSoupItem(8, 9.2F).setIndex(39));

    public static final RegistryObject<SweetBerryMilkItem> SWEET_BERRY_MILK = ITEMS.register("sweet_berry_milk", () -> new SweetBerryMilkItem(4, 4.8F, EffectEntry.of(MobEffects.INVISIBILITY, 60, 1)).setIndex(42));

    public static final RegistryObject<UltraCerealItem> ULTRA_SUPER_DELICIOUS_CEREAL_PORRIDGE = ITEMS.register("ultra_super_delicious_cereal_porridge", () -> new UltraCerealItem(20, 100F).setIndex(57));

    public static final RegistryObject<CurryUdonItem> CURRY_UDON = ITEMS.register("curry_udon", () -> new CurryUdonItem(10, 14.4F).setIndex(84));

    public static final RegistryObject<PopacornItem> POPACORN = ITEMS.register("popacorn", () -> new PopacornItem(){{setIndex(83);}});

    public static final RegistryObject<Item> EMPTY_PLATE = ITEMS.register("plate_item", () -> new EmptyPlateItem(defaultProperties()).setIndex(1));

    public static final RegistryObject<Item> FOOD_FILLED_PLATE = ITEMS.register("plate", () -> new FilledPlateItem(ModBlocks.PLATE.get(), new Item.Properties()));

    public static final RegistryObject<KnifeItem> KNIFE = ITEMS.register("knife", ()->new KnifeItem(){{setIndex(2);}});

    public static final RegistryObject<ShakerItem> SHAKER = ITEMS.register("shaker", ShakerItem::new);

    public static final RegistryObject<BaseLiquorItem> RUM_BASE = ITEMS.register("rum_base", BaseLiquorItem::new);
    public static final RegistryObject<BaseLiquorItem> MEAD_BASE = ITEMS.register("mead_base", BaseLiquorItem::new);
    public static final RegistryObject<BaseLiquorItem> VODKA_BASE = ITEMS.register("vodka_base", BaseLiquorItem::new);
    public static final RegistryObject<BaseLiquorItem> ACORN_WINE_BASE = ITEMS.register("acorn_wine_base", BaseLiquorItem::new);

    public static final RegistryObject<Item> COCKTAIL = ITEMS.register("cocktail", CocktailItem::new);
    public static final RegistryObject<IndexItem> WATER = ITEMS.register("water", () -> new IndexItem(defaultProperties(),15));
    public static final RegistryObject<IndexItem> MILK = ITEMS.register("milk", () -> new IndexItem(defaultProperties(),16));
    public static final RegistryObject<IndexItem> EMPTY_CAN = ITEMS.register("empty_can", () -> new IndexItem(defaultProperties(),18));
    public static final RegistryObject<IndexItem> ICE_CUBES = ITEMS.register("ice_cubes", () -> new IndexItem(defaultProperties(),14));
    public static final RegistryObject<IndexItem> CARROT_SPICES = ITEMS.register("carrot_spices", () -> new IndexItem(defaultProperties(),13));
    public static final RegistryObject<IndexItem> ACORN = ITEMS.register("acorn", () -> new IndexItem(FoodUtil.food(defaultProperties(), 2, 1F),17));
    public static final RegistryObject<IndexItem> RAW_BEEF_IN_DRIPLEAF = ITEMS.register("raw_beef_in_dripleaf", () -> new IndexItem(defaultProperties(),24));
    public static final RegistryObject<IndexItem> DUNGEON_PIZZA = ITEMS.register("dungeon_pizza", () -> new IndexItem(defaultProperties(),71));
    public static final RegistryObject<IndexItem> FEAST_PIZZA = ITEMS.register("feast_pizza", () -> new IndexItem(defaultProperties(),67));
    public static final RegistryObject<IndexItem> SHINY_PIZZA = ITEMS.register("shiny_pizza", () -> new IndexItem(defaultProperties(),69));
    public static final RegistryObject<IndexItem> RAW_SWEET_LOAF = ITEMS.register("raw_sweet_loaf", () -> new IndexItem(defaultProperties(),73));
    public static final RegistryObject<IndexItem> PLATE_PIECES = ITEMS.register("plate_pieces", () -> new IndexItem(defaultProperties(),500));

    public static Item.Properties defaultProperties() {
        return new Item.Properties().tab(MAIN_TAB);
    }

    public static Item.Properties cocktailProperties() {
        return new Item.Properties().tab(COCKTAIL_TAB);
    }


    public static final CreativeModeTab COCKTAIL_TAB = new CreativeModeTab(MOD_ID + ".cocktail") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SHAKER.get());
        }
    };
    public static final CreativeModeTab MAIN_TAB = new CreativeModeTab(MOD_ID + ".main") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CARROT_SPICES.get());
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> pItems) {
            super.fillItemList(pItems);
            pItems.sort(Comparator.comparing(itemStack -> sorter(itemStack)));
        }
        private static int sorter(ItemStack itemStack){
            if (itemStack.getItem() instanceof IndexItem) {
                IndexItem item = (IndexItem) itemStack.getItem();
                return item.getIndex();
            }else return 0;
        }
    };

}
