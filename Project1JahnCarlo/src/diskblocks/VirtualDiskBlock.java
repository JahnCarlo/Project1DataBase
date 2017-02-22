package diskblocks;

public class VirtualDiskBlock {
	private final int DEFAULT_BLOCK_SIZE = 256; // default number of bytes per block
	private int capacity = 0;
	public byte[] block;
	
	/** creates block of size equal to 256 bytes
	 */
	public VirtualDiskBlock(){
		block = new byte[DEFAULT_BLOCK_SIZE];
	}
	
	
	/** creates a block of size equal to blockCapacity
	 * @param blockCapacity number of blocks in the disk
	 */
	public VirtualDiskBlock(int blockCapacity){
		block = new byte[blockCapacity];
	}
	
	/** returns a positive integer value that corresponds to the capacity of the current instance block*/
	public int getCapacity(){
		return capacity;
	}
	
	/** changes the content of element at index to that of nuevo
	 * @param index index on block
	 * @param nuevo new byte to set
	 *  */
	public void setElement(int index, byte nuevo){
		block[index] = nuevo;
	}
	
	
	/** returns a copy of the character at the position index in the current block instance
	 * */
	public byte getElement(int index){
		return block[index];
	}
}
