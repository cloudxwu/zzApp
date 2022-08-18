package java.com.zz.netty.handlers;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import org.springframework.beans.factory.annotation.Qualifier;
import io.netty.channel.socket.SocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.codec.string.StringDecoder;

/**
 * @author ZhaoLeiMing@zz.com
 * @ClassName: StringProtocolInitalizer
 */
@Component
@Qualifier("springProtocolInitializer")
public class StringProtocolInitalizer { 
    private static final String ENCODER_KEY = "encoder";
    private static final String DECODER_KEY = "decoder";
    private StringDecoder decoder;
    private ServerHandler serverHandler;
    private static final String HANDLER_KEY = "handler";
    private StringEncoder encoder;

    public StringEncoder getEncoder() {
    }

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
    }

}
