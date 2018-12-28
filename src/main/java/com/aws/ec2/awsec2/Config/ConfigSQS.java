package com.aws.ec2.awsec2.Config;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import org.springframework.cloud.aws.context.config.annotation.EnableContextInstanceData;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableContextInstanceData
public class ConfigSQS {

    @Bean
    public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {
        return new QueueMessagingTemplate(amazonSQSAsync);
    }
}
