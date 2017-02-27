package com.netty.client;

/**
 * Created by 10180885 on 2017/1/5.
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.util.CharsetUtil;

@Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {
    private  ByteBuf firstMessage;
    /**
     *此方法会在连接到服务器后被调用
     * */
    public void channelActive(ChannelHandlerContext ctx) {
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8));
    }
    /**
     *此方法会在接收到服务器数据后调用
     * */
    public void channelRead0(ChannelHandlerContext ctx, ByteBuf in) {
        String rev = getMessage(in);
        System.out.println("客户端收到服务器数据: " +rev);
    }
    /**
     *捕捉到异常
     * */
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    private String getMessage(ByteBuf buf) {
        byte[] con = new byte[buf.readableBytes()];
        buf.readBytes(con);
        return new String(con, CharsetUtil.UTF_8);
    }

}

