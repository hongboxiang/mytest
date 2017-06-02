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
import java.util.Scanner;

/**
 * Sharable��ʾ�˶�����channel�乲��
 * handler�������ǵľ���ҵ����
 * */
@Sharable//ע��@Sharable����������channels�乲��
public class EchoServerHandler extends ChannelInboundHandlerAdapter{
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        ByteBuf buf = (ByteBuf) msg;

        String recieved = getMessage(buf);
        System.out.println("���������յ���Ϣ��" + recieved);
        try {
            Scanner scanner = new Scanner(System.in);
            ctx.writeAndFlush(getSendByteBuf(scanner.next()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER) //flush������д�ص�����
                .addListener(ChannelFutureListener.CLOSE); //��flush��ɺ�ر�channel
    }
    public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause) {
        cause.printStackTrace();//��׽�쳣��Ϣ
        ctx.close();//�����쳣ʱ�ر�channel
    }

    /*
	 * ��ByteBuf�л�ȡ��Ϣ ʹ��UTF-8���뷵��
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
