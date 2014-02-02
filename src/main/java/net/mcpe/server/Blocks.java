package net.MCPEBukkit.server;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Block {

    public static final RegistryMaterials REGISTRY = new RegistryBlocks("air");
    private CreativeModeTab creativeTab;
    protected String d;
    public static final StepSound e = new StepSound("STONE", 1.0F, 1.0F);
    public static final StepSound f = new StepSound("WOOD", 1.0F, 1.0F);
    public static final StepSound g = new StepSound("GRAVEL", 1.0F, 1.0F);
    public static final StepSound h = new StepSound("GRASS", 1.0F, 1.0F);
    public static final StepSound i = new StepSound("STONE", 1.0F, 1.0F);
    public static final StepSound j = new StepSound("STONE", 1.0F, 1.5F);
    public static final StepSound k = new StepSoundSTONE("STONE", 1.0F, 1.0F);
    public static final StepSound l = new StepSound("CLOTH", 1.0F, 1.0F);
    public static final StepSound m = new StepSound("SAND", 1.0F, 1.0F);
    public static final StepSound n = new StepSound("SNOW", 1.0F, 1.0F);
    public static final StepSound o = new StepSoundLadder("LADDER", 1.0F, 1.0F);
    protected boolean q;
    protected int r;
    protected boolean s;
    protected int t;
    protected boolean u;
    protected float strength;
    protected float durability;
    protected boolean x = true;
    protected boolean y = true;
    protected boolean z;
    protected boolean isTileEntity;
    protected double minX;
    protected double minY;
    protected double minZ;
    protected double maxX;
    protected double maxY;
    protected double maxZ;
    public StepSound stepSound;
    public float I;
    protected final Material material;
    public float frictionFactor;
    private String name;

    public static int b(Block block) {
        return REGISTRY.b(block);
    }

    public static Block e(int i) {
        return (Block) REGISTRY.a(i);
    }

    public static Block a(Item item) {
        return e(Item.b(item));
    }

    public static Block b(String s) {
        if (REGISTRY.b(s)) {
            return (Block) REGISTRY.a(s);
        } else {
            try {
                return (Block) REGISTRY.a(Integer.parseInt(s));
            } catch (NumberFormatException numberformatexception) {
                return null;
            }
        }
    }

    public boolean j() {
        return this.q;
    }

    public int k() {
        return this.r;
    }

    public int m() {
        return this.t;
    }

    public boolean n() {
        return this.u;
    }

    public Material getMaterial() {
        return this.material;
    }

    public MaterialMapColor f(int i) {
        return this.getMaterial().r();
    }

    public static void p() {
        REGISTRY.a(0, "AIR", (new BlockAir()).c("AIR"));
        REGISTRY.a(1, "STONE", (new BlockSTONE()).c(1.5F).b(10.0F).a(i).c("STONE").d("STONE"));
        REGISTRY.a(2, "GRASS", (new BlockGrass()).c(0.6F).a(h).c("DIRT").d("GRASS"));
        REGISTRY.a(3, "DIRT", (new BlockDirt()).c(0.5F).a(g).c("DIRT").d("DIRT"));
        Block block = (new Block(Material.STONE)).c(2.0F).b(10.0F).a(i).c("STONEBRICK").a(CreativeModeTab.b).d("COBBLESTONE");

        REGISTRY.a(4, "COBBLESTONE", block);
        Block block1 = (new BlockWood()).c(2.0F).b(5.0F).a(f).c("WOOD").d("PLANKS");

        REGISTRY.a(5, "PLANKS", block1);
        REGISTRY.a(6, "SAPLING", (new BlockSapling()).c(0.0F).a(h).c("SAPLING").d("SAPLING"));
        REGISTRY.a(7, "BEDROCK", (new Block(Material.STONE)).s().b(6000000.0F).a(i).c("BEDROCK").H().a(CreativeModeTab.b).d("BEDROCK"));
        REGISTRY.a(8, "FLOWING_WATER", (new BlockFlowing(Material.WATER)).c(100.0F).g(3).c("WATER").H().d("WATER_FLOW"));
        REGISTRY.a(9, "WATER", (new BlockStationary(Material.WATER)).c(100.0F).g(3).c("WATER").H().d("WATER_STILL"));
        REGISTRY.a(10, "FLOWING_LAVA", (new BlockFlowing(Material.LAVA)).c(100.0F).a(1.0F).c("LAVA").H().d("LAVA_FLOWW"));
        REGISTRY.a(11, "LAVA", (new BlockStationary(Material.LAVA)).c(100.0F).a(1.0F).c("LAVA").H().d("LAVA_STILL"));
        REGISTRY.a(12, "SAND", (new BlockSand()).c(0.5F).a(m).c("SAND").d("SAND"));
        REGISTRY.a(13, "GRAVEL", (new BlockGravel()).c(0.6F).a(g).c("GRAVEL").d("GRAVEL"));
        REGISTRY.a(14, "GOLD_ORE", (new BlockOre()).c(3.0F).b(5.0F).a(i).c("OREGOLD").d("GOLD_ORE"));
        REGISTRY.a(15, "IRON_ORE", (new BlockOre()).c(3.0F).b(5.0F).a(i).c("OREIRON").d("IRON_ORE"));
        REGISTRY.a(16, "COAL_ORE", (new BlockOre()).c(3.0F).b(5.0F).a(i).c("ORECOAL").d("COAL_ORE"));
        REGISTRY.a(17, "LOG", (new BlockLog1()).c("LOG").d("LOG"));
        REGISTRY.a(18, "LEAVES", (new BlockLeaves1()).c("LEAVES").d("LEAVES"));
        REGISTRY.a(19, "SPONGE", (new BlockSponge()).c(0.6F).a(h).c("SPONGE").d("SPONGE"));
        REGISTRY.a(20, "GLASS", (new BlockGlass(Material.SHATTERABLE, false)).c(0.3F).a(k).c("GLASS").d("GLASS"));
        REGISTRY.a(21, "LAPIS_ORE", (new BlockOre()).c(3.0F).b(5.0F).a(i).c("ORELAPIS").d("LAPIS_ORE"));
        REGISTRY.a(22, "LAPIS_BLOCK", (new BlockOreBlock(MaterialMapColor.H)).c(3.0F).b(5.0F).a(i).c("BLOCK_LAPIS").a(CreativeModeTab.b).d("LAPIS_BLOCK"));
        Block block2 = (new BlockSandSTONE()).a(i).c(0.8F).c("SANDSTONE").d("SANDSTONE");

        REGISTRY.a(24, "SANDSTONE", block2);
        REGISTRY.a(26, "BED_BLOCK", (new BlockBed()).c(0.2F).c("BED_BLOCK").H().d("BED_BLOCK"));
        REGISTRY.a(30, "COBWEB", (new BlockWeb()).g(1).c(4.0F).c("COBWEB").d("COBWEB"));
        REGISTRY.a(31, "TALL_GRASS", (new BlockLongGrass()).c(0.0F).a(h).c("TALL_GRASS"));
        REGISTRY.a(32, "DEAD_BUSH", (new BlockDeadBush()).c(0.0F).a(h).c("DEAD_BUSH").d("DEAD_BUSH"));
        REGISTRY.a(35, "WOOL", (new BlockCloth(Material.CLOTH)).c(0.8F).a(l).c("CLOTH").d("WOOL_COLORED"));
        REGISTRY.a(37, "DANDELION", (new BlockFlowers(0)).c(0.0F).a(h).c("flower1").d("flower_dandelion"));
        REGISTRY.a(38, "RED_FLOWER", (new BlockFlowers(1)).c(0.0F).a(h).c("flower2").d("flower_rose"));
        REGISTRY.a(39, "BROWN_MUSHROOM", (new BlockMushroom()).c(0.0F).a(h).a(0.125F).c("MUSHROOM").d("MUSHROOM_BROWN"));
        REGISTRY.a(40, "RED_MUSHROOM", (new BlockMushroom()).c(0.0F).a(h).c("MUSHROOM").d("MUSHROOM_RED"));
        REGISTRY.a(41, "GOLD_BLOCK", (new BlockOreBlock(MaterialMapColor.F)).c(3.0F).b(10.0F).a(j).c("BLOCKGOLD").d("GOLD_BLOCK"));
        REGISTRY.a(42, "IRON_BLOCK", (new BlockOreBlock(MaterialMapColor.h)).c(5.0F).b(10.0F).a(j).c("BLOCKIRON").d("IRONBLOCK"));
        REGISTRY.a(43, "DOUBLE_STONE_SLAB", (new BlockStep(true)).c(2.0F).b(10.0F).a(i).c("STONESLAB"));
        REGISTRY.a(44, "STONESLAB", (new BlockStep(false)).c(2.0F).b(10.0F).a(i).c("STONESLAB"));
        Block block3 = (new Block(Material.STONE)).c(2.0F).b(10.0F).a(i).c("BRICK").a(CreativeModeTab.b).d("BRICK");

        REGISTRY.a(45, "BRICK_BLOCK", block3);
        REGISTRY.a(46, "TNT", (new BlockTNT()).c(0.0F).a(h).c("TNT").d("TNT"));
        REGISTRY.a(47, "BOOKSHELF", (new BlockBookshelf()).c(1.5F).a(f).c("BOOKSHELF").d("BOOKSHELF"));
        REGISTRY.a(48, "MOSSY_STONE", (new Block(Material.STONE)).c(2.0F).b(10.0F).a(i).c("STONEMOSS").a(CreativeModeTab.b).d("MOSSSTONE"));
        REGISTRY.a(49, "OBSIDIAN", (new BlockObsidian()).c(50.0F).b(2000.0F).a(i).c("OBSIDIAN").d("OBSIDIAN"));
        REGISTRY.a(50, "TORCH", (new BlockTorch()).c(0.0F).a(0.9375F).a(f).c("TORCH").d("TORCH_ON"));
        REGISTRY.a(51, "FIRE", (new BlockFire()).c(0.0F).a(1.0F).a(f).c("FIRE").H().d("FIRE"));
        REGISTRY.a(53, "OAK_WOOD_STAIRS", (new BlockStairs(block1, 0)).c("OAK_WOODEN_STAIRS"));
        REGISTRY.a(54, "CHEST", (new BlockChest(0)).c(2.5F).a(f).c("CHEST"));
        REGISTRY.a(56, "DIAMOND_ORE", (new BlockOre()).c(3.0F).b(5.0F).a(i).c("OREDIAMOND").d("DIAMOND_ORE"));
        REGISTRY.a(57, "DIAMOND_BLOCK", (new BlockOreBlock(MaterialMapColor.G)).c(5.0F).b(10.0F).a(j).c("BLOCKDIAMOND").d("DIAMOND_BLOCK"));
        REGISTRY.a(58, "CRAFTING_TABLE", (new BlockWorkbench()).c(2.5F).a(f).c("WORKBENCH").d("CRAFTING_TABLE"));
        REGISTRY.a(59, "WHEAT_BLOCK", (new BlockCrops()).c("CROPS").d("WHEAT"));
        Block block4 = (new BlockSoil()).c(0.6F).a(g).c("FARMLAND").d("FARMLAND");

        REGISTRY.a(60, "FARMLAND", block4);
        REGISTRY.a(61, "FURNACE", (new BlockFurnace(false)).c(3.5F).a(i).c("FURNACE").a(CreativeModeTab.c));
        REGISTRY.a(62, "LIT_FURNACE", (new BlockFurnace(true)).c(3.5F).a(i).a(0.875F).c("FURNACE"));
        REGISTRY.a(63, "SIGN_POST", (new BlockSign(TileEntitySign.class, true)).c(1.0F).a(f).c("SIGN").H());
        REGISTRY.a(64, "WOODEN_DOOR", (new BlockDoor(Material.WOOD)).c(3.0F).a(f).c("DOORWOOD").H().d("DOOR_WOOD"));
        REGISTRY.a(65, "LADDER", (new BlockLadder()).c(0.4F).a(o).c("LADDER").d("LADDER"));
        REGISTRY.a(66, "RAIL", (new BlockMinecartTrack()).c(0.7F).a(j).c("RAIL").d("RAIL_NORMAL"));
        REGISTRY.a(67, "STONE_STAIRS", (new BlockStairs(block, 0)).c("STAIRSSTONE"));
        REGISTRY.a(68, "WALL_SIGN", (new BlockSign(TileEntitySign.class, false)).c(1.0F).a(f).c("SIGN").H());
        REGISTRY.a(71, "IRON_DOOR_BLOCK", (new BlockDoor(Material.ORE)).c(5.0F).a(j).c("DOORIRON").H().d("DOOR_IRON"));
        REGISTRY.a(73, "REDSTONE_ORE", (new BlockRedSTONEOre(false)).c(3.0F).b(5.0F).a(i).c("OREREDSTONE").a(CreativeModeTab.b).d("REDSTONE_ORE"));
        REGISTRY.a(74, "GLOWING REDSTONE ORE", (new BlockRedSTONEOre(true)).a(0.625F).c(3.0F).b(5.0F).a(i).c("OREREDSTONE").d("REDSTONE_ORE"));
        REGISTRY.a(78, "SNOW_LAYER", (new BlockSnow()).c(0.1F).a(n).c("SNOW").g(0).d("SNOW"));
        REGISTRY.a(79, "ICE", (new BlockIce()).c(0.5F).g(3).a(k).c("ICE").d("ICE"));
        REGISTRY.a(80, "SNOW_BLOCK", (new BlockSnowBlock()).c(0.2F).a(n).c("SNOW").d("SNOW"));
        REGISTRY.a(81, "CACTUS", (new BlockCactus()).c(0.4F).a(l).c("CACTUS").d("CACTUS"));
        REGISTRY.a(82, "CLAY", (new BlockClay()).c(0.6F).a(g).c("CLAY").d("CLAY"));
        REGISTRY.a(83, "REEDS", (new BlockReed()).c(0.0F).a(h).c("SUGARCANE_BLOCK").H().d("reeds"));
        REGISTRY.a(85, "FENCE", (new BlockFence("PLANTS_OAK", Material.WOOD)).c(2.0F).b(5.0F).a(f).c("FENCE"));
        Block block5 = (new BlockPumpkin(false)).c(1.0F).a(f).c("PUMPKIN").d("PUMPKIN");

        REGISTRY.a(86, "PUMPKIN", block5);
        REGISTRY.a(87, "NETHERRACK", (new BlockBloodSTONE()).c(0.4F).a(i).c("HELLROCK").d("NETHERRACK"));
        //REGISTRY.a(88, "soul_sand", (new BlockSlowSand()).c(0.5F).a(m).c("hellsand").d("soul_sand"));
        REGISTRY.a(89, "GLOWSTONE", (new BlockLightSTONE(Material.SHATTERABLE)).c(0.3F).a(k).a(1.0F).c("LIGHTGEM").d("GLOWSTONE_BLOCK"));
        REGISTRY.a(91, "LIT_PUMPKIN", (new BlockPumpkin(true)).c(1.0F).a(f).a(1.0F).c("LITPUMPKIN").d("PUMPKIN"));
        REGISTRY.a(92, "CAKE_BLOCK", (new BlockCake()).c(0.5F).a(l).c("CAKE_BLOCK").H().d("CAKE_BLOCK"));
        REGISTRY.a(96, "TRAPDOOR", (new BlockTrapdoor(Material.WOOD)).c(3.0F).a(f).c("TRAPDOOR").H().d("TRAPDOOR"));
        //Not yet? REGISTRY.a(97, "monster_egg", (new BlockMonsterEggs()).c(0.75F).c("monsterSTONEEgg"));
        Block block6 = (new BlockSmoothBrick()).c(1.5F).b(10.0F).a(i).c("STONEBRICKSMOOTH").d("STONEBRICK");

        REGISTRY.a(98, "STONEBRICK", block6);
        REGISTRY.a(101, "IRON_BAR", (new BlockThin("IRON_BARS", "IRON_BARS", Material.ORE, true)).c(5.0F).b(10.0F).a(j).c("FENCEIRON"));
        REGISTRY.a(102, "GLASS_PANE", (new BlockThin("GLASS", "GLASS_PANE_TOP", Material.SHATTERABLE, false)).c(0.3F).a(k).c("THINGLASS"));
        Block block7 = (new BlockMelon()).c(1.0F).a(f).c("MELON").d("MELON");

        REGISTRY.a(103, "MELON_BLOCK", block7);
        REGISTRY.a(104, "PUMPKIN_STEM", (new BlockStem(block5)).c(0.0F).a(f).c("PUMPKIN_STEM").d("PUMPKIN_STEM"));
        REGISTRY.a(105, "MELON_STEM", (new BlockStem(block7)).c(0.0F).a(f).c("PUMPKIN_STEM").d("MELON_STEM"));
        REGISTRY.a(107, "FENCE_GATE", (new BlockFenceGate()).c(2.0F).b(5.0F).a(f).c("FENCEGATE"));
        REGISTRY.a(108, "BRICK_STAIRS", (new BlockStairs(block3, 0)).c("STAIRSBRICK"));
        REGISTRY.a(109, "STONE_BRICK_STAIRS", (new BlockStairs(block6, 0)).c("STAIRSSTONEBRICKSMOOTH"));
        Block block8 = (new Block(Material.STONE)).c(2.0F).b(10.0F).a(i).c("NETHERBRICK").a(CreativeModeTab.b).d("NETHER_BRICK");

        REGISTRY.a(112, "NETHER_BRICK", block8);
        REGISTRY.a(113, "NETHER_BRICK_FENCE", (new BlockFence("NETHER_BRICK", Material.STONE)).c(2.0F).b(10.0F).a(i).c("NETHERFENCE"));
        REGISTRY.a(125, "DOUBLE_WOODED_SLAB", (new BlockWoodStep(true)).c(2.0F).b(5.0F).a(f).c("WOODSLAB"));
        REGISTRY.a(126, "WOODEN_SLAB", (new BlockWoodStep(false)).c(2.0F).b(5.0F).a(f).c("WOODSLAB"));
        REGISTRY.a(128, "SANDSTONE_STAIRS", (new BlockStairs(block2, 0)).c("STAIRSSANDSTONE"));
        REGISTRY.a(134, "SPRUCE_STAIRS", (new BlockStairs(block1, 1)).c("STAIRSWOODSPRUCE"));
        REGISTRY.a(135, "BIRCH_STAIRS", (new BlockStairs(block1, 2)).c("STAIRSWOODBIRCH"));
        REGISTRY.a(136, "JUNGLE_STAIRS", (new BlockStairs(block1, 3)).c("STARISWOODJUNGLE"));
        REGISTRY.a(139, "COBBLEWALL", (new BlockCobbleWall(block)).c("STONEWALL"));
        REGISTRY.a(141, "CARROT_BLOCK", (new BlockCarrots()).c("CARROTS").d("CARROTS"));
        REGISTRY.a(142, "POTATO_BLOCK", (new BlockPotatoes()).c("potatoes").d("potatoes"));
        Block block9 = (new BlockQuartz()).a(i).c(0.8F).c("QUARTZBLOCK").d("QUARTZ_BLOCK");

        REGISTRY.a(155, "QUARTZ_BLOCK", block9);
        REGISTRY.a(156, "QUARTZ_STAIRS", (new BlockStairs(block9, 0)).c("STAIRS_QUARTZ"));
        REGISTRY.a(161, "LEAVES2", (new BlockLeaves2()).c("LEAVES2").d("LEAVES2"));
        REGISTRY.a(162, "LOG2", (new BlockLog2()).c("LOG").d("LOG"));
        REGISTRY.a(170, "HAY_BALE", (new BlockHay()).c(0.5F).a(h).c("HAYBLOCK").a(CreativeModeTab.b).d("HAYBLOCK"));
        REGISTRY.a(171, "CARPET", (new BlockCarpet()).c(0.1F).a(l).c("WOOLCARPET").g(0));
        REGISTRY.a(173, "COAL_BLOCK", (new Block(Material.STONE)).c(5.0F).b(10.0F).a(i).c("BLOCKCOAL").a(CreativeModeTab.b).d("COAL_BLOCK"));
        Iterator iterator = REGISTRY.iterator();

        while (iterator.hasNext()) {
            Block block10 = (Block) iterator.next();

            if (block10.material == Material.AIR) {
                block10.u = false;
            } else {
                boolean flag = false;
                boolean flag1 = block10.b() == 10;
                boolean flag2 = block10 instanceof BlockStepAbstract;
                boolean flag3 = block10 == block4;
                boolean flag4 = block10.s;
                boolean flag5 = block10.r == 0;

                if (flag1 || flag2 || flag3 || flag4 || flag5) {
                    flag = true;
                }

                block10.u = flag;
            }
        }
    }

    protected Block(Material material) {
        this.stepSound = e;
        this.I = 1.0F;
        this.frictionFactor = 0.6F;
        this.material = material;
        this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        this.q = this.c();
        this.r = this.c() ? 255 : 0;
        this.s = !material.blocksLight();
    }

    protected Block a(StepSound stepsound) {
        this.stepSound = stepsound;
        return this;
    }

    protected Block g(int i) {
        this.r = i;
        return this;
    }

    protected Block a(float f) {
        this.t = (int) (15.0F * f);
        return this;
    }

    protected Block b(float f) {
        this.durability = f * 3.0F;
        return this;
    }

    public boolean r() {
        return this.material.k() && this.d() && !this.isPowerSource();
    }

    public boolean d() {
        return true;
    }

    public boolean b(IBlockAccess iblockaccess, int i, int j, int k) {
        return !this.material.isSolid();
    }

    public int b() {
        return 0;
    }

    protected Block c(float f) {
        this.strength = f;
        if (this.durability < f * 5.0F) {
            this.durability = f * 5.0F;
        }

        return this;
    }

    protected Block s() {
        this.c(-1.0F);
        return this;
    }

    public float f(World world, int i, int j, int k) {
        return this.strength;
    }

    protected Block a(boolean flag) {
        this.z = flag;
        return this;
    }

    public boolean isTicking() {
        return this.z;
    }

    public boolean isTileEntity() {
        return this.isTileEntity;
    }

    protected final void a(float f, float f1, float f2, float f3, float f4, float f5) {
        this.minX = (double) f;
        this.minY = (double) f1;
        this.minZ = (double) f2;
        this.maxX = (double) f3;
        this.maxY = (double) f4;
        this.maxZ = (double) f5;
    }

    public boolean d(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return iblockaccess.getType(i, j, k).getMaterial().isBuildable();
    }

    public void a(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, List list, Entity entity) {
        AxisAlignedBB axisalignedbb1 = this.a(world, i, j, k);

        if (axisalignedbb1 != null && axisalignedbb.b(axisalignedbb1)) {
            list.add(axisalignedbb1);
        }
    }

    public AxisAlignedBB a(World world, int i, int j, int k) {
        return AxisAlignedBB.a().a((double) i + this.minX, (double) j + this.minY, (double) k + this.minZ, (double) i + this.maxX, (double) j + this.maxY, (double) k + this.maxZ);
    }

    public boolean c() {
        return true;
    }

    public boolean a(int i, boolean flag) {
        return this.v();
    }

    public boolean v() {
        return true;
    }

    public void a(World world, int i, int j, int k, Random random) {}

    public void postBreak(World world, int i, int j, int k, int l) {}

    public void doPhysics(World world, int i, int j, int k, Block block) {}

    public int a(World world) {
        return 10;
    }

    public void onPlace(World world, int i, int j, int k) {}

    public void remove(World world, int i, int j, int k, Block block, int l) {}

    public int a(Random random) {
        return 1;
    }

    public Item getDropType(int i, Random random, int j) {
        return Item.getItemOf(this);
    }

    public float getDamage(EntityHuman entityhuman, World world, int i, int j, int k) {
        float f = this.f(world, i, j, k);

        return f < 0.0F ? 0.0F : (!entityhuman.a(this) ? entityhuman.a(this, false) / f / 100.0F : entityhuman.a(this, true) / f / 30.0F);
    }

    public final void b(World world, int i, int j, int k, int l, int i1) {
        this.dropNaturally(world, i, j, k, l, 1.0F, i1);
    }

    public void dropNaturally(World world, int i, int j, int k, int l, float f, int i1) {
        if (!world.isStatic) {
            int j1 = this.getDropCount(i1, world.random);

            for (int k1 = 0; k1 < j1; ++k1) {
                // CraftBukkit - <= to < to allow for plugins to completely disable block drops from explosions
                if (world.random.nextFloat() < f) {
                    Item item = this.getDropType(l, world.random, i1);

                    if (item != null) {
                        this.a(world, i, j, k, new ItemStack(item, 1, this.getDropData(l)));
                    }
                }
            }
        }
    }

    protected void a(World world, int i, int j, int k, ItemStack itemstack) {
        if (!world.isStatic && world.getGameRules().getBoolean("doTileDrops")) {
            float f = 0.7F;
            double d0 = (double) (world.random.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
            double d1 = (double) (world.random.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
            double d2 = (double) (world.random.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
            EntityItem entityitem = new EntityItem(world, (double) i + d0, (double) j + d1, (double) k + d2, itemstack);

            entityitem.pickupDelay = 10;
            world.addEntity(entityitem);
        }
    }

    protected void dropExperience(World world, int i, int j, int k, int l) {
        if (!world.isStatic) {
            while (l > 0) {
                int i1 = EntityExperienceOrb.getOrbValue(l);

                l -= i1;
                world.addEntity(new EntityExperienceOrb(world, (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D, i1));
            }
        }
    }

    public int getDropData(int i) {
        return 0;
    }

    public float a(Entity entity) {
        return this.durability / 5.0F;
    }

    public MovingObjectPosition a(World world, int i, int j, int k, Vec3D vec3d, Vec3D vec3d1) {
        this.updateShape(world, i, j, k);
        vec3d = vec3d.add((double) (-i), (double) (-j), (double) (-k));
        vec3d1 = vec3d1.add((double) (-i), (double) (-j), (double) (-k));
        Vec3D vec3d2 = vec3d.b(vec3d1, this.minX);
        Vec3D vec3d3 = vec3d.b(vec3d1, this.maxX);
        Vec3D vec3d4 = vec3d.c(vec3d1, this.minY);
        Vec3D vec3d5 = vec3d.c(vec3d1, this.maxY);
        Vec3D vec3d6 = vec3d.d(vec3d1, this.minZ);
        Vec3D vec3d7 = vec3d.d(vec3d1, this.maxZ);

        if (!this.a(vec3d2)) {
            vec3d2 = null;
        }

        if (!this.a(vec3d3)) {
            vec3d3 = null;
        }

        if (!this.b(vec3d4)) {
            vec3d4 = null;
        }

        if (!this.b(vec3d5)) {
            vec3d5 = null;
        }

        if (!this.c(vec3d6)) {
            vec3d6 = null;
        }

        if (!this.c(vec3d7)) {
            vec3d7 = null;
        }

        Vec3D vec3d8 = null;

        if (vec3d2 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d2) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d2;
        }

        if (vec3d3 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d3) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d3;
        }

        if (vec3d4 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d4) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d4;
        }

        if (vec3d5 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d5) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d5;
        }

        if (vec3d6 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d6) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d6;
        }

        if (vec3d7 != null && (vec3d8 == null || vec3d.distanceSquared(vec3d7) < vec3d.distanceSquared(vec3d8))) {
            vec3d8 = vec3d7;
        }

        if (vec3d8 == null) {
            return null;
        } else {
            byte b0 = -1;

            if (vec3d8 == vec3d2) {
                b0 = 4;
            }

            if (vec3d8 == vec3d3) {
                b0 = 5;
            }

            if (vec3d8 == vec3d4) {
                b0 = 0;
            }

            if (vec3d8 == vec3d5) {
                b0 = 1;
            }

            if (vec3d8 == vec3d6) {
                b0 = 2;
            }

            if (vec3d8 == vec3d7) {
                b0 = 3;
            }

            return new MovingObjectPosition(i, j, k, b0, vec3d8.add((double) i, (double) j, (double) k));
        }
    }

    private boolean a(Vec3D vec3d) {
        return vec3d == null ? false : vec3d.d >= this.minY && vec3d.d <= this.maxY && vec3d.e >= this.minZ && vec3d.e <= this.maxZ;
    }

    private boolean b(Vec3D vec3d) {
        return vec3d == null ? false : vec3d.c >= this.minX && vec3d.c <= this.maxX && vec3d.e >= this.minZ && vec3d.e <= this.maxZ;
    }

    private boolean c(Vec3D vec3d) {
        return vec3d == null ? false : vec3d.c >= this.minX && vec3d.c <= this.maxX && vec3d.d >= this.minY && vec3d.d <= this.maxY;
    }

    public void wasExploded(World world, int i, int j, int k, Explosion explosion) {}

    public boolean canPlace(World world, int i, int j, int k, int l, ItemStack itemstack) {
        return this.canPlace(world, i, j, k, l);
    }

    public boolean canPlace(World world, int i, int j, int k, int l) {
        return this.canPlace(world, i, j, k);
    }

    public boolean canPlace(World world, int i, int j, int k) {
        return world.getType(i, j, k).material.isReplaceable();
    }

    public boolean interact(World world, int i, int j, int k, EntityHuman entityhuman, int l, float f, float f1, float f2) {
        return false;
    }

    public void b(World world, int i, int j, int k, Entity entity) {}

    public int getPlacedData(World world, int i, int j, int k, int l, float f, float f1, float f2, int i1) {
        return i1;
    }

    public void attack(World world, int i, int j, int k, EntityHuman entityhuman) {}

    public void a(World world, int i, int j, int k, Entity entity, Vec3D vec3d) {}

    public void updateShape(IBlockAccess iblockaccess, int i, int j, int k) {}

    public final double x() {
        return this.minX;
    }

    public final double y() {
        return this.maxX;
    }

    public final double z() {
        return this.minY;
    }

    public final double A() {
        return this.maxY;
    }

    public final double B() {
        return this.minZ;
    }

    public final double C() {
        return this.maxZ;
    }

    public int b(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return 0;
    }

    public boolean isPowerSource() {
        return false;
    }

    public void a(World world, int i, int j, int k, Entity entity) {}

    public int c(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return 0;
    }

    public void g() {}

    public void a(World world, EntityHuman entityhuman, int i, int j, int k, int l) {
        entityhuman.a(StatisticList.C[b(this)], 1);
        entityhuman.a(0.025F);
        if (this.E() && EnchantmentManager.hasSilkTouchEnchantment(entityhuman)) {
            ItemStack itemstack = this.j(l);

            if (itemstack != null) {
                this.a(world, i, j, k, itemstack);
            }
        } else {
            int i1 = EnchantmentManager.getBonusBlockLootEnchantmentLevel(entityhuman);

            this.b(world, i, j, k, l, i1);
        }
    }

    protected boolean E() {
        return this.d() && !this.isTileEntity;
    }

    protected ItemStack j(int i) {
        int j = 0;
        Item item = Item.getItemOf(this);

        if (item != null && item.n()) {
            j = i;
        }

        return new ItemStack(item, 1, j);
    }

    public int getDropCount(int i, Random random) {
        return this.a(random);
    }

    public boolean j(World world, int i, int j, int k) {
        return true;
    }

    public void postPlace(World world, int i, int j, int k, EntityLiving entityliving, ItemStack itemstack) {}

    public void postPlace(World world, int i, int j, int k, int l) {}

    public Block c(String s) {
        this.name = s;
        return this;
    }

    public String getName() {
        return LocaleI18n.get(this.a() + ".name");
    }

    public String a() {
        return "tile." + this.name;
    }

    public boolean a(World world, int i, int j, int k, int l, int i1) {
        return false;
    }

    public boolean G() {
        return this.y;
    }

    protected Block H() {
        this.y = false;
        return this;
    }

    public int h() {
        return this.material.getPushReaction();
    }

    public void a(World world, int i, int j, int k, Entity entity, float f) {}

    public int getDropData(World world, int i, int j, int k) {
        return this.getDropData(world.getData(i, j, k));
    }

    public Block a(CreativeModeTab creativemodetab) {
        this.creativeTab = creativemodetab;
        return this;
    }

    public void a(World world, int i, int j, int k, int l, EntityHuman entityhuman) {}

    public void f(World world, int i, int j, int k, int l) {}

    public void l(World world, int i, int j, int k) {}

    public boolean L() {
        return true;
    }

    public boolean a(Explosion explosion) {
        return true;
    }

    public boolean c(Block block) {
        return this == block;
    }

    public static boolean a(Block block, Block block1) {
        return block != null && block1 != null ? (block == block1 ? true : block.c(block1)) : false;
    }

    public boolean M() {
        return false;
    }

    public int g(World world, int i, int j, int k, int l) {
        return 0;
    }

    protected Block d(String s) {
        this.d = s;
        return this;
    }

    // START
    public int getExpDrop(World world, int data, int enchantmentLevel) {
        return 0;
    }
    // END
}
