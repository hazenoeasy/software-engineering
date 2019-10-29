package vo;

import java.io.Serializable;

import common.RoomType;
import po.HotelTypeRoomPo;

/**
 * @version 2016/12/03
 * @author 金灵益
 * @description 酒店总体拥有的房间类型，每种房间类型拥有数量，原始价格属性
 */
public class HotelTypeRoomVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private RoomType type;
	private int number;            //房间数量
	private int price;
	
	public HotelTypeRoomVo(HotelTypeRoomPo po){
		this.type = po.getType();
		this.number = po.getNumOfTypeRoom();
		this.price = po.getPrice();
	}
	
	public RoomType getType(){
		return type;
	}
	
	public int getNumOfTypeRoom(){
		return number;
	}
	
	public int getPrice(){
		return price;
	}
}