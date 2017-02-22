package diskblocks;

import java.io.IOException;
import java.io.RandomAccessFile;

public class DiskUnit {
	private final int DEFAULT_CAPACITY = 1024;  // default number of blocks 	
	private final int DEFAULT_BLOCK_SIZE = 256; // default number of bytes per block
	private int capacity = DEFAULT_CAPACITY;     	// number of blocks of current disk instance
	private int blockSize = DEFAULT_BLOCK_SIZE; 	// size of each block of current disk instance

	// the file representing the simulated  disk, where all the disk blocks
	// are stored
	private RandomAccessFile disk;
	
	// the constructor -- PRIVATE
	/**
	    @param name is the name of the disk
	 **/
	private DiskUnit(String name) {
		try {
			disk = new RandomAccessFile(name, "rw");
		}
		catch (IOException e) {
			System.err.println ("Unable to start the disk");
			System.exit(1);
		}
	}


	/** Simulates shutting-off the disk. Just closes the corresponding RAF. **/
	public void shutdown() {
		try {
			disk.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**writes the content of block b into the disk block corresponding to blocknum. Throw exception if the block number is not valid for the current
	 *instance, and if b does not represent a valid disk block for the current disk instance.
	 **/
	public void write(int blockNum, VirtualDiskBlock b) throws InvalidBlockNumberException, InvalidBlockException {
		disk.write(b.block);
	}

	/**reads a given block from the disk. 'b' must reference an existing instance of VirtualDiskBlock
	 */
	public void read(int blockNum, VirtualDiskBlock b) throws InvalidBlockNumberException, InvalidBlockException {
		disk.read(b.block);
	}

	/**returns nonnegative integer value corresponding to the number of valid blocks (unused + used) that the current disk instance has.
	 */
	public int getCapacity(){
		return 0;
	}

	/**returns nonnegative integer value which corresponds to the size of a block in the curren disk instance (number of character elements)

	 */
	public int getBlockSize(){
		return 0;
	}

	/**Formats the disk. This operation visits every "physical block" in the disk and fills with zeroes all those that are valid

	 */public void lowLevelFormat(){

	 }

	 /**turns off the current disk unit. It saves all data needed in order for the same content of the disk to be available whenever the disk is activated in the future
	  */
	 public void shudown(){

	 }

	 /**
	  * Turns on an existing disk unit whose name is given. If successful, it makes
	  * the particular disk unit available for operations suitable for a disk unit.
	  * @param name the name of the disk unit to activate
	  * @return the corresponding DiskUnit object
	  * @throws NonExistingDiskException whenever no
	  *    ¨disk¨ with the specified name is found.
	  */
	 public static DiskUnit mount(String name) throws NonExistingDiskException {

	 }

	 /***
	  * Creates a new disk unit with the given name. The disk is formatted
	  * as having default capacity (number of blocks), each of default
	  * size (number of bytes). Those values are: DEFAULT_CAPACITY and
	  * DEFAULT_BLOCK_SIZE. The created disk is left as in off mode.
	  * @param name the name of the file that is to represent the disk.
	  * @throws ExistingDiskException whenever the name attempted is
	  * already in use.
	  */

	 public static void createDiskUnit(String name) throws ExistingDiskException {

	 }

	 /**
	  * Creates a new disk unit with the given name. The disk is formatted
	  * as with the specified capacity (number of blocks), each of specified
	  * size (number of bytes).  The created disk is left as in off mode.
	  * @param name the name of the file that is to represent the disk.
	  * @param capacity number of blocks in the new disk
	  * @param blockSize size per block in the new disk
	  * @throws ExistingDiskException whenever the name attempted is
	  * already in use.
	  * @throws InvalidParameterException whenever the values for capacity
	  *  or blockSize are not valid according to the specifications
	  */
	 public static void createDiskUnit(String name, int capacity, int blockSize) throws ExistingDiskException, InvalidParameterException {

	 }

	 private static void reserveDiskSpace(RandomAccessFile disk, int capacity, int blockSize) { 

	 }


}
