package java.com.zz.netty.server;

import java.net.InetSocketAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;
import io.netty.bootstrap.ServerBootstrap;
import javax.annotation.PostConstruct;
import io.netty.channel.ChannelFuture;

/**
 * @author YangFanFei@zz.com
 * @ClassName: TcpSocketServer
 */
@Component
public class TcpSocketServer { 
    private ServerBootstrap bootstrap;
    private ChannelFuture channelFuture;
    private InetSocketAddress tcpPort;

    public InetSocketAddress getTcpPort() {
    }

    @PreDestroy
    public void stop() throws InterruptedException {
    }

    public ServerBootstrap getBootstrap() {
    }

}
