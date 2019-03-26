package its_meow.betteranimalsplus.common.entity;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public abstract class EntityAnimalWithTypes extends EntityAnimal implements IVariantTypes {

    protected static final DataParameter<Integer> TYPE_NUMBER = EntityDataManager.<Integer>createKey(EntityAnimalWithTypes.class, DataSerializers.VARINT);
    
    public EntityAnimalWithTypes(EntityType<? extends Entity> entityType, World worldIn) {
        super(entityType, worldIn);
    }
    
    @Override
    protected void registerData() {
        super.registerData();
        this.registerTypeKey();
    }
    
    @Override
    public boolean writeUnlessRemoved(NBTTagCompound compound) {
        this.writeType(compound);
        return super.writeUnlessRemoved(compound);
    }

    @Override
    public void read(NBTTagCompound compound) {
        super.read(compound);
        this.readType(compound);
    }

    @Override
    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata, NBTTagCompound compound) {
        return this.initData(super.onInitialSpawn(difficulty, livingdata, compound));
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        if(!(ageable instanceof IVariantTypes)) return null;
        return (EntityAgeable) getBaseChild().setType(this.getOffspringType(this, (IVariantTypes) ageable));
    }
    
    protected abstract IVariantTypes getBaseChild();
    
    @Override
    public boolean isChildI() {
        return this.isChild();
    }

    @Override
    public Random getRNGI() {
        return this.getRNG();
    }

    @Override
    public EntityDataManager getDataManagerI() {
        return this.getDataManager();
    }

    @Override
    public DataParameter<Integer> getDataKey() {
        return TYPE_NUMBER;
    }
    
}