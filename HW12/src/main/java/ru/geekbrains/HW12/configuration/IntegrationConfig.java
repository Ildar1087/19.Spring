package ru.geekbrains.HW12.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.GenericTransformer;
import org.springframework.integration.file.FileWritingMessageHandler;
import org.springframework.integration.file.support.FileExistsMode;
import org.springframework.messaging.MessageChannel;

import java.io.File;

@Configuration
public class IntegrationConfig {

    @Bean
    public MessageChannel textInputChanel(){
        return new DirectChannel();
    }

    @Bean
    public MessageChannel fileWriteChanel(){
        return new DirectChannel();
    }

    @Bean
    @Transformer(inputChannel = "textInputChanel", outputChannel = "fileWriterChanal")
    public GenericTransformer<String,String> mainTransformer(){
        return text ->{
            // какая-то логика
            return text;
        };
    }

    @Bean
    @ServiceActivator(inputChannel = "fileWriterChanel")
    public FileWritingMessageHandler messageHandler(){
        FileWritingMessageHandler  handler= new FileWritingMessageHandler(
                new File("D:/учёба GEEK BRAINS/Фреймворк Spring/12.Les_Sem(Patterni_proektirovaniya_i_GoF_patterny_v_Spring_prilojenii)/HW12/files"));
        handler.setExpectReply(false);
        handler.setFileExistsMode(FileExistsMode.APPEND);
        handler.setAppendNewLine(true);

        return handler;

    }

}
