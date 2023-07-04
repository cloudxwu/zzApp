package java.com.zz.netty.handlers;

import java.net.InetAddress;
import io.netty.channel.ChannelHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.channel.ChannelHandlerContext;
import org.springframework.stereotype.Component;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author YangFanFei@zz.com
 * @ClassName: ServerHandler
 */
@Component
@ChannelHandler.Sharable
public class ServerHandler { 
    private static final Logger LOGGER = LoggerFactory.getLogger(ServerHandler.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        LOGGER.info("Remote Address : " + ctx.channel().remoteAddress() + " active !");
        ctx.channel().writeAndFlush("Welcome to " + InetAddress.getLocalHost().getHostName() + " service!\n");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        LOGGER.info(ctx.channel().id() + " Channel is disconnected");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        LOGGER.info("Client Msg: " + msg);
        String clientIdToLong = ctx.channel().id().asLongText();
        LOGGER.info("Client Long ID: " + clientIdToLong);
        String clientIdToShort = ctx.channel().id().asShortText();
        LOGGER.info("Client Short ID: " + clientIdToLong);
        if (msg.contains("bye")) 
        {
            ctx.channel().close();
        }
    }

}
