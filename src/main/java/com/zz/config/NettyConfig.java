package java.com.zz.config;

import java.util.HashMap;
import io.netty.bootstrap.ServerBootstrap;
import java.util.Map;
import java.util.Set;
import java.net.InetSocketAddress;
import io.netty.channel.ChannelOption;
import io.netty.handler.codec.string.StringDecoder;
import org.springframework.context.annotation.Configuration;
import java.com.zz.netty.handlers.ServerHandler;
import org.springframework.context.annotation.ComponentScan;
import java.com.zz.netty.handlers.StringProtocolInitalizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import io.netty.handler.codec.string.StringEncoder;
import org.springframework.context.annotation.Bean;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

@Configuration
@ComponentScan(basePackages = {"java.com.zz.netty"})
public class NettyConfig { 
    private static final boolean KEEP_ALIVE = true;
    private static final int BACK_LOG = 100;
    private static final int BOSS_COUNT = 2;
    private static final int WORKER_COUNT = 2;
    private static final int TCP_PORT = 8090;

    /**
     * 初始化服务器字符串协议
     * @author ZhaoLeiMing@zz.com
     * @param decoder 编码器
     * @param encoder 解码器
     * @param serverHandler 服务处理器
     * @return 协议对象
     */
    @Bean
    public StringProtocolInitalizer protocolInitalizer(StringDecoder decoder, StringEncoder encoder, ServerHandler serverHandler) {
    }

    @Bean(destroyMethod = "shutdownGracefully")
    public NioEventLoopGroup workerGroup() {
    }

}
