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

import java.util.Scanner;

@Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {
    private  ByteBuf firstMessage;
    /**
     *�˷����������ӵ��������󱻵���
     * */
    public void channelActive(ChannelHandlerContext ctx) {
        Scanner scanner = new Scanner(System.in);
        ctx.writeAndFlush(Unpooled.copiedBuffer(scanner.next(), CharsetUtil.UTF_8));
    }
    /**
     *�˷������ڽ��յ����������ݺ����
     * */
    public void channelRead0(ChannelHandlerContext ctx, ByteBuf in) {
        String rev = getMessage(in);
        System.out.println("�ͻ����յ�����������: " +rev);
    }
    /**
     *��׽���쳣
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

