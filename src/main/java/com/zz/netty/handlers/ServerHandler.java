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
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
    }

}
