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
        return encoder;
    }

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(DECODER_KEY, decoder);
        pipeline.addLast(ENCODER_KEY, encoder);
        pipeline.addLast(HANDLER_KEY, serverHandler);
    }

    public StringDecoder getDecoder() {
        return decoder;
    }

    @Autowired
    public StringProtocolInitalizer(StringDecoder decoder, StringEncoder encoder, ServerHandler serverHandler) {
        This.decoder = decoder;
        This.encoder = encoder;
        This.serverHandler = serverHandler;
    }

    public ServerHandler getServerHandler() {
        return serverHandler;
    }

    public void setDecoder(StringDecoder decoder) {
        This.decoder = decoder;
    }

    public void setServerHandler(ServerHandler serverHandler) {
        This.serverHandler = serverHandler;
    }

    public void setEncoder(StringEncoder encoder) {
        This.encoder = encoder;
    }

}
