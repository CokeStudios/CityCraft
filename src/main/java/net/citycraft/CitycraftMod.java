package net.citycraft;

import net.citycraft.block.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CitycraftMod implements ModInitializer {

    //* CITYCRAFT_BLOCKS ↓ *//

    public static final Block CERAMIC_TILE_1 = new Block
            (FabricBlockSettings.of(Material.GLASS,MapColor.WHITE).sounds(BlockSoundGroup.GLASS).strength(1f,3f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ceramic_tiles_1"), CERAMIC_TILE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ceramic_tiles_1"), new BlockItem(CERAMIC_TILE_1, new Item.Settings()));
    }

    public static final Block CERAMIC_TILE_2 = new Block
            (FabricBlockSettings.of(Material.GLASS,MapColor.WHITE).sounds(BlockSoundGroup.GLASS).strength(1f,3f));
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "ceramic_tiles_2"), CERAMIC_TILE_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "ceramic_tiles_2"), new BlockItem(CERAMIC_TILE_2, new Item.Settings()));
    }

    public static final Block FINE_SLATES = new Block
            (FabricBlockSettings.of(Material.STONE,MapColor.WHITE_GRAY).sounds(BlockSoundGroup.STONE).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "fine_slates"), FINE_SLATES);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "fine_slates"), new BlockItem(FINE_SLATES, new Item.Settings()));
    }

    public static final SlabBlock FINE_SLATES_SLAB = new SlabBlock
            (FabricBlockSettings.of(Material.STONE,MapColor.WHITE_GRAY).sounds(BlockSoundGroup.STONE).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","fine_slates_slab"), FINE_SLATES_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft","fine_slates_slab"), new BlockItem(FINE_SLATES_SLAB, new Item.Settings()));
    }

    public static final BlindSidewalkBlockBlock BLIND_SIDEWALK_BLOCK = new BlindSidewalkBlockBlock
            (FabricBlockSettings.of(Material.STONE,MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","blind_sidewalk_block"), BLIND_SIDEWALK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("citycraft","blind_sidewalk_block"), new BlockItem(BLIND_SIDEWALK_BLOCK, new Item.Settings()));
    }

    public static final BlindSidewalkSlabBlock BLIND_SIDEWALK_SLAB = new BlindSidewalkSlabBlock
            (FabricBlockSettings.of(Material.STONE,MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","blind_sidewalk_slab"), BLIND_SIDEWALK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("citycraft","blind_sidewalk_slab"), new BlockItem(BLIND_SIDEWALK_SLAB, new Item.Settings()));
    }

    public static final AmazingBlockBlock AMAZING_BLOCK = new AmazingBlockBlock
            (FabricBlockSettings.of(Material.STONE,MapColor.YELLOW).sounds(BlockSoundGroup.STONE).strength(1f,100f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","amazing_block"), AMAZING_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("citycraft","amazing_block"), new BlockItem(AMAZING_BLOCK, new Item.Settings()));
    }

    //* CITYCRAFT_ROADS_DECORATION ↓ *//

    public static final Block GREEN_BELT = new Block
            (FabricBlockSettings.of(Material.STONE,MapColor.BROWN).sounds(BlockSoundGroup.GRASS).strength(1f,5f));
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft", "green_belt"), GREEN_BELT);
        Registry.register(Registry.ITEM, new Identifier("citycraft", "green_belt"), new BlockItem(GREEN_BELT, new Item.Settings()));
    }

    public static final ModernIronBarsBlock MODERN_IRON_BARS = new ModernIronBarsBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","modern_iron_bars"), MODERN_IRON_BARS);
        Registry.register(Registry.ITEM, new Identifier("citycraft","modern_iron_bars"), new BlockItem(MODERN_IRON_BARS, new Item.Settings()));
    }

    public static final WarningColumnBlock WARNING_COLUMN = new WarningColumnBlock
            (FabricBlockSettings.of(Material.STONE,MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(1f,5f).requiresTool());
    static {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","warning_column"), WARNING_COLUMN);
        Registry.register(Registry.ITEM, new Identifier("citycraft","warning_column"), new BlockItem(WARNING_COLUMN, new Item.Settings()));
    }

    public static final TrafficBollardBlock TRAFFIC_BOLLARD = new TrafficBollardBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.ORANGE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","traffic_bollard"), TRAFFIC_BOLLARD);
        Registry.register(Registry.ITEM, new Identifier("citycraft","traffic_bollard"), new BlockItem(TRAFFIC_BOLLARD, new Item.Settings()));
    }
    public static final ConstructionBarrierBlock BLUE_CONSTRUCTION_BARRIER = new ConstructionBarrierBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","blue_construction_barrier"), BLUE_CONSTRUCTION_BARRIER);
        Registry.register(Registry.ITEM, new Identifier("citycraft","blue_construction_barrier"), new BlockItem(BLUE_CONSTRUCTION_BARRIER, new Item.Settings()));
    }

    public static final ConstructionBarrierBlock GREEN_CONSTRUCTION_BARRIER = new ConstructionBarrierBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","green_construction_barrier"), GREEN_CONSTRUCTION_BARRIER);
        Registry.register(Registry.ITEM, new Identifier("citycraft","green_construction_barrier"), new BlockItem(GREEN_CONSTRUCTION_BARRIER, new Item.Settings()));
    }

    public static final ElevatedRoadGuardrailBlock ELEVATED_ROAD_GUARDRAIL = new ElevatedRoadGuardrailBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","elevated_road_guardrail"), ELEVATED_ROAD_GUARDRAIL);
        Registry.register(Registry.ITEM, new Identifier("citycraft","elevated_road_guardrail"), new BlockItem(ELEVATED_ROAD_GUARDRAIL, new Item.Settings()));
    }

    public static final SoundInsulationBoard1Block SOUND_INSULATION_BOARD_1 = new SoundInsulationBoard1Block
            (FabricBlockSettings.of(Material.METAL,MapColor.GREEN).sounds(BlockSoundGroup.METAL).strength(1f,7f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","sound_insulation_board_1"), SOUND_INSULATION_BOARD_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft","sound_insulation_board_1"), new BlockItem(SOUND_INSULATION_BOARD_1, new Item.Settings()));
    }

    //* CITYCRAFT_ROADS_DECORATION ↓ *//

    public static final TrafficSignPole1Block TRAFFIC_SIGN_POLE_1 = new TrafficSignPole1Block
            (FabricBlockSettings.of(Material.METAL,MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","traffic_sign_pole_1"), TRAFFIC_SIGN_POLE_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft","traffic_sign_pole_1"), new BlockItem(TRAFFIC_SIGN_POLE_1, new Item.Settings()));
    }

    public static final TrafficSignSupportFrame1Block TRAFFIC_SIGN_SUPPORT_FRAME_1 = new TrafficSignSupportFrame1Block
            (FabricBlockSettings.of(Material.METAL,MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","traffic_sign_support_frame_1"), TRAFFIC_SIGN_SUPPORT_FRAME_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft","traffic_sign_support_frame_1"), new BlockItem(TRAFFIC_SIGN_SUPPORT_FRAME_1, new Item.Settings()));
    }

    public static final TrafficSignSupportFrame2Block TRAFFIC_SIGN_SUPPORT_FRAME_2 = new TrafficSignSupportFrame2Block
            (FabricBlockSettings.of(Material.METAL,MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","traffic_sign_support_frame_2"), TRAFFIC_SIGN_SUPPORT_FRAME_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft","traffic_sign_support_frame_2"), new BlockItem(TRAFFIC_SIGN_SUPPORT_FRAME_2, new Item.Settings()));
    }

    public static final TrafficSignSupportFrame3Block TRAFFIC_SIGN_SUPPORT_FRAME_3 = new TrafficSignSupportFrame3Block
            (FabricBlockSettings.of(Material.METAL,MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","traffic_sign_support_frame_3"), TRAFFIC_SIGN_SUPPORT_FRAME_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft","traffic_sign_support_frame_3"), new BlockItem(TRAFFIC_SIGN_SUPPORT_FRAME_3, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_S = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_s"), SQUARE_TRAFFIC_SIGN_S);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_s"), new BlockItem(SQUARE_TRAFFIC_SIGN_S, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_L = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_l"), SQUARE_TRAFFIC_SIGN_L);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_l"), new BlockItem(SQUARE_TRAFFIC_SIGN_L, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_R = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_r"), SQUARE_TRAFFIC_SIGN_R);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_r"), new BlockItem(SQUARE_TRAFFIC_SIGN_R, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_SL = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_sl"), SQUARE_TRAFFIC_SIGN_SL);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_sl"), new BlockItem(SQUARE_TRAFFIC_SIGN_SL, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_SR = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_sr"), SQUARE_TRAFFIC_SIGN_SR);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_sr"), new BlockItem(SQUARE_TRAFFIC_SIGN_SR, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_SLR = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_slr"), SQUARE_TRAFFIC_SIGN_SLR);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_slr"), new BlockItem(SQUARE_TRAFFIC_SIGN_SLR, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_UT = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_ut"), SQUARE_TRAFFIC_SIGN_UT);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_ut"), new BlockItem(SQUARE_TRAFFIC_SIGN_UT, new Item.Settings()));
    }

    public static final SquareTrafficSignBlock SQUARE_TRAFFIC_SIGN_LUT = new SquareTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","square_traffic_sign_lut"), SQUARE_TRAFFIC_SIGN_LUT);
        Registry.register(Registry.ITEM, new Identifier("citycraft","square_traffic_sign_lut"), new BlockItem(SQUARE_TRAFFIC_SIGN_LUT, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_10 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","speed_limit_sign_10"), SPEED_LIMIT_SIGN_10);
        Registry.register(Registry.ITEM, new Identifier("citycraft","speed_limit_sign_10"), new BlockItem(SPEED_LIMIT_SIGN_10, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_20 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","speed_limit_sign_20"), SPEED_LIMIT_SIGN_20);
        Registry.register(Registry.ITEM, new Identifier("citycraft","speed_limit_sign_20"), new BlockItem(SPEED_LIMIT_SIGN_20, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_30 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","speed_limit_sign_30"), SPEED_LIMIT_SIGN_30);
        Registry.register(Registry.ITEM, new Identifier("citycraft","speed_limit_sign_30"), new BlockItem(SPEED_LIMIT_SIGN_30, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_40 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","speed_limit_sign_40"), SPEED_LIMIT_SIGN_40);
        Registry.register(Registry.ITEM, new Identifier("citycraft","speed_limit_sign_40"), new BlockItem(SPEED_LIMIT_SIGN_40, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_50 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","speed_limit_sign_50"), SPEED_LIMIT_SIGN_50);
        Registry.register(Registry.ITEM, new Identifier("citycraft","speed_limit_sign_50"), new BlockItem(SPEED_LIMIT_SIGN_50, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_60 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","speed_limit_sign_60"), SPEED_LIMIT_SIGN_60);
        Registry.register(Registry.ITEM, new Identifier("citycraft","speed_limit_sign_60"), new BlockItem(SPEED_LIMIT_SIGN_60, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_70 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","speed_limit_sign_70"), SPEED_LIMIT_SIGN_70);
        Registry.register(Registry.ITEM, new Identifier("citycraft","speed_limit_sign_70"), new BlockItem(SPEED_LIMIT_SIGN_70, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_80 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","speed_limit_sign_80"), SPEED_LIMIT_SIGN_80);
        Registry.register(Registry.ITEM, new Identifier("citycraft","speed_limit_sign_80"), new BlockItem(SPEED_LIMIT_SIGN_80, new Item.Settings()));
    }

    public static final CircleTrafficSignBlock SPEED_LIMIT_SIGN_90 = new CircleTrafficSignBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLUE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","speed_limit_sign_90"), SPEED_LIMIT_SIGN_90);
        Registry.register(Registry.ITEM, new Identifier("citycraft","speed_limit_sign_90"), new BlockItem(SPEED_LIMIT_SIGN_90, new Item.Settings()));
    }

    //* CITYCRAFT_RAILWAY ↓ *//

    public static final Insulator1Block INSULATOR_1 = new Insulator1Block
            (FabricBlockSettings.of(Material.METAL,MapColor.WHITE).sounds(BlockSoundGroup.METAL).strength(1f,5f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","insulator_1"), INSULATOR_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft","insulator_1"), new BlockItem(INSULATOR_1, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_1 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_1"), OVERHEAD_CATENARY_1);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_1"), new BlockItem(OVERHEAD_CATENARY_1, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_2 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_2"), OVERHEAD_CATENARY_2);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_2"), new BlockItem(OVERHEAD_CATENARY_2, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_3 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_3"), OVERHEAD_CATENARY_3);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_3"), new BlockItem(OVERHEAD_CATENARY_3, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_4 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_4"), OVERHEAD_CATENARY_4);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_4"), new BlockItem(OVERHEAD_CATENARY_4, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_5 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_5"), OVERHEAD_CATENARY_5);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_5"), new BlockItem(OVERHEAD_CATENARY_5, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_6 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_6"), OVERHEAD_CATENARY_6);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_6"), new BlockItem(OVERHEAD_CATENARY_6, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_7 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_7"), OVERHEAD_CATENARY_7);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_7"), new BlockItem(OVERHEAD_CATENARY_7, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_8 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_8"), OVERHEAD_CATENARY_8);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_8"), new BlockItem(OVERHEAD_CATENARY_8, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_9 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_9"), OVERHEAD_CATENARY_9);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_9"), new BlockItem(OVERHEAD_CATENARY_9, new Item.Settings()));
    }

    public static final OverheadCatenaryBlock OVERHEAD_CATENARY_10 = new OverheadCatenaryBlock
            (FabricBlockSettings.of(Material.METAL,MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(1f,3f).requiresTool());
    {
        Registry.register(Registry.BLOCK, new Identifier("citycraft","overhead_catenary_10"), OVERHEAD_CATENARY_10);
        Registry.register(Registry.ITEM, new Identifier("citycraft","overhead_catenary_10"), new BlockItem(OVERHEAD_CATENARY_10, new Item.Settings()));
    }



    public static final ItemGroup CITYCRAFT_BLOCKS = FabricItemGroupBuilder.create(
            new Identifier("citycraft", "citycraft_blocks"))
            .icon(() -> new ItemStack(CitycraftMod.FINE_SLATES))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.CERAMIC_TILE_1));
                stacks.add(new ItemStack(CitycraftMod.CERAMIC_TILE_2));
                stacks.add(new ItemStack(CitycraftMod.FINE_SLATES));
                stacks.add(new ItemStack(CitycraftMod.FINE_SLATES_SLAB));
                stacks.add(new ItemStack(CitycraftMod.BLIND_SIDEWALK_BLOCK));
                stacks.add(new ItemStack(CitycraftMod.BLIND_SIDEWALK_SLAB));
                stacks.add(new ItemStack(CitycraftMod.AMAZING_BLOCK));
            })
            .build();

    public static final ItemGroup CITYCRAFT_ROADS_DECORATIONS = FabricItemGroupBuilder.create(
            new Identifier("citycraft","citycraft_roads_decorations"))
            .icon(() -> new ItemStack(CitycraftMod.MODERN_IRON_BARS))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.GREEN_BELT));
                stacks.add(new ItemStack(CitycraftMod.MODERN_IRON_BARS));
                stacks.add(new ItemStack(CitycraftMod.WARNING_COLUMN));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_BOLLARD));
                stacks.add(new ItemStack(CitycraftMod.BLUE_CONSTRUCTION_BARRIER));
                stacks.add(new ItemStack(CitycraftMod.GREEN_CONSTRUCTION_BARRIER));
                stacks.add(new ItemStack(CitycraftMod.ELEVATED_ROAD_GUARDRAIL));
                stacks.add(new ItemStack(CitycraftMod.SOUND_INSULATION_BOARD_1));
            })
            .build();

    public static final ItemGroup CITYCRAFT_TRAFFIC_SIGNS = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_traffic_signs"))
            .icon(() -> new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_S))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_SIGN_POLE_1));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_SIGN_SUPPORT_FRAME_1));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_SIGN_SUPPORT_FRAME_2));
                stacks.add(new ItemStack(CitycraftMod.TRAFFIC_SIGN_SUPPORT_FRAME_3));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_S));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_L));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_R));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SL));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SR));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_SLR));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_UT));
                stacks.add(new ItemStack(CitycraftMod.SQUARE_TRAFFIC_SIGN_LUT));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_10));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_20));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_30));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_40));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_50));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_60));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_70));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_80));
                stacks.add(new ItemStack(CitycraftMod.SPEED_LIMIT_SIGN_90));
            })
            .build();
/*
    public static final ItemGroup CITYCRAFT_ROADS = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_roads"))
            .icon(() -> new ItemStack(CitycraftMod.))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.));
            })
            .build();
*/
    public static final ItemGroup CITYCRAFT_RAILWAY = FabricItemGroupBuilder.create(
                    new Identifier("citycraft","citycraft_railway"))
            .icon(() -> new ItemStack(Blocks.RAIL))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CitycraftMod.INSULATOR_1));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_1));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_2));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_3));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_4));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_5));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_6));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_7));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_8));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_9));
                stacks.add(new ItemStack(CitycraftMod.OVERHEAD_CATENARY_10));
            })
            .build();

    public static final ItemGroup MINECRAFT_SPECIAL_THINGS = FabricItemGroupBuilder.create(
            new Identifier("citycraft","minecraft_special_things"))
            .icon(() -> new ItemStack(Items.DRAGON_EGG))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.DRAGON_EGG));
                stacks.add(new ItemStack(Items.DEBUG_STICK));
                stacks.add(new ItemStack(Items.COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.STRUCTURE_BLOCK));
                stacks.add(new ItemStack(Items.BARRIER));
            })
            .build();



    public static final Identifier NEVER_GONNA_GIVE_YOU_UP = new Identifier("citycraft:never_gonna_give_you_up");
    public static SoundEvent NEVER_GONNA_GIVE_YOU_UP_SOUND = new SoundEvent(NEVER_GONNA_GIVE_YOU_UP);
    {
        Registry.register(Registry.SOUND_EVENT, CitycraftMod.NEVER_GONNA_GIVE_YOU_UP, NEVER_GONNA_GIVE_YOU_UP_SOUND);
    }
}