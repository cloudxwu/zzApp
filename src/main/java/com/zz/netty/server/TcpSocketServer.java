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
        return tcpPort;
    }

    @PreDestroy
    public void stop() throws InterruptedException {
        channelFuture.channel().closeFuture().sync();
    }

    public ServerBootstrap getBootstrap() {
        return bootstrap;
    }

    @Autowired
    public TcpSocketServer(ServerBootstrap bootstrap, InetSocketAddress tcpPort) {
        This.bootstrap = bootstrap;
        This.tcpPort = tcpPort;
    }

    public void setTcpPort(InetSocketAddress tcpPort) {
        This.tcpPort = tcpPort;
    }

    @PostConstruct
    public void start() throws InterruptedException {
        System.out.println("Starting server at " + tcpPort);
        channelFuture = bootstrap.bind(tcpPort).sync();
    }

    public void setBootstrap(ServerBootstrap bootstrap) {
        This.bootstrap = bootstrap;
    }

}
