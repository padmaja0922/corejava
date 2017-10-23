/**
 * 
 */
package com.bcj.inventoryCurd.entity;

/**
 * @author Boot Camp User 008
 *
 */
public class Food {

	private int shelfLife;
	private String desc;
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Food [shelfLife=" + shelfLife + ", desc=" + desc + "]";
	}
	/**
	 * 
	 */
	public Food() {
		super();
	}
	/**
	 * @param shelfLife
	 * @param desc
	 */
	public Food(int shelfLife, String desc) {
		super();
		this.shelfLife = shelfLife;
		this.desc = desc;
	}
	/**
	 * @return the shelfLife
	 */
	public int getShelfLife() {
		return shelfLife;
	}
	/**
	 * @param shelfLife the shelfLife to set
	 */
	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
