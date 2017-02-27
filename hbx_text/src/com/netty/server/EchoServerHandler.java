package com.netty.server;

/**
 * Created by 10180885 on 2017/1/5.
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.util.CharsetUtil;

import java.io.UnsupportedEncodingException;

/**
 * Sharable表示此对象在channel间共享
 * handler类是我们的具体业务类
 * */
@Sharable//注解@Sharable可以让它在channels间共享
public class EchoServerHandler extends ChannelInboundHandlerAdapter{
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        ByteBuf buf = (ByteBuf) msg;

        String recieved = getMessage(buf);
        System.out.println("服务器接收到消息：" + recieved);
        try {
            ctx.writeAndFlush(getSendByteBuf("APPLE"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER) //flush掉所有写回的数据
                .addListener(ChannelFutureListener.CLOSE); //当flush完成后关闭channel
    }
    public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause) {
        cause.printStackTrace();//捕捉异常信息
        ctx.close();//出现异常时关闭channel
    }

    /*
	 * 从ByteBuf中获取信息 使用UTF-8编码返回
	 */
    private String getMessage(ByteBuf buf) {

        byte[] con = new byte[buf.readableBytes()];
        buf.readBytes(con);
        return new String(con, CharsetUtil.UTF_8);
    }

    private ByteBuf getSendByteBuf(String message)
            throws UnsupportedEncodingException {

        byte[] req = message.getBytes("UTF-8");
        ByteBuf pingMessage = Unpooled.buffer();
        pingMessage.writeBytes(req);

        return pingMessage;
    }
}
