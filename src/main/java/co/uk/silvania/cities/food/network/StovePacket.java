package co.uk.silvania.cities.food.network;

import co.uk.silvania.cities.core.CityConfig;
import co.uk.silvania.cities.food.blocks.utensils.ContainerStoveHob;
import co.uk.silvania.cities.food.blocks.utensils.StoveEntity;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class StovePacket implements IMessage {
	
	public static int hob1Setting;
	public static int hob2Setting;
	public static int hob3Setting;
	public static int hob4Setting;
	
	public StovePacket() {}
	
	public StovePacket(int h1, int h2, int h3, int h4) {
		hob1Setting = h1;
		hob2Setting = h2;
		hob3Setting = h3;
		hob4Setting = h4;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		hob1Setting = ByteBufUtils.readVarInt(buf, 2);
		hob2Setting = ByteBufUtils.readVarInt(buf, 2);
		hob3Setting = ByteBufUtils.readVarInt(buf, 2);
		hob4Setting = ByteBufUtils.readVarInt(buf, 2);
	}
	
	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeVarInt(buf, hob1Setting, 2);
		ByteBufUtils.writeVarInt(buf, hob2Setting, 2);
		ByteBufUtils.writeVarInt(buf, hob3Setting, 2);
		ByteBufUtils.writeVarInt(buf, hob4Setting, 2);
	}
	
	public static class Handler implements IMessageHandler<StovePacket, IMessage> {
		
		@Override
		public IMessage onMessage(StovePacket message, MessageContext ctx) {
			if (CityConfig.debugMode) {
				System.out.println("Packet recieved from client regarding stove temps");
				System.out.println("Hob 1: " + message.hob1Setting);
				System.out.println("Hob 2: " + message.hob2Setting);
				System.out.println("Hob 3: " + message.hob3Setting);
				System.out.println("Hob 4: " + message.hob4Setting);
			}
			
			EntityPlayer player = ctx.getServerHandler().playerEntity;
			World world = player.worldObj;
			
			if (player.openContainer instanceof ContainerStoveHob) {
				ContainerStoveHob container = (ContainerStoveHob) player.openContainer;
				StoveEntity stove = container.te;
				
				if (stove != null) {
					stove.hob1Setting = hob1Setting;
					stove.hob2Setting = hob2Setting;
					stove.hob3Setting = hob3Setting;
					stove.hob4Setting = hob4Setting;
					
					stove.getDescriptionPacket();
				}
			}
			
			return null;
		}
	}

}
