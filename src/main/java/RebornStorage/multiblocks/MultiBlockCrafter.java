package RebornStorage.multiblocks;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import reborncore.common.multiblock.IMultiblockPart;
import reborncore.common.multiblock.MultiblockControllerBase;
import reborncore.common.multiblock.rectangular.RectangularMultiblockControllerBase;

/**
 * Created by Mark on 03/01/2017.
 */
public class MultiBlockCrafter extends RectangularMultiblockControllerBase {
	public MultiBlockCrafter(World world) {
		super(world);
	}

	@Override
	public void onAttachedPartWithMultiblockData(IMultiblockPart iMultiblockPart, NBTTagCompound nbtTagCompound) {

	}

	@Override
	protected void onBlockAdded(IMultiblockPart iMultiblockPart) {

	}

	@Override
	protected void onBlockRemoved(IMultiblockPart iMultiblockPart) {

	}

	@Override
	protected void onMachineAssembled() {
		System.out.println("New block");
	}

	@Override
	protected void onMachineRestored() {

	}

	@Override
	protected void onMachinePaused() {

	}

	@Override
	protected void onMachineDisassembled() {
		System.out.println("Invalid");
	}

	@Override
	protected int getMinimumNumberOfBlocksForAssembledMachine() {
		return 9 * 3;
	}

	@Override
	protected int getMaximumXSize() {
		return 256;
	}

	@Override
	protected int getMaximumZSize() {
		return 256;
	}

	@Override
	protected int getMaximumYSize() {
		return 256;
	}

	@Override
	protected void onAssimilate(MultiblockControllerBase multiblockControllerBase) {
		System.out.println("hello");
	}

	@Override
	protected void onAssimilated(MultiblockControllerBase multiblockControllerBase) {

	}

	@Override
	protected boolean updateServer() {
		return true;
	}

	@Override
	protected void updateClient() {

	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTagCompound) {

	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTagCompound) {

	}

	@Override
	public void formatDescriptionPacket(NBTTagCompound nbtTagCompound) {

	}

	@Override
	public void decodeDescriptionPacket(NBTTagCompound nbtTagCompound) {

	}
}
