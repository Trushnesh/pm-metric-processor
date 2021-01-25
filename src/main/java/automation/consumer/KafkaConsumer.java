package automation.consumer;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import automation.metrics.ApplicationMetrics;
import automation.pojos.Device;


@Component
public class KafkaConsumer {
	
    @Autowired
    ApplicationMetrics metrics;

    final ObjectMapper mapper = new ObjectMapper();
	
@KafkaListener(topics = "devices", groupId = "test-consumer-group")
	public void listenGroupFoo(String message) throws IOException{
	    System.out.println(message);
	    final Device device = mapper.readValue(message, Device.class);
        metrics.processMetrics(device.getDeviceName(),new Float(device.getPowerConsumption()));
        }
}

